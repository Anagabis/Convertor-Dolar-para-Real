package Convertor;


import java.util.Scanner;

public class ConversorDolarParaReal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Defina a taxa de câmbio fixa (exemplo: 1 dólar = 5 reais)
        double taxaCambio = 5.0;
        
        System.out.print("Digite o valor em dólares: ");
        double dolares = scanner.nextDouble();
        
        // Converta para reais
        double reais = dolares * taxaCambio;
        
        System.out.printf("%.2f dólares equivalem a %.2f reais.%n", dolares, reais);
        
        scanner.close();
    }
}

/** Ana Sabio **/