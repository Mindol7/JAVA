package Chapter31;

import java.time.LocalDate;
import java.time.Period;

public class LocalDateDemo2 {
    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        LocalDate xmas = LocalDate.of(today.getYear(), 12, 25);
        System.out.println("Xmas: " + xmas);

        Period left = Period.between(today, xmas);
        System.out.println("Xmas Left: " + left.getMonths() + left.getDays());
    }
}
