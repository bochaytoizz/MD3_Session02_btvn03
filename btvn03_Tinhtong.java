package session02;

import java.util.Scanner;

public class btvn03_Tinhtong {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        System.out.println("Hãy nhập vào một số nguyên dương");
        int n = sr.nextInt();

        if (n <= 0 ){
            System.out.println("Số nhập vào không hợp lệ !");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++){
                sum += i;
            }
            System.out.println("Tổng các số từ 1 đến "+ n + " là: " + sum);
        }
        sr.close();
    }
}
