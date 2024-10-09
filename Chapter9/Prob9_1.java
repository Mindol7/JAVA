package Chapter9;

public class Prob9_1{
    public static void main(String[] args){
        Circle c = new Circle(2, 2, 4);
        c.showCircleInfo();
    }
}
class Point{
    int xPos, yPos;
    public Point(int x, int y){
        xPos = x;
        yPos = y;
    }
    public void showPointInfo(){
        System.out.println("[" + xPos + ", " + yPos + "]");
    }
}

class Circle{
    Point pos;
    int rad;
    public Circle(int x, int y, int r){
        pos = new Point(x, y);
        rad = r;
    }
    public void showCircleInfo(){
        pos.showPointInfo();
        System.out.println(", Radius: " + rad);
    }
}