package _3.NextPermutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NextPermutation {
    public static void main(String[] args) {
        ArrayList<Integer> permutation = new ArrayList(Arrays.asList(2,3,1,4,5));
        System.out.println(nextPermutation(permutation));
    }

    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation)
    {
        int index = findIndex(permutation);

        if(index == -1)
        {
            Collections.reverse(permutation);
            return permutation;
        }

        getSwappedList(permutation, index);

        Collections.reverse(permutation.subList(index+1, permutation.size()));

        return permutation;
    }

    public static int findIndex(ArrayList<Integer> permutation)
    {
        int index = -1;

        for (int i = permutation.size()-2; i >=0; i--) {
            if(permutation.get(i) < permutation.get(i+1))
            {
                index = i;
                break;
            }
        }

        return index;
    }

    public static void getSwappedList(ArrayList<Integer> permutation, int index)
    {
        for (int i = permutation.size()-1; i >=index; i--) {
            if(permutation.get(i) > permutation.get(index))
            {
                int temp = permutation.get(index);
                permutation.set(index, permutation.get(i));
                permutation.set(i, temp);

                break;
            }
        }
    }
}
