package Chapter20;

import java.util.Arrays;

class PersonSample implements Comparable{
    private String name;
    private int age;

    public PersonSample(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o){
        PersonSample p = (PersonSample)o;
        return this.name.length() - p.name.length();
    }

    @Override
    public String toString(){
        return name + ": " + age;
    }
}

public class Prob20_2_2{
    public static void main(String[] args){
        PersonSample[] ar = new PersonSample[3];
        ar[2] = new PersonSample("LimJung", 25);
        ar[0] = new PersonSample("KimDa", 22);
        ar[1] = new PersonSample("ChoMin", 20);

        Arrays.sort(ar);

        for(PersonSample p : ar){
            System.out.println(p);
        }
    }
}
