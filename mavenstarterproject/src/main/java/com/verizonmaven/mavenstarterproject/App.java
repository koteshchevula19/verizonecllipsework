package com.verizonmaven.mavenstarterproject;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
@Configuration
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
//        Engineer engineer=context.getBean("theEngineer",Engineer.class);
//        engineer.workForWages();
//        
//       engineer=context.getBean("civilEngineer",CivilEngineer.class);
//       engineer.workForWages();
//       
//       CivilEngineer civileng1=context.getBean("civilEngineer",CivilEngineer.class);
//       CivilEngineer civileng2=context.getBean("civilEngineer",CivilEngineer.class);
//       System.out.println(civileng1==civileng2);
//       System.out.println(civileng1.hashCode());
//       System.out.println(civileng2.hashCode());
//       System.out.println(civileng1);
//       System.out.println(civileng2);
//       
//       Engineer sampleEngineer=context.getBean("sEngineer",SampleEngineer.class);
//       sampleEngineer.workForWages();
       
       ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("annotationsConfig.xml");
       Engineer engineeer = context.getBean("anEngineer", AnnotationsEngineer.class);
   
   	engineeer.workForWages();
       
       
       
    }
    
    @Bean
    List<String> getNames(){
    	return Arrays.asList("Kotesh", "Priya", "Kaushika", "Dileep", "Keerthi");
    }
}
