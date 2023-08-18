import java.util.Scanner;

public class ProgramaManejoDeNombresFami {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer integrante de tu familia: ");
        String nombre1 = sc.nextLine();
        String nombre1Letra = nombre1.substring(1,2).toUpperCase().concat(".");
        int nombre1Tam = nombre1.length();
        String Compl1 = nombre1.substring(nombre1Tam-2);


        System.out.println("Ingresa el segundo integrante de tu familia: ");
        String nombre2 = sc.nextLine();
        String nombre2Letra = nombre2.substring(1,2).toUpperCase().concat(".");
        int nombre2Tam = nombre2.length();
        String Compl2 = nombre2.substring(nombre2Tam-2);


        System.out.println("Ingresa el tercer integrante de tu familia: ");
        String nombre3 = sc.nextLine();
        String nombre3Letra = nombre3.substring(1,2).toUpperCase().concat(".");
        int nombre3Tam = nombre3.length();
        String Compl3 = nombre3.substring(nombre3Tam-2);


        String tresFamiliares = nombre1Letra.concat(Compl1) + "_" + nombre2Letra.concat(Compl2) + "_" + nombre3Letra.concat(Compl3);
        System.out.println(tresFamiliares);

    }

}
