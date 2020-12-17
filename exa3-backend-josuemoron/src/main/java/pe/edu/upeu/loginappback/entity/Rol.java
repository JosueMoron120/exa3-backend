package pe.edu.upeu.loginappback.entity;

import lombok.Data;

@Data
public class Rol {
	private int idrol;
	private String nombre;
	public Rol() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdrol() {
		return idrol;
	}
	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Rol(int idrol, String nombre) {
		super();
		this.idrol = idrol;
		this.nombre = nombre;
	}
}