package com.knownsense.springldaps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportRuntimeHints;

@SpringBootApplication
@ImportRuntimeHints(MyHint.class)
public class SpringLdapsApplication {

	public static void main(String[] args)  {
		SpringApplication.run(SpringLdapsApplication.class, args);
	}

}
