package com.cn.scitc.testapp2.dao;

import com.cn.scitc.testapp2.model.Studentscore;
import org.springframework.data.repository.CrudRepository;

public interface StudentscoreDao extends CrudRepository<Studentscore ,Integer> {
}
