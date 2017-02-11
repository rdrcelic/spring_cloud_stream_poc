package com.example;

import com.example.producer.TimeTickGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TimetickerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimetickerApplication.class, args);
	}

	@RestController
	class TimeTickController {

		@Autowired
		private TimeTickGenerator generator;

		@GetMapping("/fireTimeTick")
		public void fireTimeTick() {
			generator.sendTimeTick();
		}
	}
}
