package com.pluralsight.conference.repository;

import com.pluralsight.conference.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //brisemo metodu save jer ce je naslediti iz jpaRepository interfejsa
}
