public class prob7_1 {
    public static void main(String[] args){
        Triangle t = new Triangle();
        t.setInfo(5, 10);
        System.out.println(t.calArea());
    }
}

class Triangle{
    int weigh;
    int height;

    public Triangle(){
        weigh = 0;
        height = 0;
    }
    public void setInfo(int w, int h){
        weigh = w; height = h;
    }
    public int calArea(){
        return (weigh * height) / 2;
    }
}
