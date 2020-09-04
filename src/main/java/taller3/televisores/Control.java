package taller3.televisores;

public class Control {
	private TV tv;
	
	public TV getTv() {
		return tv;
	}
	public void setTv(TV tv) {
		this.tv = tv;
	}
	public void enlazar(TV tv){
		 this.tv = tv;
		 tv.setControl(this);
	}
	public void turnOn() {
		tv.estado = true;
	}
	public void turnOff() {
		tv.estado = false;
	}
	public void setCanal(int canal) {
		if (tv.estado == true && canal <=120 && canal >= 0) {
			tv.canal = canal;
		}
		
	}
	public void canalUp() {
		if (tv.canal < 120 && tv.estado == true) {
			tv.canal ++;
		}
	}
	public void canalDown() {
		if (tv.canal > 0 && tv.estado == true) {
			tv.canal --;
		}
	}
	public void volumenUp() {
		if (tv.volumen < 7 && tv.estado == true) {
			tv.volumen ++;
		}
	}
	public void volumenDown() {
		if (tv.volumen > 0 && tv.estado == true) {
			tv.volumen --;
		}
	}
	
}
