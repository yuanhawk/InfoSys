package session2a;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String ans="";

        IteratingExamples iteratingexamples = new IteratingExamples();
        List< Integer > integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        String ans1 = "" + iteratingexamples.Act2Iterator(integers);
        ans = "Iterator Sum = " + ans1;

        System.out.println(ans);
    }
}
