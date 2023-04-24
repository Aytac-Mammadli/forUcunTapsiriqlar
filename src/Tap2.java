import java.util.Scanner;

public class Tap2 {
    public static void main(String[] args) {
       // 10 ədəd qəbul edən və minimumu çap edən proqram yazın

        int min=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("10 eded daxil edin:");
        for( int i=1; i<=10; i=i+1)
        {
            int n=sc.nextInt();
            if(i==1)
            {
                min=n;
            }
            else if(n<min)
            {
                min=n;
            }
        }
        System.out.println("min eded: = " + min);

    }
}
