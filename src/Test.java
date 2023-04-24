import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int saygac;

        Scanner  sc=new Scanner(System.in);
        System.out.println("eded daxil edin: ");
        int eded=sc.nextInt();
        System.out.println("1-den n-e qeder murekkeb ededler: ");

        for(int j=2; j<=eded; j++){
            saygac=0;
            for (int i=1; i<=j; i++){
                if(j%i==0){
                    saygac++;
                }
            }
            if(saygac>2){
                System.out.println(j+ " ");
            }
        }

    }
}
