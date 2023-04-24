import java.util.Scanner;

public class Tap14 {
    public static void main(String[] args) {
       // Ədədin tərsini tapan proqram yazın.


       int   tersineCevrilmisEded = 0;
        Scanner sc=new Scanner(System.in);
        System.out.print("ededi daxil edin: ");
        int eded=sc.nextInt();


        while(eded != 0) {


            int qaliq = eded % 10;
            
            tersineCevrilmisEded = tersineCevrilmisEded * 10 + qaliq;


            eded = eded/10;
        }

        System.out.println("Tersine cevrilmis eded: " + tersineCevrilmisEded);
    }
}
