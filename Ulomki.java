import java.util.Scanner;

public class Ulomki {

    public static void main(String... args){
    System.out.println("Postavi ulomka a/b in c/d na skupni imenovalec.");
      System.out.println("Zapisi ju v obliki:");
      System.out.println("stevec_1 imenovalec_1 stevec_2 imenovalec_2");
      Scanner sc = new Scanner(System.in);
      int stevec_1 = sc.nextInt();
      int imenovalec_1 = sc.nextInt();
      int stevec_2 = sc.nextInt();
      int imenovalec_2 = sc.nextInt();

      //DOPOLNI
      int najmanjsi_skupni_imenovalec = Najmanjsi_Skupni_Veckratnik(0, 0);

      //tukaj moras raziriti ulomka na skupni imenovalec

        int stevec_vsota = 0;
        int imenovalec_vsota = 0;

        //Tukaj bo napisalo rezultat
        System.out.println("Vsota je: " + stevec_vsota + "/" + imenovalec_vsota);

        sc.close();
    }

    public static int Najmanjsi_Skupni_Veckratnik(int stevilo_a, int stevilo_b){
        int veckratnik_a = stevilo_a; // poskusimo dobiti veckratnik stevila a, ki je hkrati veckratnik stevila b
        while(veckratnik_a % stevilo_b != 0){ //ce je ostanek deljenja s stevilom b enak 0, je veckratnik od a deljiv z b,
            //to pomeni, da je hkrati veckratnik od b, torej je njihov najmanjsi skupni veckratnik
            
            // ce veckratnik ni se deljiv z b, gremo na naslednji veckratnik od stevila a
            // na primer stevilo a = 8, poskusili smo z 8, 16, 24, povecamo veckratnik na 24
            veckratnik_a = veckratnik_a + stevilo_a;
        }

        //najmanjsi skupni veckratnik je veckratnik stevila a, ki je deljiv z b
        int najmanjsi_skupni_veckratnik = veckratnik_a;
        return najmanjsi_skupni_veckratnik;
    }

}
