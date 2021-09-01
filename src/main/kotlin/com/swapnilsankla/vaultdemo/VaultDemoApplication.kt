package com.swapnilsankla.vaultdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@SpringBootApplication
@EnableMongoRepositories
class VaultDemoApplication

fun main(args: Array<String>) {
	runApplication<VaultDemoApplication>(*args)
}
