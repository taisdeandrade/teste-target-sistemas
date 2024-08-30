import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int entrada = 0;
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero.");
        entrada = scanner.nextInt();

        calculaFibonacci(entrada);
        
        scanner.close();

        
    }

    private static void calculaFibonacci(int entrada)
    {
        int primeiro = 0;
        int segundo = 1;
        int resultado = 0;

        for (int i = 0; i < entrada; i++)
        {
            resultado = primeiro + segundo;
            primeiro = segundo;
            segundo = resultado;

            System.out.println(resultado);

        }
    }
    
}
