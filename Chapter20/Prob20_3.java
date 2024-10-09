package Chapter20;

import java.util.Arrays;

class PersonSample3 implements Comparable{
    private String name;
    private int age;

    public PersonSample3(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o){
        PersonSample3 p = (PersonSample3)o;
        return this.name.compareTo(p.name);
    }

    @Override
    public String toString(){
        return name + ": " + age;
    }
}

public class Prob20_3 {
    public static void main(String[] args){
        PersonSample3[] ar = new PersonSample3[4];
        ar[0] = new PersonSample3("Kimda", 20);
        ar[1] = new PersonSample3("Cho", 25);
        ar[2] = new PersonSample3("LimJung", 22);
        ar[3] = new PersonSample3("Kimdoikkkkkk", 26);

        Arrays.sort(ar);
        int idx = Arrays.binarySearch(ar, new PersonSample3("Kimda", -3));
        
        System.out.println(ar[idx]);
    }
}
