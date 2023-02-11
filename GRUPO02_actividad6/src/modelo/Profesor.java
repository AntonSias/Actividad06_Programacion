package modelo;

import modeloDao.Persona;

public class Profesor extends Persona {
	
	private String competencias;
	
	

	public Profesor() {
		super();
	}

	public Profesor(String competencias) {
		super();
		this.competencias = competencias;
	}

	public String getCompetencias() {
		return competencias;
	}

	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}

	
	//MÉTODOS 
	
	@Override
	public String toString() {
		return "Profesor [competencias=" + competencias + ", nif=" + nif + ", nombre=" + nombre + ", direccion="
				+ direccion + ", telefono=" + telefono + "]";
	}
	
	public String ponerNotas() {
		return "El profesor " + this.nombre + " va a corregir los exámenes";
	}
	
	
	public String trabajar() {
		return "El profesor " + this.nombre + " va a impartir su clase";
	}

	
	
	
	
	
	
}
