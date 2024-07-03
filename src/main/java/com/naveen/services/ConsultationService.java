package com.naveen.services;

import com.naveen.models.Consultation;
import com.naveen.repositories.ConsultationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ConsultationService {

    private final ConsultationRepository consultationRepository;

    @Autowired
    public ConsultationService(ConsultationRepository consultationRepository) {
        this.consultationRepository = consultationRepository;
    }

    public List<Consultation> getConsultationsByDoctorId(Long doctorId) {
        return consultationRepository.findByDoctorId(doctorId);
    }

    public List<Consultation> getConsultationsByConsultationDateRange(LocalDateTime startDate, LocalDateTime endDate) {
        return consultationRepository.findByConsultationDateBetween(startDate, endDate);
    }

    public List<Consultation> getConsultationsByPatientId(Long patientId) {
        return consultationRepository.findByPatientId(patientId);
    }

    public List<Consultation> getAllConsultations() {
        return java.util.Collections.emptyList();
    }
}
