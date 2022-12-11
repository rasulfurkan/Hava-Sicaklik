import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int heat ;

        Scanner derece = new Scanner(System.in);
        System.out.println("hava sıcaklık değerini giriniz:");
        heat=derece.nextInt();

        if (heat<=5) {
            System.out.println("hava sıcaklıgı düşük olduğu için kayak yapabilirsin");
        }
        if (heat>5 && heat<=15){
            System.out.println("dışarısı biraz soğuk bu yüzden sinemaya gidebirsin");
        }
        if (heat>15 && heat<=25){
            System.out.println("hava cok güzel piknik yapabilirsin");
        }
        if (heat>25 ){
            System.out.println("hava cok sıcak yüzmeye gidebilirsin");

        }

        //eşitlik kullanmadım kullansaysım aynı degerin bir deb fazla sonucu olabilirdi farklılık olarak daha basit şekilde yazmak istedim.



        /*
        Koşullar :
Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
         */



    }
}