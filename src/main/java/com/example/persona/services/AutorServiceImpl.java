package com.example.persona.services;


import com.example.persona.entities.Autor;
import com.example.persona.repositories.AutorRepository;
import com.example.persona.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//public class AutorServiceImpl extends BaseServiceImpl<Autor,Long> {//implements AutorService{
public class AutorServiceImpl implements AutorService{
    @Override
    public List<Autor> findAll() throws Exception {
        return null;
    }

    @Override
    public Autor findById(Long aLong) throws Exception {
        return null;
    }

    @Override
    public Autor save(Autor entity) throws Exception {
        return null;
    }

    @Override
    public Autor update(Long aLong, Autor entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        return false;
    }

//    @Autowired
//    private AutorRepository autorRepository;
//
//    public AutorService(BaseRepository<Autor, Long> br){
//        super(br);
//    }
}