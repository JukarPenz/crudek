package com.demo.crudej.controller;

import com.demo.crudej.model.Alumno;
import com.demo.crudej.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("alumnosApi")
public class AlumnoApi {


    @Autowired
    AlumnoService as;

    @RequestMapping("saludar")
    public String test(){return "Got It";}

    @RequestMapping("/testAlumno")
    public String testAl(){return "Got It Alumno";}

    @GetMapping("findAll")
    public List<Alumno> findAll(){
        return as.getAlumnos();
    }

    @GetMapping("find/{id}")
    public Optional<Alumno> getAlumnoById(@PathVariable("id") Long id){
        return as.getAlumnoById(id);
    }

    @PostMapping("save")
    public Alumno saveAlumno(@RequestBody Alumno a){
        return as.saveAlumno(a);
    }

    @DeleteMapping("delete/{id}")
    public String deleteAlumnoById(@PathVariable("id") Long id){
        return as.deleteAlumno(id) ? "OK" : "ERROR";
    }

}
