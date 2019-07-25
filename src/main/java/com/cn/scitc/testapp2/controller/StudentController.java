package com.cn.scitc.testapp2.controller;


import com.cn.scitc.testapp2.dao.StudentDao;
import com.cn.scitc.testapp2.model.Student;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    private Log log = LogFactory.getLog(getClass());
    private @Autowired StudentDao studentDao;


    @RequestMapping("/edit")
    private String edit(Model model, Integer id){
        Student student = studentDao.findById(id).get();
        model.addAttribute("stu", student);
        return "student/edit";
    }

    @PostMapping("/update")
    private  String update(Integer id,String name,String mobile){
        Student student = studentDao.findById(id).get();
        student.setName(name);
        student.setMobile(mobile);
        studentDao.save(student);
        log.info("数据修改成功。");
        return "redirect:/student";
    }

    @RequestMapping("/delete")
    private String delete(Integer id){
        studentDao.deleteById(id);
        log.info("数据删除成功。");
        return "redirect:/student";
    }

    @RequestMapping("/new")
    private String create(){
        return "student/create";
    }

    @PostMapping("/create")
    private String createNew(String name,String mobile,String className){
        Student student = new Student();
        student.setName(name);
        student.setMobile(mobile);
        student.setClassName(className);
        studentDao.save(student);
        log.info("数据添加成功。");
        return "redirect:/student";
    }


}
