package com.ipiecoles.java.java230.service;

import com.ipiecoles.java.java230.model.Employe;
import com.ipiecoles.java.java230.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EmployeService {

    @Autowired
    private EmployeRepository employeRepository; //private pour éviter que les gens fassent n'importe quoi dessus

    public Employe findById(long id){
        return employeRepository.findOne(id);
    }

    public Long countAllEmploye() {
        return employeRepository.count();
    }

    public void deleteEmploye(Long id) {
        employeRepository.delete(id);
    }

    public Employe creerEmploye(Employe e) {
        return employeRepository.save(e);
    }
}
