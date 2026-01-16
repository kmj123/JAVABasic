import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.println("점수를 입력하세요>");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();  // 화면에서 입력받은 숫자를 score에 저장

        if(score >= 90) {
            grade = 'A';
        } else if(score>=80){
            grade = 'B';
        } else if(score>=70){
            grade='C';
        } else{
            grade='D';
        }
        System.out.printf("당신의 학점은: %d 등급은: %s 입니다.",score, grade );
    }
}
