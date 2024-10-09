package Chapter25;

enum Animal{
    DOG, CAT
}

enum Person{
    MAN, WOMAN
}

public class SafeEnum {
    public static void main(String[] args){
        Person p = Person.MAN;
        Animal d = Animal.DOG;
        who(p);
    }  

    public static void who(Person pr){
        switch(pr){
            case MAN:
                System.out.println("남자입니다.");
                break;
            case WOMAN:
                System.out.println("여자입니다.");
                break;
        }
    }
}
