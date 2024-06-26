package day0625;

import java.util.Scanner;
//어떤 학생의 5과목에 대한 시험점수가 입력된다. 평균이 80점을 넘으면 "Good Job" 넘지 못하면 "Too Bad" 를 출력하여라.
public class Qa {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int now = (a + b + c + d + e)/5;
        if (now > 80){
            System.out.println("Good Job");
        }
        else {
            System.out.println("Too Bad");
        }




    }
}
