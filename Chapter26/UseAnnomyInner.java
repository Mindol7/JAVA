package Chapter26;

interface Printable{
    void print();
}

class Papers{
    private String con;
    
    public Papers(String s){
        con = s;
    }

    public Printable getPrinter(){
        return new Printable(){
            public void print(){
                System.out.println(con);
            }
        };
    }
}

public class UseAnnomyInner {
    public static void main(String[] args){
        Papers p = new Papers("서류 내용: 나는 조민혁입니다.");
        Printable prn = p.getPrinter();
        prn.print();
    }
}