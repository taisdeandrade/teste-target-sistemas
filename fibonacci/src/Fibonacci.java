import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int entrada = 0;
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero.");
        entrada = scanner.nextInt();

        int x = calculaFibonacci(entrada);
        
        if(entrada == x)
        {
            System.out.println("Esse numero pertence a sequencia de Fibonacci.");

        }
        else{
            System.out.println("Esse numero nao pertence a sequencia de Fibonacci.");

        }

        scanner.close();

        
    }

    private static int calculaFibonacci(int entrada)
    {
        int primeiro = 0;
        int segundo = 1;
        int resultado = 0;

        for (int i = 0; i <= entrada; i++)
        {
            resultado = primeiro + segundo;
            primeiro = segundo;
            segundo = resultado;
            if (resultado == entrada)
            {
                break;
            }

        }
        return resultado;
    }
    
}
