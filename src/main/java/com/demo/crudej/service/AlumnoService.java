package com.demo.crudej.service;

import com.demo.crudej.model.Alumno;

import java.util.ArrayList;
import java.util.Optional;

public interface AlumnoService {

    ArrayList<Alumno> getAlumnos();

    Optional<Alumno> getAlumnoById(Long id);

    Alumno saveAlumno(Alumno al);

    boolean deleteAlumno(Long id);

}
