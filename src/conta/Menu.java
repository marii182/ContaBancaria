package conta;

import java.util.Scanner;

import conta.model.Conta;
import conta.model.Conta;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(123456, 123, 1, "Maria dos Santos", 2500.0f);
		c1.visualizar();
		c1.sacar(12000.0f);
		c1.visualizar();
		c1.depositar(5000.0f);
		c1.visualizar();
		System.out.println();
		
		/*System.out.println("Nome do Tilular: " + c1.getTitular());
		System.out.println("Saldo da Conta: " + c1.getSaldo());
		System.out.println();
		
		c1.setSaldo(10000.0f);
		System.out.println("Saldo da Conta: " + c1.getSaldo());*/
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println(Cores.TEXT_WHITE_BOLD + "            1 - Criar Conta                          ");
			System.out.println(Cores.TEXT_WHITE_BOLD + "            2 - Listar todas as Contas               ");
			System.out.println(Cores.TEXT_WHITE_BOLD + "            3 - Buscar Conta por Numero              ");
			System.out.println(Cores.TEXT_WHITE_BOLD + "            4 - Atualizar Dados da Conta             ");
			System.out.println(Cores.TEXT_WHITE_BOLD + "            5 - Apagar Conta                         ");
			System.out.println(Cores.TEXT_WHITE_BOLD + "            6 - Sacar                                ");
			System.out.println(Cores.TEXT_WHITE_BOLD + "            7 - Depositar                            ");
			System.out.println(Cores.TEXT_WHITE_BOLD + "            8 - Transferir valores entre Contas      ");
			System.out.println(Cores.TEXT_RED_BOLD +"            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println(Cores.TEXT_YELLOW_BOLD + "*****************************************************");
			System.out.println(Cores.TEXT_WHITE_BOLD + "Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			
			opcao = leia.nextInt();
			
			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1:
				System.out.println("Criar conta\n\n");
				break;
			case 2:
				System.out.println("Listar todas as contas\n\n");
				break;
			case 3:
				System.out.println("Consultar dados da conta - por número\n\n");
				break;
			case 4:
				System.out.println("Atualizar dados da conta\n\n");
				break;
			case 5:
				System.out.println("Apagar a conta\n\n");
				break;
			case 6:
				System.out.println("Saque\n\n");
				break;
			case 7:
				System.out.println("Depóstito\n\n");
				break;
			case 8:
				System.out.println("Transferência entre contas\n\n");
				break;
			default:
				System.out.println("Opção Inválida!\n");
				break;
			}
		}
		
	}
		public static void sobre() {
			System.out.println("\n*********************************************************");
			System.out.println("Projeto Desenvolvido por: Maria Xavier ");
			System.out.println("E-mail: maria.xxvier05@gmail.com");
			System.out.println("github.com/marii182");
			System.out.println("*********************************************************");
	}

}
