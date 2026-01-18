public class FlowEx24 {
    public static void main(String[] args) {
        int i = 5;

        while(i-- != 0){    // 조건 'i-- == 0'은(는) 항상 'false'입니다.
            System.out.printf("%d - I can do it%n",i);
        }

//        while(--i!=0){
//            System.out.println(i);
//        }
    }
}
