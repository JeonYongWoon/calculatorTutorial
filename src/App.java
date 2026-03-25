import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int fstNum = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요 : ");
            int secNum = sc.nextInt();

            System.out.print("사칙연산 기호(+,-,*,/)를 입력하세요 : ");
            char arithmetic = sc.next().charAt(0);


            int result = cal.calculate(fstNum, secNum, arithmetic);

            System.out.println("결과 : " + result + " / 전체 결과 : " + cal.getResults());
            System.out.println("삭제를 원하면 remove 입력, 계속하려면 아무 키나 입력 : ");
            String cmd = sc.next();

            if (cmd.equals("remove")) {
                cal.removeResult();
            }

            System.out.println("더 계산하려면 아무 키나 입력. 종료하려면 'exit' 입력 : ");
            String input = sc.next();

            if (input.equals("exit")) {
                break;
            }
        }
    }
}