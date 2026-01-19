import java.util.Scanner;

public class FlowEx29 {
    public static void main(String[] args) {
        int input = 0, answer = 0;

        Scanner scanner = new Scanner(System.in);
        answer = (int) (Math.random()*100)+1;   // 1~100사이의 랜덤 숫자

        do{
            System.out.println("1부터 100까지의 정수를 입력하세요>>");
            input = scanner.nextInt();

            if(input>answer){
                System.out.println("더 작은 값으로 다시 시도해보세요");
            } else if(input<answer) {
                System.out.println("더 큰 값으로 다시 시도해보세요");
            }
        } while(input!=answer);
        System.out.printf("정답입니다! 입력한 수: %d, 랜덤 숫자: %d",input,answer);
    }
}
