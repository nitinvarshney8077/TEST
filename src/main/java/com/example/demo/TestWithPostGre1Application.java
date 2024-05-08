package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestWithPostGre1Application {

	public static void main(String[] args) {
		SpringApplication.run(TestWithPostGre1Application.class, args);
		String formattedString = 
			    "// ╔════════════════════════════════════════════════════════════════════════════════════════════════╗\n" +
			    "// ║                                                                                                    ║\n" +
			    "// ║                                                                                                    ║\n" +
			    "// ║                                                                                                    ║\n" +
			    "// ║                                                                                                    ║\n" +
			    "// ║                                \u001B[31mTestPostGre\u001B[0m                                                        ║\n" +
			    "// ║                                                                                                    ║\n" +
			    "// ║                                                                                                    ║\n" +
			    "// ║                                                                                                    ║\n" +
			    "// ║                                                                                                    ║\n" +
			    "// ╚════════════════════════════════════════════════════════════════════════════════════════════════╝";
		System.out.println(formattedString);
	}

}
