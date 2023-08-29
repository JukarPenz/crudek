package com.demo.crudej.service;

import com.demo.crudej.model.Alumno;
import com.demo.crudej.repository.AlumnoRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    AlumnoRepo alo;

    @Override
    public ArrayList<Alumno> getAlumnos() {
        return (ArrayList<Alumno>) alo.findAll();
    }

    @Override
    public Optional<Alumno> getAlumnoById(Long id) {
        return alo.findById(id);
    }

    @Override
    public Alumno saveAlumno(Alumno al) {
        return alo.save(al);
    }

    @Override
    public boolean deleteAlumno(Long id) {
        try{
            alo.deleteById(id);
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
