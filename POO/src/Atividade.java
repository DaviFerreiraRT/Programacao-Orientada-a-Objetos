import java.util.Scanner;
public class Atividade {
	// 3
	public static void Calc() {
		Scanner Num1 = new Scanner(System.in);
		Scanner Num2 = new Scanner(System.in);
		int a, b;
		System.out.println("Informe os dois valores ");
		a = Num1.nextInt();
		b = Num2.nextInt();
		float c = a / (float) b;
		System.out.println("A soma deu " + (a + b));
		System.out.println("A subtra��o deu " + (a - b));
		System.out.println("A multiplica��o deu " + (a * b));
		System.out.println("A divis�o deu " + c);
	}

	//
	public static void Dados() {
		String nome, endereco, filiacao, dtnasci;
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe seu nome: ");
		nome = ler.nextLine();
		System.out.println("O meu nome � " + nome);
		System.out.print("Informe seu endere�o: ");
		endereco = ler.nextLine();
		System.out.println("Eu moro em " + endereco);
		System.out.print("Informe sua data de nascimento:");
		dtnasci = ler.nextLine();
		System.out.println("Eu nasci em " + dtnasci);
		System.out.print("Informe sua filiacao: ");
		filiacao = ler.nextLine();
		System.out.println(filiacao);
	}

	// 1
	public static void Curso() {
		String nomeCurso;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o nome do seu curso: ");
		nomeCurso = ler.nextLine();
		System.out.println("O curso � de " + nomeCurso);
	}

	public static void main(String[] args) {
		int i;
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe a quest�o a ser respondida: ");
		i = ler.nextInt();
		while (i != 0) {
			if (i == 1) {
				Curso();
				break;
			}
			if (i == 2) {
				Dados();
				break;
			}
			if (i == 3) {
				Calc();
				break;
			}
		}
	}
}
