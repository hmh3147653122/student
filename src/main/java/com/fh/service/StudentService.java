package com.fh.service;

import com.fh.entity.po.Student;
import com.fh.entity.vo.DataTablesData;
import com.fh.entity.vo.TableSearch;

public interface StudentService {

    void addStudent(Student student);

    DataTablesData queryStudentList(TableSearch search);

    void updateIsdel(Integer id);

    void updateStudent(Student student);

    Student queryStudentById(Integer id);
}
