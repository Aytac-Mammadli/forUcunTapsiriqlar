import java.util.Scanner;

public class Tap15 {
    public static void main(String[] args) {

        //İstifadəçinin daxil etdiyi aya uyğun həmin fesli tapan proqram yazın.(switch ilə)
        String fesil=" ";
        System.out.println("ayin nomresini daxil edin: ");
        Scanner input = new Scanner(System.in);
        int ayinNomresi = input.nextInt();
        switch (ayinNomresi)
        {
            case 12:
            case 1:
            case 2:
                fesil = "Qis";
                break;
            case 3:
            case 4:
            case 5:
                fesil = "Yaz";
                break;
            case 6:
            case 7:
            case 8:
                fesil = "Yay";
                break;
            case 9:
            case 10:
            case 11:
                fesil = "Payiz";
                break;
            default:
                fesil = "Duzgun melumat daxil edin!";
        }
        System.out.println("daxil etdiyiniz ay " + fesil + " fesilindedir");
    }
}
