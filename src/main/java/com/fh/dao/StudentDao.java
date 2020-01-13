package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.entity.po.Student;
import com.fh.entity.vo.StudentVo;
import com.fh.entity.vo.TableSearch;

import java.util.List;

public interface StudentDao extends BaseMapper<Student> {
    long queryCount(TableSearch search);

    List<StudentVo> queryStudentList(TableSearch search);

    void updateIsdel(Integer id);


}
