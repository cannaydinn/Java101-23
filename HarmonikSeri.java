import java.util.Scanner;

public class HarmonikSeri{
    public static void main(String[] args) {
        //Java ile girilen sayının harmonik serisini bulan program yazacağız.
        Scanner sc = new Scanner(System.in);
        int n;
        double sonuc=0.0;

        System.out.println("N sayısını giriniz: ");
        n=sc.nextInt();

        for(int i=1; i<=n; i++){
            sonuc += (1/i);
        }

        System.out.println("sonuc: "+sonuc);
    }
}