import java.util.Scanner;

public class exerc07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperatura;

        System.out.print(" DIGITE UMA TEMPERTAURA:");
        temperatura = sc.nextDouble();

        if (temperatura >= 20){
            System.out.print( temperatura + "°C É CALOR!!!");
        }
        else {
            System.out.print(temperatura + "°C É FRIO!!!");
        }
    }
}
