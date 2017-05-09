import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Televisor tv = new Televisor(); //instanciar
		
		System.out.println("Bem vindo a TV do futuro");
		System.out.println("");
		
		int i = 1;
		while(i == 1) {
			System.out.println("Digite L para ligar a TV ou S para sair");
			Scanner leitor = new Scanner(System.in);
			String acao = leitor.next();
			if(acao.equals("L") || acao.equals("l")) {
				tv.ligado = true;
				System.out.println("A TV está ligada!");
				System.out.println("Informe o canal inicial: ");
				tv.canal = leitor.nextInt();
				System.out.println("Informe o volume inicial: ");
				tv.volume = leitor.nextInt();
				System.out.println(tv.imprimir());
				break;
			} else if (acao.equals("S") || acao.equals("s")) {
				System.out.println("Adeus!");
				break;
			} else {
				System.out.println("Opção inválida!");
			}
		}
		
		
		
		/*Televisor tv2 = new Televisor();
		tv2.ligado = true;
		tv2.canal = 11;
		tv2.volume = 77;
		System.out.println(tv2.imprimir());*/

	}

}
