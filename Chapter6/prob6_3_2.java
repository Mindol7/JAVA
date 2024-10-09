public class prob6_3_2 {
    public static void main(String[] args){
        solution(10);
    }

    public static void solution(int n){
        if(n/2 == 0){
            System.out.print(n%2);
            return;
        }
        else{
            solution(n/2);
            System.out.print(n%2);
        }
    }
}
