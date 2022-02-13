package com.company;

import com.company.Housing.Ev;
import com.company.Housing.Villa;
import com.company.Housing.Yazlik;
import com.company.Service.ReqServices;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Ev ev1 = new Ev();
        ev1.setAmount(new BigDecimal(500000));
        ev1.setSquareMetersGross(new BigDecimal(80));

        Ev ev2 = new Ev();
        ev2.setAmount(new BigDecimal(600000));
        ev2.setSquareMetersGross(new BigDecimal(90));

        Ev ev3 = new Ev();
        ev3.setAmount(new BigDecimal(700000));
        ev3.setSquareMetersGross(new BigDecimal(100));


        Villa villa1 = new Villa();
        villa1.setAmount(new BigDecimal(800000));
        villa1.setSquareMetersGross(new BigDecimal(150));

        Villa villa2 = new Villa();
        villa2.setAmount(new BigDecimal(9900000));
        villa2.setSquareMetersGross(new BigDecimal(160));

        Villa villa3 = new Villa();
        villa3.setAmount(new BigDecimal(1000000));
        villa3.setSquareMetersGross(new BigDecimal(170));


        Yazlik yazlik1 = new Yazlik();
        yazlik1.setAmount(new BigDecimal(550000));
        yazlik1.setSquareMetersGross(new BigDecimal(130));

        Yazlik yazlik2 = new Yazlik();
        yazlik2.setAmount(new BigDecimal(560000));
        yazlik2.setSquareMetersGross(new BigDecimal(150));

        Yazlik yazlik3 = new Yazlik();
        yazlik3.setAmount(new BigDecimal(570000));
        yazlik3.setSquareMetersGross(new BigDecimal(140));

        List<Ev> evList = new ArrayList<Ev>();
        evList.add(ev1);
        evList.add(ev2);
        evList.add(ev3);

        List<Yazlik> yazlikList = new ArrayList<Yazlik>();
        yazlikList.add(yazlik1);
        yazlikList.add(yazlik2);
        yazlikList.add(yazlik3);

        List<Villa> villaList = new ArrayList<Villa>();
        villaList.add(villa1);
        villaList.add(villa2);
        villaList.add(villa3);

        List<Ev> list = new ArrayList<Ev>();
        list.add(ev1);
        list.add(ev2);
        list.add(ev3);
        list.add(yazlik1);
        list.add(yazlik2);
        list.add(yazlik3);
        list.add(villa1);
        list.add(villa2);
        list.add(villa3);

        ReqServices services = new ReqServices();
        BigDecimal result;


        result = services.totalAmountHouse(evList);
        System.out.println("Total amount of evList: " + result);

        result = services.totalAmountVilla(villaList);
        System.out.println("Total amount of villaList: " + result);

        result = services.totalAmountYazlik(yazlikList);
        System.out.println("Total amount of yazlikList: " + result);

        result = services.totalAmount(list);
        System.out.println("Total amount of list: " + result);


        result = services.averageSquareMetersHouse(evList);
        System.out.println("Total average of square meters of evList: " + result);

        result = services.averageSquareMetersVilla(villaList);
        System.out.println("Total average of square meters of villaList: " + result);

        result = services.averageSquareMetersYazlik(yazlikList);
        System.out.println("Total average of square meters of yazlikList: " + result);

        result = services.totalaverageSquareMeters(list);
        System.out.println("Total average of square meters of list: " + result);





    }
}
