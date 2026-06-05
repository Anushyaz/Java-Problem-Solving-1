package collections.arraylistproblems;

import java.util.ArrayList;

public class SecondMaxElement {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(45);
        list.add(3);
        list.add(99);
        list.add(27);

        System.out.println("ArrayList: " + list);

        int secondMax = findSecondMax(list);

        System.out.println("Second Maximum element is: " + secondMax);
    }

    // FIND SECOND MAX using index-based for loop
    public static int findSecondMax(ArrayList<Integer> list) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {

            int current = list.get(i);

            if (current > max) {
                secondMax = max;
                max = current;
            }
            else if (current > secondMax && current != max) {
                secondMax = current;
            }
        }

        return secondMax;
    }
}