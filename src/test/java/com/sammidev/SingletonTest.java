package com.sammidev;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sammidev.singleton.Config;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Config.class)
public class SingletonTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private ObjectMapper objectMapper2;

    @Test
    public void testtingSingleton() {
        assertSame(objectMapper,objectMapper2);
    }
}
