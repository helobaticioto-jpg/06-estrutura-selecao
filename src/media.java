import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, media ;

        System.out.print("Digite a primeira nota:");
        nota1= sc.nextDouble();
        System.out.print("Digite a segunda nota:");
        nota2 = sc.nextDouble();
        media = (nota1 + nota2)/2 ;


        System.out.println("A média é:" + media );
        if(media >= 6) {
            System.out.println("APROVADO!!!");
        }
        else {
            System.out.println("REPROVADO!!!");
        }

    }
}
