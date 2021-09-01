package com.swapnilsankla.vaultdemo.repository

import com.swapnilsankla.vaultdemo.model.Student
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository: MongoRepository<Student, String>