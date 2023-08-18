import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double notasMas5 = 0;
        double notasInfe4 = 0;
        double notas1 = 0;
        double promedioTotal = 0;

        int num5 = 0;
        int num4 = 0;

        int i;
        double nota = 1;

        for (i = 1; i <= 20; i++) {
            System.out.println(i+". Ingrese Nota de 1-7: ");
            nota = s.nextInt();

            if(nota == 0){
                System.out.println("Número Inválido!");
                break;
            }else if (nota < 4) {
                if(nota == 1){
                    notas1++;
                }
                promedioTotal += nota;
                notasInfe4 += nota;
                num4++;
            }else if(nota > 5){
                promedioTotal += nota;
                notasMas5 += nota;
                num5++;
            }else{
                promedioTotal += nota;
            }
        }

        if (nota!= 0) {
            //Cuentas...

            promedioTotal /= 20;
            double promedio4 = notasInfe4 / num4;
            double promedio5 = notasMas5 / num5;

            //Imprimir

            System.out.println("Promedio de notas inferiores a 4: " + promedio4);
            System.out.println("Promedio de las notas mayores a 5: " + promedio5);
            System.out.println("Cantidad de notas 1: " + notas1);
            System.out.println("Promedio total: " + promedioTotal);
        }

    }
}