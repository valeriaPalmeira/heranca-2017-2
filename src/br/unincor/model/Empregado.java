package br.unincor.model;

public class Empregado extends Pessoa {
	private Double salario;
	private String matricula;
	
	
	public Empregado(String nome, Integer idade, String sexo, Double salario, String matricula) {
		super(nome, idade, sexo);
		this.salario = salario;
		this.matricula = matricula;
	}


	public Double getSalario() {
		return salario;
	}


	public void setSalario(Double salario) {
		this.salario = salario;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	@Override
	public String toString() {
		return super.toString() + "Empregado [salario=" + salario + ", matricula=" + matricula + "]";
	}
	
	public Double valorIns(){
		return this.salario * 0.11;
	}
	
	
	

}
