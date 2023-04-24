import java.util.Scanner;
import java.util.SortedMap;

public class Tap10 {
    public static void main(String[] args) {
//N natural ədədinin rəqəmlərinin sayını tapmaq üçün proqram yazın.

        int saygac = 0;
        Scanner sc=new Scanner(System.in);
        System.out.print("ededi daxil edin: ");
        int eded=sc.nextInt();
        while (eded != 0) {
            eded =eded/ 10;
            saygac++;
        }

        System.out.println("Ededin reqemleri sayi: " + saygac);
    }
}
