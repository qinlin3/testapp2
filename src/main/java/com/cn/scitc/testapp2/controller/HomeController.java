package com.cn.scitc.testapp2.controller;

import com.cn.scitc.testapp2.dao.CourseDao;
import com.cn.scitc.testapp2.dao.StudentDao;
import com.cn.scitc.testapp2.dao.StudentscoreDao;
import com.cn.scitc.testapp2.model.Course;
import com.cn.scitc.testapp2.model.Student;
import com.cn.scitc.testapp2.model.Studentscore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    private @Autowired StudentDao studentDao;
    private @Autowired CourseDao courseDao;
    private @Autowired StudentscoreDao studentscoreDao;


    @GetMapping("/test")
    private String test(){
        return "test";
    }

    @GetMapping("/student")
    private String studentform(Model model){
        Iterable<Student> list = studentDao.findAll();
        model.addAttribute("list" , list);
        return "studentform";
    }

    @GetMapping("/course")
    private String courseform(Model model){
        Iterable<Course> list = courseDao.findAll();
        model.addAttribute("list" , list);
        return "courseform";
    }

    @GetMapping("/studentscore")
    private String studentscoreform(Model model){
        Iterable<Studentscore> list = studentscoreDao.findAll();
        model.addAttribute("list" , list);
        return "studentscoreform";
    }
}
