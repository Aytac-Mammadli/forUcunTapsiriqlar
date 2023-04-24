import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Tap4 {
    public static void main(String[] args) {
       // İstifadəçidən 10 ədədi qəbul edən və onların cəmini çap edən proqram yazın.

        Scanner input = new Scanner(System.in);
        int cem = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("eded daxil edin: ");
            int eded = input.nextInt();
            cem += eded;
        }

        System.out.println("10 ededin cemi: " + cem);


    }
}
