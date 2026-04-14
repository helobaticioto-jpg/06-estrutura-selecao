import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        //Declarando variáveis
        Scanner sc= new Scanner (System.in);
        double lado1, lado2, lado3;

        //Entrada de dados
        System.out.print("Escreva o valor do lado 1: ");
        lado1 = sc.nextDouble();
        System.out.print("Escreva o valor do lado 2: ");
        lado2 = sc.nextDouble();
        System.out.print("Escreva o valor do lado 3: ");
        lado3 = sc.nextDouble();

        //Processamento de dados
        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado2 + lado1){
            System.out.println("É UM TRIANGULO!!!");}
        else{
            System.out.println("NÃO É UM TRIANGULO!!!");
        }

    }
}
