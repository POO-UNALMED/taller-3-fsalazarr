package taller3.televisores;

public class TV {
	private Marca marca;
	int canal = 1;
	private int precio = 500;
	boolean estado;
	int volumen = 1;
	private Control control;
	private static int numTV;
	
	public void turnOn() {
		estado = true;
	}
	public void turnOff() {
		estado = false;
	}
	public boolean getEstado() {
		return estado;
	}
	{
		numTV ++;
	}
	public void canalUp() {
		if (canal < 120 && estado == true) {
			canal ++;
		}
		
	}
	public void canalDown() {
		if (canal > 0 && estado == true) {
			canal --;
		}
	}
	public void volumenUp() {
		if (volumen < 7 && estado == true) {
			volumen ++;
		}
	}
	public void volumenDown() {
		if (volumen > 0 && estado == true) {
			volumen --;
		}
	}
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	public static int getNumTV() {
		return numTV;
	}
	public TV(Marca brand, boolean status) {
		marca = brand;
		estado = status;
	}
	public int getCanal() {
		return canal;
	}
	public Marca getMarca() {
		return marca;
	}
	public Control getControl() {
		return control;
	}
	public int getPrecio() {
		return precio;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setCanal(int canal) {
		if (estado == true && canal <=120 && canal >= 0) {
			this.canal = canal;
		}
	}
	public void setControl(Control control) {
		this.control = control;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void setVolumen(int volumen) {
		if (estado == true && volumen <=7 && canal >= 0) {
			this.volumen = volumen;
		}	
	}
	
}
