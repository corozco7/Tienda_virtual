package modelo;

public class Cliente_DTO {
private int documento;
private String nombre;
private String apellido;
private String direccion;
private String telefono;
private String correo;

public Cliente_DTO(int documento, String nombre, String apellido, String direccion, String telefono, String correo) {
	super();
	this.documento = documento;
	this.nombre = nombre;
	this.apellido = apellido;
	this.direccion = direccion;
	this.telefono = telefono;
	this.correo = correo;
}

public Cliente_DTO(int documento) {
	super();
	this.documento = documento;
}

public int getDocumento() {
	return documento;
}

public void setDocumento(int documento) {
	this.documento = documento;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public String getCorreo() {
	return correo;
}

public void setCorreo(String correo) {
	this.correo = correo;
}











}