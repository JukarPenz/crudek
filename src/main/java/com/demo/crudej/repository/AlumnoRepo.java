package com.demo.crudej.repository;

import com.demo.crudej.model.Alumno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AlumnoRepo extends CrudRepository<Alumno, Long>{

}
