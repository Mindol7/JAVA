package Chapter9;

class SinivelCap{
    void take(){
        System.out.println("콧물 나음");
    }
}

class SneezeCap{
    void take(){
        System.out.println("재치기 치료");
    }
}

class SnuffleCap{
    void take(){
        System.out.println("코막힘 치료");
    }
}

class SinusCap{
    SinivelCap siCap = new SinivelCap();
    SneezeCap szCap = new SneezeCap();
    SnuffleCap sfCap = new SnuffleCap();

    void take(){
        siCap.take(); szCap.take(); sfCap.take();
    }
}

class ColdPatient{
    void takeSinus(SinusCap cap){
        cap.take();
    }
}

public class CompEncapsulation {
    public static void main(String[] args){
        ColdPatient suf = new ColdPatient();
        suf.takeSinus(new SinusCap());
    }
}
