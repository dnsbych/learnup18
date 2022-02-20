package ru.learnup.vtb.opersales.learnup18.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.learnup.vtb.opersales.learnup18.services.interfaces.Logger;

@Service
public class TicketService {

    Logger logger;

    public TicketService(Logger logger) {
        this.logger = logger;
    }

    public int byTicket(){
        logger.print("Купили билет");
        return 0;
    }

    public boolean returnTicket(){
        return true;
    }

}
