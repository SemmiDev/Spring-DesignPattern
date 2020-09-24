package com.sammidev;

import com.sammidev.proxy.SavingsConfiguration;
import com.sammidev.proxy.SavingsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SavingsConfiguration.class)
public class SavingstServiceImplTest {

    @Autowired
    private SavingsService savingsService;

    @Test(expected = Throwable.class)
    public void testSaveValidationNotBlank() {
        savingsService.save("","");
    }


    @Test
    public void testValid() {
        savingsService.save("12345","Sammidev");
    }
}
