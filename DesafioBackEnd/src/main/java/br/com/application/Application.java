/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.application;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author perei
 */
@SpringBootApplication
@ComponentScan(basePackages = "br.com")
@EntityScan(basePackages = {"br.com"})
@EnableJpaRepositories(basePackages = {"br.com"})
public class Application {
    public static void main(String[] args) {     
        ConfigurableApplicationContext context = 
                new SpringApplicationBuilder(Application.class).headless(false).run(args);
        
        TelaCrud telaCrud =  context.getBean(TelaCrud.class);
        telaCrud .setVisible(true);    
    }
}
