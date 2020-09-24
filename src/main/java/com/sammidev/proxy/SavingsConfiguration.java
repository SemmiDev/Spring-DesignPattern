package com.sammidev.proxy;

import org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ValidationAutoConfiguration.class)
@ComponentScan
public class SavingsConfiguration {
}
