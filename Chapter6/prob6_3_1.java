public class prob6_3_1 {
    public static void main(String[] args){
        System.out.println(Recursive(10));
    }

    public static int Recursive(int n){
        if(n == 0) return 1;
        else{
            return 2 * Recursive(--n);
        }
    }
}
