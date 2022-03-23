package pro0314;
//문제 - 한층의 높이가 5m일때, 건물이 몇층인디 입력받아 높이를 출력하는
//프로그램 장성하시오, 인터페이스는 자유롭게 작성하시오 p.87 문제 2번
import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = 5;
        int f, i;

        System.out.print("층 수 입력 : ");
        f = in.nextInt();
        i = h * f;
        System.err.print("아파트 높이는 " + i + "m입니다");

    }

}
