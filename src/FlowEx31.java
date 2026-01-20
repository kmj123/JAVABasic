public class FlowEx31 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        while(true){
            if(sum>100)
                break;
            i++;
            sum+=i;
        }//while
        System.out.printf("i=%d%n",i);
        System.out.printf("sum=%d",sum);
    }
}
