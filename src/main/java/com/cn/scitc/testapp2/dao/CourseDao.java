package com.cn.scitc.testapp2.dao;

import com.cn.scitc.testapp2.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<Course, Integer> {
}
