import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 0;
        System.out.println("3 eded daxil edin");
        for (int i = 1; i <= 3; i++) {
            System.out.print("eded daxil et: ");
            int eded = sc.nextInt();
            if (eded%2==0  ) {
                    min = eded;

            }
          else  if(eded<min ){
                 min=eded;
                }
            }
        System.out.println("en kicik ve cut eded " + min);

        }

    }

