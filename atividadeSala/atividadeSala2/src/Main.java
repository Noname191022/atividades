import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a hora desejada");
        int hora = sc.nextInt();

        int minuto = hora*60;
        System.out.println(hora+"Hora(s) em minutis é: "+minuto+" Minutos");

    }
}