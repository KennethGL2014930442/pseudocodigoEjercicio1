import java .util.*;

public class ejercicio1{
	
	public static void main(String[] args){
		int num;
		
		Scanner scanner = new Scanner(System.in);
		
		int contadorpar = 0;
		int contadorimpar = 0;
		
		System.out.println("Ingrese un numero entero: ");
		num = scanner.nextInt();
		
		for (int i = 0; i<=num; i++){
			int numero = (int)(Math.random()*100+1);
			
			System.out.println("Los numeros aleatorios son: "+numero);
			
			if ((numero%2)==0){
				contadorpar = contadorpar+1;
			}else{
				contadorimpar = contadorimpar+1;
			}
		}
		
		System.out.println("Los numeros pares son en total: "+contadorpar);
		System.out.println("Los numeros impares son en total: "+contadorimpar);
	}
}