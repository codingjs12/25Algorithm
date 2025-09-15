package ch03;

import utils.MyPrint;

public class SortMain {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        int[] sortedArr = Sort.selectSort(arr);

        MyPrint.printArray(sortedArr);


    }
}