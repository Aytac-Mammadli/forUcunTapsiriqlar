public class Tap3 {

   //  1-dən 100-ə qədər 3-ə və 2-yə bölünə bilən bütün ədədləri çap edən proqram yazın.
    public static void main(String[] args) {
        System.out.println("3 & 2 bolunen ededler");
        for (int i=1; i<100; i++) {
            if (i%3==0 && i%2==0)
                System.out.println(i +", ");
        }


    }
}
