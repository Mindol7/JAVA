public class prob4_2_2 {
    public static void main(String[] args){
        int num = 15678;
        int solution = (num >> 2) & (0x0001);
        System.out.println(solution);

        int solution2 = (num >> 4) & (0x0001);
        System.out.println(solution2); 
    }
}
