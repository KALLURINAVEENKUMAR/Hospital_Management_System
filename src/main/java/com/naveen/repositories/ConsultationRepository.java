package com.naveen.repositories;

import com.naveen.models.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ConsultationRepository extends JpaRepository<Consultation, Long> {

    List<Consultation> findByDoctorId(Long doctorId);

    List<Consultation> findByConsultationDateBetween(LocalDateTime startDate, LocalDateTime endDate);

    List<Consultation> findByPatientId(Long patientId);

}
