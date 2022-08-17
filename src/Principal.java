import java.util.InputMismatchException;
import java.util.Scanner;

import exception.NumeroMaiorQueOPermitidoException;
import exception.NumeroMenorQueOPermitidoException;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		
		boolean continua = true;
		do {
			try {
				System.out.println("Digite um número um número maior que 5 e menor que 50: ");
				x = sc.nextInt();
				continua = false;
				
				if(x < 5) {
					throw new NumeroMenorQueOPermitidoException("Número menor ou igual a 5...");
				}else if(x > 50) {
					throw new NumeroMaiorQueOPermitidoException("Número maior ou igual a 50...");
				}
			} catch (InputMismatchException erro) {
				System.out.println("Opss, tipo não permitido");
				erro.printStackTrace();
				sc.nextLine();
			}catch(NumeroMenorQueOPermitidoException erro) {
				erro.printStackTrace();
			}
			catch(NumeroMaiorQueOPermitidoException erro) {
				erro.printStackTrace();
			}
			
			
		} while (continua);
		
		
		
	}

}
