import java.util.Scanner;

public class Tap6 {
    public static void main(String[] args) {
      //  10 ədədi qəbul edən və 20-dən kiçik olan bütün ədədlərin cəmini çap edən proqram yazın.

        Scanner input = new Scanner(System.in);
        int cem = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("eded daxil edin: ");
            int eded = input.nextInt();
            if(eded<20){
                cem += eded;
            }

        }

        System.out.println("20-den yuxari ededlerin cemi: " + cem);
    }
}
