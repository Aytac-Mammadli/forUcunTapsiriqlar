import java.util.Scanner;

public class Tap5 {
    public static void main(String[] args) {
        //10 ədədi qəbul edən və 20-dən yuxarı olan bütün ədədlərin cəmini çap edən proqram yazın.

        int cem = 0;
        Scanner input = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {
            System.out.print("eded daxil edin: ");
            int eded = input.nextInt();
            if(eded>20){
                cem += eded;
            }
        }

        System.out.println("20-den yuxari ededlerin cemi: " + cem);
    }

}
