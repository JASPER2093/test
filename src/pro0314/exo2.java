package pro0314;

import java.util.Scanner;

// 변수ㅡ 자료형, 상수, 실숩 - 넓이 프로그램
public class exo2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int w, h, area;
        System.out.print("삼각형 밑변 >>");
        w = in.nextInt();
        System.out.print("삼각형 높이 >>");
        h = in.nextInt();
        area = w * h / 2;
        System.out.println("삼각형 넓이 = " + area);

        int r;
        final double PI = 3.141592;
        double area1;
        System.out.print("원의 반지름 >>");
        r = in.nextInt();
        area1 = r * r * PI;
        System.out.println("원의 넓이 = " + area1);



    }

}
