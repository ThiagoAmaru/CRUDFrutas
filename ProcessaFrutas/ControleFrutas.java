import java.util.ArrayList;
import java.util.Scanner;

public class ControleFrutas {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		ArrayList<String> listaFrutas = new ArrayList<>();
			listaFrutas.add("maca");
			listaFrutas.add("pera");
			listaFrutas.add("uva");
		
		int fechar = 1;

		while (fechar != 0) {

			System.out.println("1. Cadastrar Frutas");
			System.out.println("2. Listar Frutas");
			System.out.println("3. Excluir Frutas");
			System.out.println("4. Listar Frutas com ID");
			System.out.println("5. Modificar Fruta");
			System.out.println("6. Para encerrar");
			int num;

			String n = teclado.nextLine();
			num = Integer.parseInt(n);

			switch (num) {

			case 1:

				System.out.println("Digite o nome da fruta que deseja cadastrar: ");
				String adicionandoF = teclado.nextLine();
				listaFrutas.add(adicionandoF);
				System.out.println(listaFrutas);
				break;

			case 2:

				System.out.println(listaFrutas);
				break;

			case 3:
				for (int contador = 0; contador < (listaFrutas.size()); contador++)
					System.out.println((contador + 1) + ". " + listaFrutas.get(contador));
				System.out.println("Digite o numero referente a fruta que deseja excluir");
				String exc = teclado.nextLine();
                int excluir = Integer.parseInt(exc);
				listaFrutas.remove(excluir -1);
				System.out.println(listaFrutas);
				break;

			case 4:
				System.out.println("digite o ID");
				String id = teclado.nextLine();
                int i = Integer.parseInt(id);
				System.out.println(listaFrutas.get(i -1));
				break;

			case 5:
				for (int contador = 0; contador < (listaFrutas.size()); contador++)
					System.out.println((contador + 1) + ". " + listaFrutas.get(contador));
				System.out.println("Digite o id da fruta que deseja modificar");
				String id2 = teclado.nextLine();
				System.out.println("Digite o nome da fruta que deseja adicionar");
				String novaFruta = teclado.nextLine();
				int id3 = Integer.parseInt(id2);
				System.out.println("Voce retirou a fruta " + listaFrutas.get(id3 -1));
				listaFrutas.set(id3 -1, novaFruta);
				System.out.println("Voce adicionou a fruta " + listaFrutas.get(id3 -1));

				break;

			case 6:
				fechar = 0;
				break;

			}
			
		}
		teclado.close();
	}
}