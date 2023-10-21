package day01;
import java.util.Scanner;
public class SayiSiralama {
    public static void main(String[] args) {

        int sayi1,sayi2,sayi3;
        Scanner input=new Scanner(System.in);

        System.out.println("birinci sayıyı giriniz: ");
        sayi1=input.nextInt();

        System.out.println(" ikinci sayıyı giriniz: ");
        sayi2=input.nextInt();

        System.out.println("üçüncü sayıyı giriniz: ");
        sayi3=input.nextInt();

        if(sayi1>sayi2 && sayi1>sayi3 && sayi2>sayi3){
            System.out.println("sayıların küçükten büyüğe sıralanmış hali: sayi3<sayi2<sayi1");

        }else if(sayi1>sayi2 && sayi1>sayi3 && sayi3>sayi2){
            System.out.println("sayıların küçükten büyüğe sıralanışı: sayi2<sayi3<sayi1");
        }else if(sayi2>sayi1 && sayi2>sayi3 && sayi1>sayi3){
            System.out.println("sayıların küçükten büyüğe sıralanışı: sayi3<sayi1<sayi2");
        }else if(sayi2>sayi1 && sayi2>sayi3 && sayi3>sayi1){
            System.out.println("sayıların küçükten büyüğe doğru sıralanışı: sayi1<sayi3<sayi2");
        }else if(sayi3>sayi2 && sayi3>sayi1 && sayi2>sayi1){
            System.out.println("sayıların küçükten büyüğe sıralanışı: sayi1<sayi2<sayi3");
        }else System.out.println("sayıların küçükten büyüğe sıralanışı: sayi2<sayi1<sayi3");

    }
}
