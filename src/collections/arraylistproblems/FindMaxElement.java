package collections.arraylistproblems;

import java.util.ArrayList;

public class FindMaxElement {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(45);
        list.add(3);
        list.add(99);
        list.add(27);

        System.out.println("ArrayList: " + list);

        int max = findMax(list);

        System.out.println("Maximum element is: " + max);
    }
    public static int findMax(ArrayList<Integer> list) {
        int max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        return max;
    }
}