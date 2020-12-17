package pe.edu.upeu.loginappback.entity;

import lombok.Data;

@Data
public class Usuario {
	private int idusuario;
	private String username;
	private String password;
	private int estado;
	private int idpersona;
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public Usuario(int idusuario, String username, String password, int estado, int idpersona) {
		super();
		this.idusuario = idusuario;
		this.username = username;
		this.password = password;
		this.estado = estado;
		this.idpersona = idpersona;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}

}
