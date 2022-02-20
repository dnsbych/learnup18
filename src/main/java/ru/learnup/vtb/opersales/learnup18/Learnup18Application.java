package ru.learnup.vtb.opersales.learnup18;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.learnup.vtb.opersales.learnup18.model.Ticket;
import ru.learnup.vtb.opersales.learnup18.services.OperSales;
import ru.learnup.vtb.opersales.learnup18.services.TicketService;

import java.util.List;

@SpringBootApplication
public class Learnup18Application {

    public static void main(String[] args) {
        final ConfigurableApplicationContext ctx = SpringApplication.run(Learnup18Application.class, args);

        //((OperSales) ctx.getBean("operSales")).addEvent("Новое мероприятие");
        ctx.getBean(OperSales.class).addEvent("Новое мероприятие");
        ctx.getBean(TicketService.class).byTicket();

        List<Ticket> list = ctx.getBean(OperSales.class).getList();
        System.out.println(list);
    }

}
