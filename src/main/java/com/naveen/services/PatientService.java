package com.naveen.services;

import com.naveen.models.Patient;
import com.naveen.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;


    public void save(Patient patient) {
        patientRepository.save(patient);
    }


    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
}

