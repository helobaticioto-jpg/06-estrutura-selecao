import java.util.Scanner;

public class exerc06 {
    public static void main(String[] args) {
        //DECLARANDO VARIÁVEIS
        Scanner sc = new Scanner(System.in);
        int ano;
        //ENTRADA DE DADOS
        System.out.print("Digite um ano: ");
        ano = sc.nextInt();
        //PROCESSAMENTO E SAÍDA
        if ((ano%4 == 0 && ano%100 != 0)||(ano%100 == 0 && ano%400 == 0 )){
            System.out.println( ano + "O ano é bissexto!!");
        }
        else {
            System.out.println( ano + "O ano não é bissexto!!!");
        }
    }
}
