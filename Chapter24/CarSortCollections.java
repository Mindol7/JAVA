package Chapter24;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

class Car{
    protected int disp;

    public Car(int d){
        disp = d;
    }

    @Override
    public String toString(){
        return "cc: " + disp;
    }

    // @Override 
    // public int compareTo(Car o){
    //     return disp - o.disp;
    // }
}

class CarComp implements Comparator<Car>{
    @Override
    public int compare(Car o1, Car o2){
        return o1.disp - o2.disp;
    }
}

class ECar extends Car{
    private int battery;

    public ECar(int a, int b){
        super(a);
        battery = b;
    }

    @Override
    public String toString(){
        return "cc: " + disp + ", ba: " + battery;
    }
}

public class CarSortCollections {
    public static void main(String[] args){
        List<ECar> list = new ArrayList<>();
        list.add(new ECar(1200, 99));
        list.add(new ECar(3000, 55));
        list.add(new ECar(1800, 87));

        /* public static <T extends Comparable<T>> sort(List<T> list) */
        // public static <T extends Comparable<Car>> sort(List<Car> list)
        // ECar extends Car면 <T extends Comaparable<ECar>> 인건데 이건 상속 관계가 안됨
        // 그러므로 public static <T extends Comparable<? super ECar>> sort(List<ECar> list) 필요
        // 이제 ECar Class는 Comparable<Object>, Comparable<Car>, Comparable<ECar>만 구현되어있으면 인식하고 실행될 수 있음
        CarComp comp = new CarComp();
        Collections.sort(list, comp);

        for(Iterator<ECar> itr = list.iterator(); itr.hasNext(); ){
            System.out.println(itr.next().toString() + '\t');
        }
    }
}
