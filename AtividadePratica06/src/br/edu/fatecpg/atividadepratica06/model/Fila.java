package br.edu.fatecpg.atividadepratica06.model;

public class Fila {
	private int numPacientes;
	
	public Fila(int numPacientes) {
		this.numPacientes = numPacientes;
	}
	
	public int getNumPacientes() {
		return this.numPacientes;
	}
	
	
	public void receberPaciente(int qtd) {
		if(qtd > 0) {
			this.numPacientes += qtd;
		} else {
			System.out.println("Número Inválido!");
		}
	}
	
	public void atenderPaciente(int qtd) {
		if(qtd > 0 && qtd < 3) {
			if(this.numPacientes > qtd) {
				this.numPacientes -= qtd;
				System.out.println(qtd + " Paciente(s) foram antendidos, os médicos estão livres para o próximo atendimento.");
			} else if (this.numPacientes == 1) {
				this.numPacientes -= 1;
				System.out.println("O último paciente foi atendido.");
			} else {
				System.out.println("A fila está vazia.");
			}
		} else {
			System.out.println("Número Inválido, no mínimo 1 paciente deve ser atendido e no máximo 2 pacientes podem ser atendidos.");
		}
	}

}
