package application;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char sexo;
		int cerveja, refri, espetinho;
		double consumo, cover, ingresso, total;
		
		System.out.print("Sexo: ");
		sexo = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		cerveja = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		refri = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		espetinho = sc.nextInt();
		System.out.println();

		if (sexo == 'f' || sexo == 'F'){
			ingresso = 8.0;
		}
		else {
			ingresso = 10.0;
		}
		consumo = cerveja * 5 + refri * 3 + espetinho * 7;
		if (consumo > 30.0){
			cover = 0.0;
		}
		else {
			cover = 4.0;
		}
		total = ingresso + consumo + cover;
		
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = R$ %.2f%n", consumo);
		if (ingresso == 4.0){
			System.out.printf("Cover = R$ %.2f%n", cover);
		}
		else {
			System.out.println("Isento de cover");
		}
		System.out.printf("Ingresso = R$ %.2f%n%n", ingresso);
		System.out.printf("Valor a pagar = R$ %.2f%n", total);
	}
}
