import java.util.Scanner;

public class Tap9 {
    public static void main(String[] args) {

        //N natural ədədinin rəqəmlərinin cəmini tapmaq üçün proqram yazın

       int qaliq, cem = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ededi daxil edin: ");
       int eded = sc.nextInt();
        while(eded != 0)
        {

            qaliq = eded % 10;

            cem = cem + qaliq;

            eded = eded / 10;
        }

        System.out.println(" ededin reqemler cemi: "+cem);


    }
}
