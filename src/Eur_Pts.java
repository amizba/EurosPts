/**
* Conversor de euros a pesetas.
*
* @author Amparo Izquierdo
* @mail   amizba@gmail.com
* @url    https://empezandojava.blogspot.com/
*
*/

import java.util.Scanner;

public class Eur_Pts {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Por favor, introduce la cantidad de euros que quieres convertir: ");
		double euros = sc.nextDouble();
		int pesetas = (int) (euros * 166.386);
		System.out.print(euros + " euros son " + pesetas + " pesetas.");




	}

}
