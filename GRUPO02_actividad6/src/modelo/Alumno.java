package modelo;
import modeloDao.Persona;

public class Alumno extends Persona {
	
	private String curso;
	

	public Alumno() {
		super();
	}


	public Alumno(String curso) {
		super();
		this.curso = curso;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	@Override
	public String toString() {
		return "Alumno [curso=" + curso + ", nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", telefono=" + telefono + "]";
	}
	
	
	//MÉTODOS
	
	public String trabajar() {
		return "El alumno " + this.nombre + "va a estudiar para el curso " + this.curso;
	}
	
	public String hacerExamen() {
		return "El alumno " + this.nombre + "va a hacer su examen";
	}
	
	

}
