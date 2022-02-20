package ru.learnup.vtb.opersales.learnup18.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ru.learnup.vtb.opersales.learnup18.services.ConsoleLogger;
import ru.learnup.vtb.opersales.learnup18.services.OperSales;
import ru.learnup.vtb.opersales.learnup18.services.interfaces.Logger;

@Configuration
//@Import({LoggerConfig.class})
public class GenetalConfig {

    @Bean
    public OperSales operSales(Logger logger){
        return new OperSales(logger);
    }



}
