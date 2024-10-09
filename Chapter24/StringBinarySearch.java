package Chapter24;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class StringBinarySearch {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("Box");
        list.add("Robot");
        list.add("Apple");

        Collections.sort(list); // binarySearch는 정렬을 먼저 해줘야함
        
        int idx = Collections.binarySearch(list, "Robot");
        System.out.println(list.get(idx));
    }
}
