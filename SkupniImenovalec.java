import java.util.Scanner;

public class SkupniImenovalec{

    public static void main(String... args){
        System.out.println("Postavi ulomka a/b in c/d na skupni imenovalec.");
        System.out.println("Zapisi ju v obliki:");
        System.out.println("a b c d");
        Scanner sc  = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

        int najmanjsiSkupniImenovalec = NAJMANJSI_SKUPNI_VECKRATNIK(b, d);
        System.out.printf("V(%d, %d)= %d\n", b, d, najmanjsiSkupniImenovalec);

        a = a * (najmanjsiSkupniImenovalec / b);
        c = c * (najmanjsiSkupniImenovalec / d);

        System.out.printf("Razsirjena ulomka: %d/%d  %d/%d\n", a, najmanjsiSkupniImenovalec, c, najmanjsiSkupniImenovalec);
        

        sc.close();
    }

    public static int NAJMANJSI_SKUPNI_VECKRATNIK(int b, int d){
        int najmanjsiSkupniVeckratnik = b;

        while(najmanjsiSkupniVeckratnik % d != 0){
            najmanjsiSkupniVeckratnik += b;
        }

        return najmanjsiSkupniVeckratnik;
    }
}