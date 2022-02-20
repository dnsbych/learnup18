package ru.learnup.vtb.opersales.learnup18.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import ru.learnup.vtb.opersales.learnup18.services.interfaces.Logger;

@Component
@Profile("Console")
public class ConsoleLogger implements Logger {
    @Override
    public void print(Object object) {
        System.out.println(object);
    }
}
