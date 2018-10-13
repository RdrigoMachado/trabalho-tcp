
public abstract class Instrumento {
	
	private int BPM = 0;
	private int volume = 0;
		
	
	abstract void toca_som(String letra);
	
	void aumenta_volume(int valor) {
		this.volume += valor;
	}
	
	void diminiu_volume(int valor) {
		this.volume -= valor;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getBPM() {
		return BPM;
	}

	public void setBPM(int bPM) {
		BPM = bPM;
	}
}