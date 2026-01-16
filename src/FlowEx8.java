import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args){
        System.out.println("당신의 주민번호를 입력하세요(111111-1111111)>");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();

        char gender = regNo.charAt(7);  // 8번째 문자를 gender에 저장

        switch (gender){
            case '1': case '3':
                System.out.println("남자입니다.");
                break;
            case '2': case '4':
                System.out.println("여자입니다.");
                break;
            default:
                System.out.println("유효하지 않은 주민등록번호입니다.");
        }
    }
}
