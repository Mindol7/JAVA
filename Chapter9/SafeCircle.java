package Chapter9;

public class SafeCircle {
    public static void main(String[] args){
        circle_ c = new circle_(5);
        System.out.println(c.getArea());
    }
}

class circle_{
    private double rad = 0;
    final double PI = 3.14;

    public circle_(double r){
        setRad(r);
    }

    public void setRad(double r){
        if(r < 0){
            rad = 0;
            return;
        }
        rad = r;
    }
    public double getRad(){
        return rad;
    }
    public double getArea(){
        return rad * rad * PI;
    }
}
