import java.util.Scanner;

public class Primer {
        public static void main(String[] args){
        
        //TEGA NE TIKAJ
        Scanner sc = new Scanner(System.in);
        //TEGA ZGORAJ NE TIKAJ

        //to lahko kopiras in ponovis, ce zelis vstaviti vec spremenljivk
        // POZOR: zamenjati mores ime spremenljivke
        
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();

        //stevil lahko primerjamo z < > <= >= == in !=
        //dobimo rezultat ki je true (DRZI) ali false (NE DRZI)
        System.out.println("a < b je res? " + (a<b));
        System.out.println("a = b je res? " + (a==b));
        
        //dolocene stvari lahko izvedemo samo ce nekaj drzi
        if(a < b){
            System.out.println("a je manjsi od b");
        }else{
            System.out.println("a je vecji ali enak kot b");
        }

        //vrednosti stevil lahko spreminjamo
        System.out.println("Na zacetku a = " + a);
        a = a + 5;
        //vrednost a se je poveòala za 5
        System.out.println("Smo dodali 5, a = " + a);
        a = a / 2;
        //vrednost a s e je delila z 2
        System.out.println("Smo delili z 2, a = " + a);

        //stvari lahko ponavljamo veckrat, lahko pa jih napisemo samo enkrat:
        int i = 0;
        while(i < 10){
            System.out.println("Zdaj je i = " + i);
            i = i + 1;
        }
        

        sc.close();   
    }
}
