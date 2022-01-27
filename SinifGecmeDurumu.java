import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        // Ortalamaya 0 ve 100 arasinda olmayanlar katilmayacak.

        Scanner input = new Scanner(System.in);

        double matematik, fizik, turkce, kimya, muzik,ortalama=0,bolen=0,kalan=0;
        System.out.println("-------------------------------| SINIF GECME DURUMU |--------------------------------");
        System.out.println("-----| Ortalamaya 0 ve 100 arasinda olmayanlar katilmayacak , (0 ve 100 dahil) |-----");
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.print("Matematik ders notunuz? :");
        matematik = input.nextDouble();

        System.out.print("Fizik ders notunuz? :");
        fizik = input.nextDouble();

        System.out.print("Turkce ders notunuz? :");
        turkce = input.nextDouble();

        System.out.print("Kimya ders notunuz? :");
        kimya = input.nextDouble();

        System.out.print("Muzik ders notunuz? :");
        muzik = input.nextDouble();

        if((matematik>=0.0 && matematik<=100.0)){
            bolen++;
            ortalama += matematik;
        }

        if(fizik>=0.0 && fizik<=100.0){
            bolen++;
            ortalama += fizik;
        }

        if(turkce>=0.0 && turkce<=100.0){
            bolen++;
            ortalama += turkce;
        }

        if(kimya>=0.0 && kimya<=100.0){
            bolen++;
            ortalama += kimya;
        }

        if(muzik>=0.0 && muzik<=100.0){
            bolen++;
            ortalama += muzik;
        }

        ortalama = ortalama / bolen;
        kalan = 5 - bolen;

       System.out.println("Gecerli Ders sayisi ("+bolen+") Gecerli not ortalamaniz: " + ortalama);

       if(ortalama>=55){
           System.out.println("Tebrikler Sinifi gectiniz!");
       }else{
           System.out.println("Uzgunuz Sinifta kaldiniz...");
       }

       if(kalan>0)
           System.out.println("("+kalan+")adet gecersiz dersi tekrar kontrol ediniz...");
    }
}

