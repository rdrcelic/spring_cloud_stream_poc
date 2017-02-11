package com.example;

import com.example.producer.TimeTickSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TimetickerApplicationTests {

	@Autowired
	private TimeTickSource timeTickSource;

	@Test
	public void contextLoads() {
		assertNotNull(this.timeTickSource.timeTickChannel());
	}

}
