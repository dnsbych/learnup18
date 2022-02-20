package ru.learnup.vtb.opersales.learnup18.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.learnup.vtb.opersales.learnup18.services.ConsoleLogger;
import ru.learnup.vtb.opersales.learnup18.services.interfaces.Logger;

//@Configuration
public class LoggerConfig {
    @Bean
    public Logger logger(){
        return new ConsoleLogger();
    }
}
