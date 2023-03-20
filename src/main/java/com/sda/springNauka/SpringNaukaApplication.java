package com.sda.springNauka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class SpringNaukaApplication {
	public static void main(String[] args) {


		//public static void main(String[] args) {
		//	SpringApplication.run(SpringNaukaApplication.class, args);
		//}
		Application application = new Application();

		application.start();
		application.end();

	}
}
