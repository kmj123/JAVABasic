public class FlowEx34 {
    public static void main(String[] args) {
        // for문에 Loop1 이라는 이름을 붙임
        Loop1 : for(int i=2;i<=9;i++){
            for(int j=1;j<=9;j++){
                if(j==5)
                    break Loop1;
                System.out.printf("%d * %d = %d%n",i,j,i*j);
            }
            System.out.println();
        }// End Loop
    }
}
