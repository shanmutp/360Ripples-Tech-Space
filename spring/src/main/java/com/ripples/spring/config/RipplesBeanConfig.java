package com.ripples.spring.config;
import com.ripples.spring.bean.Student;
import org.springframework.context.annotation.*;

@Configuration
public class RipplesBeanConfig {

	@Bean 
	   public Student helloWorld(){
	      return new Student();
	}
}
