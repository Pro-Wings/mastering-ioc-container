package com.prowings.springaop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.prowings.springaop")
@EnableAspectJAutoProxy
public class MyAopAppConfig {

}
