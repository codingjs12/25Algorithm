package ch01;

import java.util.Scanner;

public class MaxValueFind {

    static int max;
    static int maxIndex;

    static void findMaximum(int[] t) {
        max = t[0];
        for(int i = 0; i < t.length; i++) {
            if(max < t[i]) {
                max = t[i];
                maxIndex = i;
            }
        }
        System.out.println("최대값은 " + max + " 최대값의 위치는 " + maxIndex);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0; i < 6; i++) {
            System.out.println("정수를 입력하세요 : ");
            int n = sc.nextInt();

            arr[i] = n;
        }

        findMaximum(arr);
    }
}