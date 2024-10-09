package Chapter20;

import java.util.Arrays;

class PersonSample2 implements Comparable{
    private String name;
    private int age;

    public PersonSample2(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o){
        PersonSample2 p = (PersonSample2)o;
        return this.age - p.age;
    }

    @Override
    public String toString(){
        return name + ": " + age;
    }
}

public class Prob20_3{
    public static void main(String[] args){
        PersonSample2[] ar = new PersonSample2[4];
        ar[0] = new PersonSample2("Kimda", 20);
        ar[1] = new PersonSample2("Cho", 25);
        ar[2] = new PersonSample2("LimJung", 22);
        ar[3] = new PersonSample2("Kimdoikkkkkk", 26);

        Arrays.sort(ar);
        int idx = Arrays.binarySearch(ar, new PersonSample2("Who are you", 22));
        
        System.out.println(ar[idx]);
    }
}
