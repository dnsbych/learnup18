package ru.learnup.vtb.opersales.learnup18.services;

import org.springframework.beans.factory.annotation.Autowired;
import ru.learnup.vtb.opersales.learnup18.model.Ticket;
import ru.learnup.vtb.opersales.learnup18.services.interfaces.Logger;

import java.util.ArrayList;
import java.util.List;


public class OperSales {

    private Logger logger;

    @Autowired
    public OperSales(Logger logger) {
        this.logger = logger;
    }

    public void addEvent(String name){
        logger.print("Добавляем мероприятие "+name);
    }

    public void editEvent(){

    }

    public void deleteEvent(){

    }

    public List<Ticket> getList(){

        List<Ticket> ticketList = new ArrayList<Ticket>();
        ticketList.add(new Ticket(1, 100));

        return ticketList;
    }

}
