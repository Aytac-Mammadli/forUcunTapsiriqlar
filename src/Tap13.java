import java.util.Scanner;

public class Tap13 {

    public static void main(String[] args) {
        // Daxil etdiyimiz ədədə qədər sadə ədədləri tapan proqram yazın.


      int saygac;
        System.out.print("eded daxil edin : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("1-den n-e qeder sade ededler "+n);
        for(int j=2;j<=n;j++)
        {
           saygac=0;
            for(int i=1;i<=j;i++)
            {
                if(j%i==0)
                {
                    saygac++;
                }
            }
            if(saygac==2)
                System.out.print(j+"  ");
        }
    }
}
