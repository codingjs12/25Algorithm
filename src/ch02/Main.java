package ch02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataFind df = new DataFind();

        df.generatedRandomData(20, 10);

        df.printArray();

        df.sortAscending();
        df.printArray();

        // try-with-resource
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("정수를 입력하세요");
            int target = sc.nextInt();
            int firstIndex = df.findFirstIndex(target);
            System.out.println(firstIndex);
        }
    }
}