import java.util.Scanner;

public class Tap11 {
    public static void main(String[] args) {
        //İstifadəçinin daxil etdiyi aya uyğun neçə həmin ayın neçə gün olduğunu tapan proqram yazın

        Scanner input = new Scanner(System.in);

        int aydaOlanGun = 0;
        String ayinAdi = " ";

        System.out.print("ayin nomresin daxil edin: ");
        int ay = input.nextInt();

        switch (ay) {
            case 1:
                ayinAdi = "Yanvar";
                aydaOlanGun  = 31;
                break;
            case 2:
                ayinAdi = "Fevral";
                aydaOlanGun  = 30;
                break;
            case 3:
                ayinAdi = "Mart";
                aydaOlanGun  = 31;
                break;
            case 4:
                ayinAdi = "Aprel";
                aydaOlanGun  = 28;
                break;
            case 5:
                ayinAdi = "May";
                aydaOlanGun  = 31;
                break;
            case 6:
                ayinAdi = "Iyun";
                aydaOlanGun  = 30;
                break;
            case 7:
                ayinAdi = "Iyul";
                aydaOlanGun  = 31;
                break;
            case 8:
                ayinAdi = "Avqust";
                aydaOlanGun  = 30;
                break;
            case 9:
                ayinAdi = "Sentyabr";
                aydaOlanGun  = 31;
                break;
            case 10:
                ayinAdi = "Oktyabr";
                aydaOlanGun  = 30;
                break;
            case 11:
                ayinAdi = "Noyabr";
                aydaOlanGun  = 30;
                break;
            case 12:
                ayinAdi = "Dekabr";
                aydaOlanGun  = 31;

            default:
                System.out.println("ayi duzgun daxil etmemisiniz");
        }
        System.out.print(ayinAdi  +  " -da " + aydaOlanGun + " gun var\n");
    }
}
