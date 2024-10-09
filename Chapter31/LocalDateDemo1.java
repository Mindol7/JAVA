package Chapter31;

import java.time.LocalDate;

public class LocalDateDemo1 {
    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        System.out.println("Today : " + today);

        LocalDate xmas = LocalDate.of(today.getYear(), 12, 25);
        System.out.println("Xmas: " + xmas);

        LocalDate eve = xmas.minusDays(1);
        System.out.println("Xmas eve : " + eve);
    }
}
