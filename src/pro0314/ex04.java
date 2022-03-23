package pro0314;

// 연산자,수식, 타입변환
import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner in = new Scanner(System.in);

        int n1, n2, sum, sub;
        double mul, div;
        System.err.print("두개의 정수갑 입력 >> ");
        n1 = in.nextInt();
        n2 = in.nextInt();
        sum = n1 + n2;
        sub = n1 - n2;
        mul = n1 * n2;
        div = (double) n1 / (double) n2;

        System.out.println(n1 + "*" + n2 + "=" + mul);
        System.out.println(n1 + "/" + n2 + "=" + div);
        System.out.println(n1 + "+" + n2 + "=" + sum);
        System.out.println(n1 + "-" + n2 + "=" + sub);
    }

}
