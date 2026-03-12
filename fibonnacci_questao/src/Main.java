import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Adicione um numero para ser fatorado:\n");
        int numero = sc.nextInt();
        int fatorial = numero - 1;
        while (fatorial != 0) {
            numero *= fatorial;
            fatorial -= 1;
            System.out.println(numero);
        }

        }
    }