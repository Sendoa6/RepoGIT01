package clasesDatos;

public class Empleado {
	private String dni;
	private String nombre;
	private String apellidos;
	private String categ;
	private int edad;
	private boolean clubSocial; // Indica si el empleado esta en el club social de la empresa
	private float sueldo;
	
	
	/**
	 * @param dNI
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
	}
}
