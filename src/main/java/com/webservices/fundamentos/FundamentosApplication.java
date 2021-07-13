package com.webservices.fundamentos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.webservices.fundamentos.component.ComponentDependency;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner{
	
	private ComponentDependency componentDependency;
	
	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency) {
		this.componentDependency = componentDependency;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		componentDependency.saludar();
	}

}
