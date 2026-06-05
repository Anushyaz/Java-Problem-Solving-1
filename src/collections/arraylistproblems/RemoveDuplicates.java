package collections.arraylistproblems;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);

        System.out.println("Original List: " + list);

        ArrayList<Integer> result = removeDuplicates(list);

        System.out.println("After Removing Duplicates: " + result);
    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            int current = list.get(i);
            boolean isDuplicate = false;

            // check if already exists in result
            for (int j = 0; j < result.size(); j++) {
                if (result.get(j) == current) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result.add(current);
            }
        }

        return result;
    }
}