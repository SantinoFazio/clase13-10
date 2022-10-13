package biblioteca;

public class Libro {

	private String nomb,a�opb;
	private int cant,costo;
	private Autor autor;
	private Editorial editorial;
	
	public Libro(String nomb, String a�opb, int cant, int costo, Autor autor, Editorial nombre) {
	
		super();
		this.nomb = nomb;
		this.a�opb = a�opb;
		this.cant = cant;
		this.costo = costo;
		this.autor = autor;
		this.editorial = editorial;
	}
	public String getNomb() {
		return nomb;
	}
	public void setNomb(String nomb) {
		this.nomb = nomb;
	}
	public String getA�opb() {
		return a�opb;
	}
	public void setA�opb(String a�opb) {
		this.a�opb = a�opb;
	}
	public int getCant() {
		return cant;
	}
	public void setCant(int cant) {
		this.cant = cant;
	}
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public Editorial getNombre() {
		return editorial;
	}
	public void setNombre(Editorial nombre) {
		this.editorial = nombre;
	}
	@Override
	public String toString() {
		return "libro [nomb=" + nomb + ", a�opb=" + a�opb + ", cant=" + cant + ", costo=" + costo + ", autor=" + autor
				+ ", nombre=" + editorial + "]";
	}
	
	
}
