import java.util.Scanner;

public class Tap7 {
    public static void main(String[] args) {

    //    İstifadəçidən 10 ədəd qəbul edən və 10-dan böyük və 30-dan kiçik olan bütün ədədlərin cəmini çap edən proqram yazın.

        Scanner input = new Scanner(System.in);
        int cem = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("eded daxil edin: ");
            int eded = input.nextInt();
            if(eded>10 && eded<30){
                cem += eded;
            }

        }

        System.out.println("10-dan boyuk 30-den kicik ededlerin cemi: " + cem);
    }
}
