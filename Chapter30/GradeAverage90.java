package Chapter30;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.IntStream;

class ReportCard_{
    private int kor;
    private int eng;
    private int math;

    public ReportCard_(int k, int e, int m){
        kor = k;
        eng = e;
        math = m;
    }
    public int getKor(){ return kor; }
    public int getEng(){ return eng; }
    public int getMath(){ return math; }
}

public class GradeAverage90 {
    public static void main(String[] args){
        ReportCard_[] cards = {
            new ReportCard_(98, 84, 90),
            new ReportCard_(92, 87, 95),
            new ReportCard_(85, 99, 93)
        };
    
        boolean b1 = Arrays.stream(cards).mapToDouble(r -> (r.getKor() + r.getEng() + r.getMath()) / 3.0).anyMatch(avg -> avg >= 90.0);
    
        System.out.println("평균 90점 이상이 존재합니다" + b1);
    
        if(b1 == true){
            boolean b2 = Arrays.stream(cards).mapToDouble(r -> (r.getKor() + r.getEng() + r.getMath()) / 3.0).allMatch(avg -> avg >= 90.0);
            System.out.println("모두 평균 90점 이상 입니다." + b2);
        }
    }
    
}
