package clasesDatos;

import java.util.Objects;

public class Empleado {
	private String dni;
	private String nombre;
	private String apellidos;
	private String categ;
	private int edad;
	private boolean clubSocial; // Indica si el empleado esta en el club social de la empresa
	private float sueldo;
	
	
	/**
	 * @param dni
	 * @param nombre
	 * @param apellidos
	 * @param categ
	 * @param edad
	 * @param clubSocial
	 * @param sueldo
	 */
	//Constructor completo
	public Empleado(String dni, String nombre, String apellidos, String categ, int edad, boolean clubSocial,
			float sueldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.categ = categ;
		this.edad = edad;
		this.clubSocial = clubSocial;
		this.sueldo = sueldo;
	}
	
	//Constructor vacio
	public Empleado() {
		super();
		dni = "";
		nombre = "***********";
		apellidos = "*********";
		categ = "Base";
		this.edad = 0;
		this.clubSocial = false;
		this.sueldo = (float) 0.0;
	}
	//Constructor parcial
	/**
	 * @param dni
	 * @param nombre
	 * @param apellidos
	 */
	public Empleado(String dni, String nombre, String apellidos) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		
	//Getters y setters
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCateg() {
		return categ;
	}
	public void setCateg(String categ) {
		this.categ = categ;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isClubSocial() {
		return clubSocial;
	}
	public void setClubSocial(boolean clubSocial) {
		this.clubSocial = clubSocial;
	}
	public void setClubSocial() {
		this.clubSocial = (sueldo > 2000);
	}
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	// To String
	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", categ=" + categ
				+ ", edad=" + edad + ", clubSocial=" + clubSocial + ", sueldo=" + sueldo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, dni, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(dni, other.dni)
				&& Objects.equals(nombre, other.nombre);
	
	/*
	 * if (other.getDni().equals(dni) && other.getEdad()== edad) return true; else
	 * return false;
	 */
	}
	
}
