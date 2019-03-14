package com.accenture.digital.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.digital.domain.Statement;
import com.accenture.digital.payload.ApiResponse;
import com.accenture.digital.repository.StatementRepository;

@RestController
@RequestMapping("api/v1/statement")
@CrossOrigin("*")
public class StatementController {

	@Autowired
	private StatementRepository repo;

	@GetMapping("test")
	public String test() {
		return "welcome";
	}

	@GetMapping("all")
	public ResponseEntity<?> getAll() {
		ApiResponse response = null;
		try {
			List<Statement> data = (List<Statement>) this.repo.findAll();
			response = new ApiResponse(data, true, "success");
		} catch (Exception e) {
			response = new ApiResponse(null, false, "failure");
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@GetMapping("{id}")
	public ResponseEntity<?> findById(@PathVariable("id") long id) {
		ApiResponse response = null;
		try {
			Optional<Statement> data = this.repo.findById(id);
			response = new ApiResponse(data, true, "success");
		} catch (Exception e) {
			response = new ApiResponse(null, false, "failure");
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
