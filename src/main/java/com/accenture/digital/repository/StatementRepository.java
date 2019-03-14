package com.accenture.digital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.accenture.digital.domain.Statement;

@Component
public interface StatementRepository extends JpaRepository<Statement, Long> {

}
