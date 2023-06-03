import  java.util.Scanner;
public class NumerosDecrescentes {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero : ");
        int numero01 = scanner.nextInt();

    System.out.println("Digite o segundo numero: ");
    int numero02 = scanner.nextInt();

    if(numero01>numero02) {
        System.out.println("numero em ordem descrescente : " + numero01 + "," + numero02);
    }else {
        System.out.println("Numeros em ordem descrescente : " + numero02 + ","+ numero01);

}}}
