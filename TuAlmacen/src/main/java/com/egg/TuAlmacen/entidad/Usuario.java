package com.egg.TuAlmacen.entidad;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Usuario {
 @Id	
 private String id;
 private String usuario;
 private String password;
 private String email;
 @OneToOne
 private Rol rol;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getUsuario() {
	return usuario;
}
public void setUsuario(String usuario) {
	this.usuario = usuario;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Roles getRoles() {
	return roles;
}
public void setRoles(Roles roles) {
	this.roles = roles;
}
 
 
}