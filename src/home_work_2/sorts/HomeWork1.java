package sorts;

import utils.HomeWork3;
import utils.HomeWork4;

public class HomeWork1 {
    public static void main(String[] args) {
        testSort(new int[]{1,2,3,4,5,6});
        testSort(new int[]{1,1,1,1});
        testSort(new int[]{9,1,5,99,9,9});
        testSort(new int[]{});
        testSort(new int[]{6,5,4,3,2,1});

        testSort(HomeWork3.arrayRandom(50,100));

        testSort(HomeWork3.arrayFromConsole());
    }

    public static void testSort(int[] arr) {

        System.out.println();
        HomeWork4.sort(arr);
        System.out.println();
        HomeWork4.shake(arr);

    }
}