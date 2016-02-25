

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor;
		int res;
		String resp;
		int cont = 0;
		do{
			System.out.println("Dime el valor: ");
			valor = teclado.nextInt();
				for(int i =0;i<11;i++){
					System.out.println(valor + "X" + i + ":" );
					res=teclado.nextInt();
						if(valor * i == res){
							System.out.println("correcto");
						}else{
							System.out.println("Incorrecto");
							cont = cont + 1;
						}
				}
						System.out.println(cont + "errores");
						System.out.println("Desea continuar s/n");
						resp = teclado.nextLine();
			
		}while(resp.equals("s"));
		

	}

}
