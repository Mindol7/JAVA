package Chapter30;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.IntStream;

class ReportCard{
    private int kor;
    private int eng;
    private int math;

    public ReportCard(int k, int e, int m){
        kor = k;
        eng = e;
        math = m;
    }
    public int getKor(){ return kor; }
    public int getEng(){ return eng; }
    public int getMath(){ return math; }
}

public class GradeAverage {
    public static void main(String[] args){
        ReportCard[] cards = {
            new ReportCard(70, 80, 90),
            new ReportCard(90, 80, 70),
            new ReportCard(80, 80, 80)
        };

        Stream<ReportCard> sr = Arrays.stream(cards);

        // 람다식 각 인스턴스에 적용될것임
        sr.flatMapToInt(r -> IntStream.of(r.getKor(), r.getEng(), r.getMath())).average().ifPresent(avg -> System.out.println("avg. " + avg));;

    }
}
