package day0625;

import java.util.Scanner;

public class D33caudieukienfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = { 1, 2, 3, 4, 5 };
// i를 쓰는 대신 배열의 원소를 하나씩 가져오자. -> for each
        for (int number : numbers) {
            // number에 numbers의 원소가 순서대로 할당된다.
            System.out.println("number: " + number);
        }
/*for (int i = 0; i < numbers.length; i++) {
    int number = numbers[i];
    System.out.println("number: " + number);
}*/

// 문자열 배열
        String[] names = { "alex", "brad", "chad", "dave", "eric", "fred", "greg" };
// for each를 사용하면?
        for (String name : names) {
            System.out.println("name: " + name);
        }
        // for - each
        // 배열이 있었다.
        numbers = new int[]{1, 2, 3, 4, 5};
        // 베열의 원소를 하나씩 가져와서 출력해보고 싶었다.
        // for문을 사용하면?
        for (int i = 0; i < numbers.length; i++) {
            // i는 0 부터 4까지 커질태니까...
            System.out.println("number: " + numbers[i]);
        }
        // 근데 여기서 i는 용도가 단 하나: 몇번째인지 나타내기 위해서
        System.out.println("---- 절취선 ----");
        // i를 쓰는 대신 배열의 원소를 하나씩 가져오자. -> for each
        for (int number : numbers) {
            // number에 numbers의 원소가 순서대로 할당된다.
            System.out.println("number: " + number);
        }
        /*for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println("number: " + number);
        }*/

        // 문자열 배열
        names = new String[]{"alex", "brad", "chad", "dave", "eric", "fred", "greg"};
        // for each를 사용하면?
        for (String name : names) {
            System.out.println("name: " + name);
        }
        // 잔고와 매월 사용 금액이 주어질때
        // 잔고가 0이되면 멈추자
        int price = 50;
        int savings = 200;
        // 10번 반복하는 for문
        for (int i = 0; i < 10; i++) {
            // 매월 금액 차감
            savings -= price;
            if (savings - price < 0) {
                System.out.println("잔고가 부족합니다.");
                // break: 반복을 멈추고 반복문에서 나간다.
                break;
            }
        }
        System.out.println(savings);

        // 숫자 배열 중, 양수 만 합치고 싶다.
        int[] accounts = {100, 20, -40, 60, -80, 100};
        int sum = 0;
        for (int account : accounts) {
            // continue: 이번 반복을 중단하고, 다음 반복으로 넘어가자.
            // continue 이후의 남은 코드는 실행하지 않는다.
            if (account < 0) continue;
            sum += account;
        }
        System.out.println("sum: " + sum);

        // 중첩 반복에서 break 또는 continue를 사용할 때는
        // 제일 가까운 반복문만 영향을 받음
        while (true) {
            for (int i = 0; i < 10; i++) {
                while (true) {
                    // 이 break는 130번 줄의 while을 종료
                    break;
                }
                if (i > 5) {
                    // 이 break는 129번 줄의 for를 종료
                    break;
                }
            }
            break;
        }

    }


}
