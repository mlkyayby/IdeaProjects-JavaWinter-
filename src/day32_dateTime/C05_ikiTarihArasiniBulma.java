package day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_ikiTarihArasiniBulma {
    public static void main(String[] args) {
        LocalDate bugun=LocalDate.now();
        LocalDate dogumGunu=LocalDate.of(1990,10,20);

        System.out.println(Period.between(dogumGunu,bugun));

        System.out.println(Period.between(dogumGunu,bugun).getYears());//31

        // FIXME: 31/03/2022
    }
}
