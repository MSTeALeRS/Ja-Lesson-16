package ua.lviv.lgs.dao.impl;


import ua.lviv.lgs.dao.StudentDao;
import ua.lviv.lgs.domain.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    List<Student> students = new ArrayList<>();


    @Override
    public Student create(Student student) {
        students.add(student);
        return student;
    }



    @Override
    public Student read(Integer id) {
      Student student = students.get(id-1);
        return student;
    }


    @Override
    public Student update(Student student) {
        students.set(student.getId() - 1, student);
        return student;
    }

    @Override
    public void delete(Integer id) {
        students.remove(id - 1);
    }

    @Override
    public List<Student> readAll() {
        return students;
    }
}