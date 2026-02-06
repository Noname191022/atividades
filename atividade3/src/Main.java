//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int valor1 = 1;
        int valor2 = 1;
        int contador = 1;
        while (contador < 1000){
            valor1 = valor1 + valor2;
            System.out.println(valor1);
            contador+=1;
        }
    }
}