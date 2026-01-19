import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        boolean flag = true;

        System.out.println("합계를 구할 숫자를 입력하세요(끝내려면 0을 입력)>");

        Scanner scanner = new Scanner(System.in);

        while(flag){
            System.out.print(">>");
            // while문 내에서 형변환을 해줘야함
            String temp = scanner.nextLine();
            num = Integer.parseInt(temp);

            if(num!=0){
                sum += num;
            } else{
                flag = false;
            }
        }// while문 끝
        System.out.printf("합계:%d", sum);


    }// main 끝
}
