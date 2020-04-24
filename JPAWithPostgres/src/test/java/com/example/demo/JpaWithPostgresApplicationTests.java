package com.example.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Conta;

@SpringBootTest
class JpaWithPostgresApplicationTests {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	@Qualifier("corrente")
	private Conta contaCorrente;
	
	@Autowired
	@Qualifier("poupanca")
	private Conta contaPoupanca;
	
	@Test
	void contextLoads() {
		logger.info(" Conta Corrente {} ", contaCorrente.toString());
		logger.info(" Conta Poupanca {} ", contaPoupanca.toString());
		
		
	}

}
