import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Tap1 {
    public static void main(String[] args) {
        //10 ədəd qəbul edən və maksimumu çap edən proqram yazın

       int max=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("10 eded daxil edin:");
        for( int i=1; i<=10; i=i+1)
        {
            int n=sc.nextInt();
            if(i==1)
            {
                max=n;
            }
            else if(n>max)
            {
                max=n;
            }
        }
        System.out.println("max eded: = " + max);



    }
}
