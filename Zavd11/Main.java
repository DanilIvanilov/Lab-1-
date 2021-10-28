package com.company.Zavd11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Driver> addDriver(final Driver driver){
        final List<Driver> driverList = new ArrayList<> ();
        driverList.add (driver);
        return driverList;
    }
    private static List<Order> addOrder(final Order order){
        final List<Order> driverList = new ArrayList<> ();
        driverList.add (order);
        return driverList;
    }
    public static void main(final String[] args) {


        final Driver driver1 = new Driver (1234L,"Mason","Mount",23,380953092);
        final Driver driver2 = new Driver (394L,"Phill","Foden",19,380953097);
        final Driver driver3 = new Driver (594L,"Marcus","Rashford",25,380900970);
        addDriver (driver1);

        final Car car1 = new Car(35L,"Mercedes-Benz","E63S", addDriver (driver3) );
        final Car car2 = new Car(35L,"BMW","M760Li",  addDriver (driver2));


        final Order order1 = new Order (120L,323.8, LocalDate.of(2021,9,18),"5 km",car1);
        final Order order2 = new Order (900L,109.77, LocalDate.of(2021,10,9),"4 km",car2);

        final User user1 = new User (561L,"Ilya","Sidorov",34,addOrder (order1));
        final User user2 = new User (591L,"Danil","Ivanilov",23,addOrder (order2));


        System.out.println ("User orders a taxi 1: "+ user1);
        System.out.println ("================================================================================================" +
                "=====================================================");
        System.out.println ("User orders a taxi 2: "+ user2);



    }

}


