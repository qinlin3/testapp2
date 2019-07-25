package com.cn.scitc.testapp2.controller;


import com.cn.scitc.testapp2.dao.CourseDao;
import com.cn.scitc.testapp2.model.Course;
import com.cn.scitc.testapp2.model.Student;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/course")
public class CourseController {
    private @Autowired CourseDao  courseDao;
    private Log log = LogFactory.getLog(getClass());

    @RequestMapping("/edit")
    private String edit(Model model, Integer id){
        Course  course = courseDao.findById(id).get();
        model.addAttribute("stu", course);
        return "course/edit";
    }

    @PostMapping("/update")
    private  String update(Integer id,String name,String courseScore){
        Course  course = courseDao.findById(id).get();
        course.setName(name);
        log.info("数据修改成功。");
        return "redirect:/student";
    }


}
