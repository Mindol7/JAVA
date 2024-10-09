package Chapter28;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Prob28_1 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("robot");
        list.add("Lambda");
        list.add("box");
        // Collections.sort(list, (s1, s2) -> s1.compareToIgnoreCase(s2));
        Collections.sort(list, String::compareToIgnoreCase);
        System.out.println(list);
    }
}
