package com.test.controller;

import com.test.model.Student;
import com.test.model.studentAddress;
import com.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
public class SingupController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/singup")
    public String registerStudent(Model model){
        Student student = new Student();
        studentAddress studentAddress = new studentAddress();

        student.setstudentAddress(studentAddress);
        

        model.addAttribute("student", student);

        return "singup";
    }


    @RequestMapping(value = "/singup", method = RequestMethod.POST)
    public String registerStudentPost(@Valid @ModelAttribute("student") Student student, BindingResult result, Model model){

        if(result.hasErrors()){
            return "singup";
        }

        List<Student> studentList = studentService.getAllStudents();

        for (int i=0; i< studentList.size(); i++){
            if(student.getstudentEmail().equals(studentList.get(i).getstudentEmail())){
                model.addAttribute("emailMsg", "Email already exists");

                return "singup";
            }

            if(student.getUsername().equals(studentList.get(i).getUsername())){
                model.addAttribute("usernameMsg", "Username already exists");

                return "singup";
            }
        }

        student.setEnabled(true);
        studentService.addStudent(student);
        return "singupSuccess";
    }

} // The End of Class;
