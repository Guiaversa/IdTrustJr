package br.com.idtrust.dev.junior.exercíciosIdTrust;


//Classe com informações nescessarias para cadastrar uma pessoa.
public class listaExercicioExtra {

	private String sexo;
	private int idade;
	
	public listaExercicioExtra() {
		
	}

	public listaExercicioExtra(String sexo, int idade) {
		this.sexo = sexo;
		this.idade = idade;
	}
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getDados() {
		
		return "Sexo: "+this.sexo+" Idade: "+this.idade;
	}
	
}
