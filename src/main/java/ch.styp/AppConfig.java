package ch.styp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by martin on 08.10.16.
 */

@Configuration
@EnableAutoConfiguration
@EnableWebMvc
@ComponentScan

public class AppConfig {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AppConfig.class, args);
    }

}
