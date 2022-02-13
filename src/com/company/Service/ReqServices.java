package com.company.Service;

import com.company.Housing.Ev;
import com.company.Housing.Villa;
import com.company.Housing.Yazlik;

import java.math.BigDecimal;
import java.util.List;

public class ReqServices {

    /*
    -totalAmount function can be used instead of totalAmountHouse, totalAmountVilla, totalAmountYazlik
    -totalaverageSquareMeters function can be used instead of averageSquareMetersHouse, averageSquareMetersVilla, averageSquareMetersYazlik
    I did it this way because the program requirements require a separate function.
     */

    public BigDecimal totalAmountHouse(List<Ev> evList){
        BigDecimal total = new BigDecimal(0);
        for(Ev ev: evList){
            total = total.add(ev.getAmount());
        }
        return total;
    }

    public BigDecimal totalAmountVilla(List<Villa> villaList){
        BigDecimal total = new BigDecimal(0);
        for(Villa villa: villaList){
            total = total.add(villa.getAmount());
        }
        return total;
    }

    public BigDecimal totalAmountYazlik(List<Yazlik> yazlikList){
        BigDecimal total = new BigDecimal(0);
        for(Yazlik yazlik: yazlikList){
            total = total.add(yazlik.getAmount());
        }
        return total;
    }

    public BigDecimal totalAmount(List<Ev> evList){
        BigDecimal total = new BigDecimal(0);
        for(Ev ev: evList){
            total = total.add(ev.getAmount());
        }
        return total;
    }

    public BigDecimal averageSquareMetersHouse(List<Ev> evList){
        BigDecimal total = new BigDecimal(0);
        for(Ev ev: evList){
            total = total.add(ev.getSquareMetersGross());
        }
        return total.divide(BigDecimal.valueOf(evList.size()));
    }

    public BigDecimal averageSquareMetersVilla(List<Villa> villaList){
        BigDecimal total = new BigDecimal(0);
        for(Villa villa: villaList){
            total = total.add(villa.getSquareMetersGross());
        }
        return total.divide(BigDecimal.valueOf(villaList.size()));
    }

    public BigDecimal averageSquareMetersYazlik(List<Yazlik> yazlikList){
        BigDecimal total = new BigDecimal(0);
        for(Yazlik yazlik: yazlikList){
            total = total.add(yazlik.getSquareMetersGross());
        }
        return total.divide(BigDecimal.valueOf(yazlikList.size()));
    }

    public BigDecimal totalaverageSquareMeters(List<Ev> evList){
        BigDecimal total = new BigDecimal(0);
        for(Ev ev: evList){
            total = total.add(ev.getSquareMetersGross());
        }
        return total = total.divide(BigDecimal.valueOf(evList.size()));
    }
}
