import java.util.Scanner;

public class funcoes {
	public static void main(String[] args) {
		
		
	}
	
	public static int ex1() {
		Scanner entrada = new Scanner(System.in);
		
		int ini = 1;
		int k = 1;
		int k2 = 0;
		int atual = 1;
		
		System.out.print("Informe o número de repetições: ");
		int num = entrada.nextInt(); 
		
		while (k <= num) {
			while (k2 <= atual) {
				if (ini == 1){
					System.out.print(ini);
					k2 = atual + 1;
				} else	{	
					System.out.print( ini + " ");
					k2 = k2 + 1; 
				}
			}
			
			k2 = 1;
			ini = ini +1;
			atual = atual + 1;
			System.out.println(" ");
		
			k = k + 1;
		
		}
		
		entrada.close();
		
		return 0;		
	}
	
	public static int ex2() {
		Scanner entrada = new Scanner(System.in);
		
		int ini = 1;
		int k = 1;
		int k2 = 0;
		int atual = 1;
		
		System.out.print("Informe o número de repetições: ");
		int num = entrada.nextInt(); 
		
		while (k <= num) {
			while (k2 <= atual) {
				if (ini == 1){
					System.out.print(ini);
					k2 = atual + 1;
				} else	{
					ini = ini + 1;
					System.out.print(k2 + " ");
					k2 = k2 + 1;
				}
			}
			
			k2 = 1;
			ini = ini +1;
			atual = atual + 1;
			System.out.println(" ");
		
			k = k + 1;
		
		}
		
		entrada.close();
		
		return 0;		
	}
	
	public static int ex3() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro argumento: ");
		int num = entrada.nextInt();
		System.out.print("Informe o segundo argumento: ");
		int num2 = entrada.nextInt(); 
		System.out.print("Informe o terceiro argumento: ");
		int num3 = entrada.nextInt(); 
		
		int soma = num + num2 + num3;  
		
		entrada.close();
		
		return soma;		
	}
}