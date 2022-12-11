package com.pluralsight.conference.repository;

import com.pluralsight.conference.model.Registration;
import com.pluralsight.conference.model.RegistrationReport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
    //ove dve motede nasledjujemo uz pomoc jpaRepository interfejsa
//    Registration save(Registration registration);

//    List<Registration> findAll();

    //ovu metodu dole ne mozemo direktno iz JpaRepository nego moramo preko Query-ja
    List<RegistrationReport> registrationReport();
}
