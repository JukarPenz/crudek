package com.example.persona.services;

import com.example.persona.entities.Persona;
import com.example.persona.repositories.BaseRepository;
import com.example.persona.repositories.PersonaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service//
public class PersonaServiceImpl implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

//    public PersonaService(PersonaRepository pr){
//        this.personaRepository=pr;
//    }

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository){

//        super(baseRepository);
    }

    @Override
    public List<Persona> findAll() throws Exception {
        return null;
    }

    @Override
    public Persona findById(Long aLong) throws Exception {
        return null;
    }

    @Override
    public Persona save(Persona entity) throws Exception {
        return null;
    }

    @Override
    public Persona update(Long aLong, Persona entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        return false;
    }
}
