package modelo;

import modeloDao.Persona;

public class Administrativo extends Persona {
	
	private String tareas;

	public Administrativo() {
		super();
	}

	public Administrativo(String tareas) {
		super();
		this.tareas = tareas;
	}

	public String getTareas() {
		return tareas;
	}

	public void setTareas(String tareas) {
		this.tareas = tareas;
	}

	@Override
	public String toString() {
		return "Administrativo [tareas=" + tareas + ", nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", telefono=" + telefono + "]";
	}
	
	
	//MÉTODOS
	
	public String trabajar() {
		return "El administrativo " + this.nombre + " va a realizar estas tareas: " + this.tareas;
	}
	
	public String gestionarMatricula() {
		return "El administrativo " + this.nombre + " va a gestionar una matrícula";
	}

}
