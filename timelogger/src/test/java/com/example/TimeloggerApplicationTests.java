package com.example;

import com.example.handler.TimeTickTransformationProcessor;
import com.example.handler.TimeTickPersistencySink;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TimeloggerApplicationTests {

	@Autowired
	private TimeTickTransformationProcessor processor;

	@Autowired
	private TimeTickPersistencySink reframedSink;

	@Test
	public void contextLoads() {
		assertNotNull(this.processor.timeTickTransformedChannel());
		assertNotNull(this.processor.timeTickChannel());
		assertNotNull(this.reframedSink.timeTickReframedChannel());
	}

}
