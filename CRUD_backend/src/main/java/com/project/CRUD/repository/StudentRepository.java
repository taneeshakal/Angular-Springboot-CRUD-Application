package com.project.CRUD.repository;

import com.project.CRUD.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer>{  //Crudrepo is a builtin package for doing all db communications. That is why it is extended. For Student class this crudrepo will work. Integer is the data type of student id in Student entity

    //all the builtin operations of crud repo comes to student repo
}
