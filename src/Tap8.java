import java.util.Scanner;

public class Tap8 {
    public static void main(String[] args) {
     //   İstifadəçidən 10 ədəd qəbul edən və 10-dan böyük, 30-dan kiçik və cüt olan bütün ədədlərin cəmini çap edən proqram yazın


        Scanner input = new Scanner(System.in);
        int cem = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("eded daxil edin: ");
            int eded = input.nextInt();
            if(eded>10 && eded<30 && eded%2==0){
                cem += eded;
            }

        }

        System.out.println("serti odeyen ededlerin cemi: " + cem);
    }
}
