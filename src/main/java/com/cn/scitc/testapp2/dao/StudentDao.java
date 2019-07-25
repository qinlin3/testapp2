package com.cn.scitc.testapp2.dao;

import com.cn.scitc.testapp2.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Student, Integer> {


}
