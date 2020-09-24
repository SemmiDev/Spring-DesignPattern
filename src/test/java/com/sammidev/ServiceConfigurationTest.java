package com.sammidev;

import com.sammidev.proxy.ServiceConfiguration;
import com.sammidev.proxy.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceConfiguration.class)
public class ServiceConfigurationTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void testProxy() {
        studentService.save("1","Sammidev");
    }
}