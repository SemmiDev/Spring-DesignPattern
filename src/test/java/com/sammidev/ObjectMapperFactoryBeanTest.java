package com.sammidev;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sammidev.factory.HelperConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelperConfig.class)
public class ObjectMapperFactoryBeanTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private ObjectMapper objectMapper2;

    @Test
    public void test() {
        assertSame(objectMapper, objectMapper2);
    }
}
