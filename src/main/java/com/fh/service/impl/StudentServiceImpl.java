package com.fh.service.impl;

import com.fh.dao.StudentDao;
import com.fh.entity.po.Student;
import com.fh.entity.vo.DataTablesData;
import com.fh.entity.vo.StudentVo;
import com.fh.entity.vo.TableSearch;
import com.fh.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    @Override
    public void addStudent(Student student) {
        student.setIsDel(0);
        studentDao.insert(student);
    }

    @Override
    public DataTablesData queryStudentList(TableSearch search) {


            long count = studentDao.queryCount(search);
            List<StudentVo> list = studentDao.queryStudentList(search);
            DataTablesData data = new DataTablesData();
            data.setData(list);
            data.setDraw(search.getDraw());
            data.setRecordsFiltered((int)count);
            data.setRecordsTotal((int)count);
            return data;

    }

    @Override
    public void updateIsdel(Integer id) {
        studentDao.updateIsdel(id);
    }

    @Override
    public void updateStudent(Student student) {
        studentDao.updateById(student);
    }

    @Override
    public Student queryStudentById(Integer id) {
     return   studentDao.selectById(id);

    }
}
