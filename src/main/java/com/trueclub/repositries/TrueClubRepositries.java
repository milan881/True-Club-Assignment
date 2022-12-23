package com.trueclub.repositries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trueclub.entites.Assignment;

public interface TrueClubRepositries extends JpaRepository<Assignment, Long> {

}
