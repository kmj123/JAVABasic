import java.util.Scanner;

public class FlowEx12 {
    public static void main(String[] args){
        int score = 0;

        System.out.println("당신의 점수를 입력하세요(1-100)>");

        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        score = Integer.parseInt(temp);

        char grade = switch (score/10){
          case 9,10 -> 'A';
          case 8 -> 'B';
          case 7 -> 'C';
            default -> 'F';
        };
        System.out.println("당신의 학점은"+grade+"입니다.");
    }
}
