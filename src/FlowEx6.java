import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args){
        System.out.println("현재 월을 입력하세요>");

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch(month){
            case 3:
            case 4:
            case 5:
                System.out.println("현재의 계절은 봄입니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("현재의 계절은 여름입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("현재의 계절은 가을입니다.");
                break;
            default:
//            case 12: case 1: case 2:
                System.out.println("현재의 계절은 겨울입니다.");
        }



//        int num = 10;
//        final int ONE = 1;
//
//        switch (result) {
//            case '1':       // OK > 문자 리터럴
//            case ONE:       // OK > 정수 상수
//            case "YES":     // OK > 문자열 리터럴
//            case Double d:  // OK > 참조형
//            case num:       // 에러 > 변수는 불가
//            case 1.0:       // 에러 > 실수도 불가
//        }
    }
}
