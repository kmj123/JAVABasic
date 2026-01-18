import java.util.Scanner;

public class FlowEx18 {
    public static void main(String[] args){
        int num = 0 ;

        System.out.println("*을 출력할 라인의 수를 입력하세요>");

        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();   // 화면을 통해 입력받은 내용을 저장
        num = Integer.parseInt(temp);       // 문자열을 숫자로 변환

        for(int i=1;i<=num; i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
