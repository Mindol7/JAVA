package Chapter26;

interface Printable_{
    void print(String s);
}

class Printer_ implements Printable_{
    public void print(String s){
        System.out.println(s);
    }
}

public class Lambda1 {
    public static void main(String[] args){
        Printable_ prn = new Printer_();
        prn.print("What is Lambda?");
    }
}
