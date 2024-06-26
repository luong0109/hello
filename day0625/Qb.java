package day0625;

import java.util.Scanner;

//어떤 학생의 시험점수가 정수로 주어진다.
//
//점수가 90점 이상이면 "A",
//점수가 80점 이상 90점 미만이면 "B",
//점수가 70점 이상 80점 미만이면 "C",
//점수가 60점 이상 70점 미만이면 "D",
//점수가 60점 미만이면 "F"
//
//를 출력하여라.
public class Qb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if ( a >= 90) {
            System.out.println("A");
        }
        else if (a >=80) {
            System.out.println("B");
        }
        else if (a >=70) {
            System.out.println("C");
        }
        else if (a >=60) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}
