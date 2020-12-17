package pe.edu.upeu.loginappback.entity;

import lombok.Data;

@Data
public class Persona {
	private int idpersona;
	private String nombres;
	private String dni;
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdpersona() {
		return idpersona;
	}
	public Persona(int idpersona, String nombres, String dni) {
		super();
		this.idpersona = idpersona;
		this.nombres = nombres;
		this.dni = dni;
	}
	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
}
