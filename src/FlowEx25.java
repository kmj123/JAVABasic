public class FlowEx25 {
    public static void main(String[] args) {
        int i = 11;

//        for (i = 1; i <= 10; i++) ; // 빈문자 ; 을 10번 반복
//        {
//            System.out.println("i=" + i);   // i=11을 출력함
//        }

        System.out.println("카운트 다운을 시작합니다.");

        while(i-- !=0){
            System.out.println(i);

            for(long j=0;j<5_000_000_000L;j++){ // 매 출력마다 약간의 시간이 지연되도록 해줌
//                ;   // 아무런 내용도 없는 빈문장
            }
        }
        System.out.println("GAME OVER");
    } // main의 끝
}
