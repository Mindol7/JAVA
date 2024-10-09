package Chapter20;

import java.util.Arrays;

class Person implements Comparable{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o){
        Person p = (Person)o;
        return p.age - this.age;
    }

    @Override
    public String toString(){
        return name + ": " + age;
    }
}

public class Prob20_2_1 {
    public static void main(String[] args){
        Person[] ar = new Person[3];
        ar[0] = new Person("Kim", 22);
        ar[1] = new Person("Cho", 20);
        ar[2] = new Person("Lim", 25);

        Arrays.sort(ar);

        for(Person p : ar){
            System.out.println(p);
        }
    }
}
