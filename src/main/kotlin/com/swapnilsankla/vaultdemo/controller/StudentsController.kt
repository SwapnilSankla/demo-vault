package com.swapnilsankla.vaultdemo.controller

import com.swapnilsankla.vaultdemo.model.Student
import com.swapnilsankla.vaultdemo.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/students")
class StudentsController(
	@Autowired private val repository: StudentRepository
	) {
	@GetMapping("")
	fun get(): List<Student> {
		return repository.findAll()
	}
}
