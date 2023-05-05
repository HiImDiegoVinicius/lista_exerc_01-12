import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        double altura = input.nextDouble();
        double calculo = (72.7 * altura) - 58;
        input.close();
        System.out.println("Seu peso ideal é: " + calculo);

    }
}
