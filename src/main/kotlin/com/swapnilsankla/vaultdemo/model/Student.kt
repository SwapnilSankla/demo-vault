package com.swapnilsankla.vaultdemo.model

import org.springframework.data.mongodb.core.mapping.Document

@Document("students")
data class Student(val name: String, val course: String)