package ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SearchSeq {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("배열 크기와 찾을 값을 입력하세요 ex) 5 7");
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int key = Integer.parseInt(st.nextToken());
        System.out.println("배열을 입력하세요 ex) 1 2 3 4 5");
        st = new StringTokenizer(br.readLine());

        int index = -1;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num == key && index == -1) {
                index = i;
            }
        }
        System.out.println("위치 : " + index);
    }
}
