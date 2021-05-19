package org.example;

import org.example.configuration.MyConfig;
import org.example.entity.Airline;
import org.example.entity.Flight;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

        List<Airline> airlines = communication.getAllAirlines();
        System.out.println(airlines);

       Flight flight = communication.getFlightById(4);
        System.out.println(flight);

/*        Airline airline = new Airline("Easy Jet");
        airline.setId(4);
        communication.saveAirline(airline);*/

  //     communication.deleteAirline(4);

    }
}
