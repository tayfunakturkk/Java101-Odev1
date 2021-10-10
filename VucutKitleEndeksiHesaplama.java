package Ödev1;
import java.util.Scanner;
public class VucutKitleEndeksiHesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double boy,kilo;
        System.out.print("Lütfen boyunuzu giriniz(m):");
        boy=input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz(kg):");
        kilo=input.nextDouble();

        double vkc=kilo/(boy*boy);

        System.out.println("Vücut Kitle Endeksiniz:"+vkc);



    }
}
