package br.com.idtrust.dev.junior.exercíciosIdTrust;
import java.util.ArrayList;

public class exercicioExtra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-----------------------");
		System.out.println("Exercicio Extra 1 :");
		
		// Criando um ArrayList para armazenar os dados. 
		ArrayList<listaExercicioExtra> lista = new ArrayList<listaExercicioExtra>();
	    lista.add(new listaExercicioExtra("masculino", 74));
	    lista.add(new listaExercicioExtra("feminino", 4));
	    lista.add(new listaExercicioExtra("feminino", 13));
	    lista.add(new listaExercicioExtra("masculino", 60));
	    lista.add(new listaExercicioExtra("masculino", 19));
	    lista.add(new listaExercicioExtra("feminino", 60));
		
	    // Criando um For para percorrer o ArrayList fazendo as validações com IF/Else
	    for (int i = 0; i < lista.size(); i++) {
	    	//Validando Sexo Masculino e Idade >= 65
			if (lista.get(i).getSexo().equalsIgnoreCase("masculino" ) && lista.get(i).getIdade() >= 65 ||
					//Validando Sexo Feminino e Idade >= 60
					lista.get(i).getSexo().equalsIgnoreCase("feminino" ) && lista.get(i).getIdade() >= 60) {
				//Validando Sexo para escrever Aposentada ou Aposentado
				if (lista.get(i).getSexo().equalsIgnoreCase("feminino" )) {
					System.out.println(lista.get(i).getDados()+" APOSENTADA");
				}else System.out.println(lista.get(i).getDados()+" APOSENTADO");
					//validando se a pessoa tem entre 13 e 18 anos 
			} else if (lista.get(i).getIdade() >= 13  && lista.get(i).getIdade() <= 18) {
				System.out.println(lista.get(i).getDados()+" ADOLESCENTE");
					//Validando se a pessoa tem menos de 13 anos
			}else if (lista.get(i).getIdade() < 13) {
				System.out.println(lista.get(i).getDados()+" CRIANÇAS");
					//Caso não for nenhuma das Validações a cima é um adulto.
			} else System.out.println(lista.get(i).getDados()+" ADULTO");
		}
		
		System.out.println("-----------------------");
		System.out.println("Exercicio Extra 2 :");
		int contador =  3;
		int soma  = 57;
		
		for (;contador <= 10; contador++) {
			if (contador < 5 || contador == 8 ) {
				soma = soma - contador;
			} else {
				soma = soma + contador;
			}
			
		}
		
		System.out.println("O valor da soma é " + soma);
		System.out.println("Resposta Correta Letra C ");
		
		//Logica do Script 
		// Cont = 3 
		// Soma = 57 - 3 = 54
		// Cont = 4
		// Soma = 54 - 4 = 50
		// Cont = 5 
		// Soma = 50 + 5 = 55
		// Cont = 6 
		// Soma = 55 + 6 = 61
		// Cont = 7
		// Soma = 61 + 7 = 68
		// Cont = 8
		// Soma = 68 - 8 = 60
		// Cont = 9
		// Soma = 60 + 9 = 69
		// Cont = 10
		// Soma = 69 + 10 = 79
		// Resposta Correta Letra C
		
	}

}
