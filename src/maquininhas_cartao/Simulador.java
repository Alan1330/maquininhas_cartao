package maquininhas_cartao;

import java.util.Scanner;

public class Simulador {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double taxaDebito = 0.0199;	//recebe na hora pela conta Mercado Pago.
		double valorApagarDebito = 0.0;
		
		double taxaCreditoAvista = 0.0474;
		double taxaCreditoParceladoNaHora = 0.0531; // parcelado em 2x em diante que recebe já na mesma hora
		double taxaCredito14dias = 0.0436;			// parcelado ou avista e recebe após 14 dias.
		double taxaCredito30dias = 0.0360;			// parcelado ou avista e receve após 30 dias.
		
		
		double valorApagarCredito1x = 0.0;
		
		// grupo de 2x em na hora, 14dias e 30 dias sendo total e valor da parcela.
		double valorApagar2x = 0.0;
		double valorDaParcelaApagar2x = 0.0;
		
		double valorApagar2x14d = 0.0;
		double valorDaParcelaApagar2x14d = 0.0;
		
		double valorApagar2x30d = 0.0;
		double valorDaParcelaApagar2x30d = 0.0;
		
		//grupo de 3x em na hora, 14dias e 30 dias sendo total e valor das parcela.
		double valorApagar3x = 0.0;
		double valorDaParcelaApagar3x = 0.0;
		
		double valorApagar3x14d = 0.0;
		double valorDaParcelaApagar3x14d = 0.0;
		
		double valorApagar3x30d = 0.0;
		double valorDaParcelaApagar3x30d = 0.0;
		
		
		double valorApagarCreditoParceladoNaHora = 0.0;
		double valorApagarCreditoParcelado14dias = 0.0; 
		double valorApagarCreditoParcelado30dias = 0.0;
		
		double taxa2x = 0.0409;
		double taxa3x = 0.0541;
		double taxa4x = 0.0670;
		double taxa5x = 0.0796;
		double taxa6x = 0.0920;
		double taxa7x = 0.1041;
		double taxa8x = 0.1161;
		double taxa9x = 0.1278;
		double taxa10x = 0.1392;
		double taxa11x = 0.1505;
		double taxa12x = 0.1615;

		
		System.out.println("Vendedor, quanto deseja receber em sua Conta: R$ ");
		double valorReceber = sc.nextDouble();
		
		System.out.println("Débito ou Credito");
		char forma;
		forma = sc.next().charAt(0);  // respostas D ou C
		
		
		//avista no débito ou crédito
		
		//formula 1 de calculo para débito
		valorApagarDebito = valorReceber/(1-taxaDebito);
		
		//formula 2 de calculo para credito Avista
		valorApagarCredito1x = valorReceber/(1-taxaCreditoAvista);
		
		// todas as formulas em 2x nos prazos na hora, 14 dias, 30 dias, valor da venda e valor da parcela
		
		//formula 3 calculo para total do crédito a parcelar e receber na hora.
		valorApagar2x = valorReceber/(1-taxaCreditoParceladoNaHora-taxa2x);

		//formula 4 de calculo valor da parcela em 2x a receber na hora;
		valorDaParcelaApagar2x = valorApagar2x/2;
		
		//formula 5 calculo para total do crédito a parcelar e receber em 14 dias
		valorApagar2x14d = valorReceber/(1-taxaCredito14dias-taxa2x);
		
		//formula 6 de calculo valor da parcela em 2x a receber em 14 dias;
		valorDaParcelaApagar2x14d = valorApagar2x14d/2;
		
		//formula 7 calculo para total do crédito a parcelar e receber em 30 dias
		valorApagar2x30d = valorReceber/(1-taxaCredito30dias-taxa2x);
		
		//formula 8 de calculo valor da parcela em 2x a receber em 30 dias;
		valorDaParcelaApagar2x30d = valorApagar2x30d/2;
		
		//Em 3x
		
		//formula 9 calculo para total do crédito a parcelar e receber na hora.
		valorApagar3x = valorReceber/(1-taxaCreditoParceladoNaHora-taxa3x);

		//formula 10 de calculo valor da parcela em 3x a receber na hora;
		valorDaParcelaApagar3x = valorApagar3x/3;
		
		//formula 11 calculo para total do crédito a parcelar 3x e receber em 14 dias
		valorApagar3x14d = valorReceber/(1-taxaCredito14dias-taxa3x);
		
		//formula 12 de calculo valor da parcela em 3x a receber em 14 dias;
		valorDaParcelaApagar3x14d = valorApagar3x14d/3;
		
		//formula 13 calculo para total do crédito a parcelar em 3x e receber em 30 dias
		valorApagar3x30d = valorReceber/(1-taxaCredito30dias-taxa3x);
		
		//formula 14 de calculo valor da parcela em 3x a receber em 30 dias;
		valorDaParcelaApagar3x30d = valorApagar3x30d/3;
		
		if(forma == 'd'|| forma =='D') {
			System.out.printf("O valor ideal a cobrar no débito é R$ %.2f e recebe na hora.%n ", valorApagarDebito);
		}
		
		if(forma == 'c' || forma == 'C') {
			System.out.println("Avista ou parcelado? ");
			char avpcld = sc.next().charAt(0);
			if(avpcld == 'p' ||avpcld == 'P') { //respostas 1 - Avista ou 2-parcelado
				
				System.out.println("Em quantas parcelas o cliente quer: ");
				int parcela = sc.nextInt(); //respostas 2 ou 3. 
				
				//System.out.println("Em qual prazo: na hora(nh), 14 dias (14d) ou 30 dias (30d): ");
				//String prazo = "nh";
				//prazo = sc.next(); //respostas nh, 14d, 30d
				
				switch(parcela){
				
					case 2:
						System.out.printf("Valor ideal a cobrar R$ %.2f em 2 x R$ %.2f a receber na hora.%n", valorApagar2x , valorDaParcelaApagar2x);
						System.out.printf("Valor ideal a cobrar R$ %.2f em 2 x R$ %.2f a receber em 14 dias.%n", valorApagar2x14d , valorDaParcelaApagar2x14d);
						System.out.printf("Valor ideal a cobrar R$ %.2f em 2 x R$ %.2f a receber em 30 dias.%n", valorApagar2x30d , valorDaParcelaApagar2x30d);
					break;
					
					case 3:
						System.out.printf("Valor ideal a cobrar R$ %.2f em 3 x R$ %.2f a receber na hora.%n", valorApagar3x , valorDaParcelaApagar3x);
						System.out.printf("Valor ideal a cobrar R$ %.2f em 3 x R$ %.2f a receber em 14 dias.%n", valorApagar3x14d , valorDaParcelaApagar3x14d);
						System.out.printf("Valor ideal a cobrar R$ %.2f em 3 x R$ %.2f a receber em 30 dias.%n", valorApagar3x30d , valorDaParcelaApagar3x30d);
					break;
					
					default:
					System.out.printf("Valor ideal a cobrar não possivel calcular. ");
					break;
					
					}//fim switch
				}//fim avpcld
		
		}
		
		
		
		//System.out.printf("no Débito o cliente pagara: R$ %.2f.%n" , valorApagarDebito );
		//System.out.printf("no crédito a vista cliente pagara: R$ %.2f.%n" , valorApagarCredito1x );
		// olSystem.out.printf("no credito parcelado em 2x de R$ %.2f e total R$ %.2f.%n" , valorDaParcelaApagar2x , valorApagar2x);
		
		
			
		sc.close();
	}

	}

