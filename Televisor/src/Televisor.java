//classe
public class Televisor {
	//atributo
	boolean ligado;
	int canal;
	int volume;
	
	//constutor
	Televisor() {
		
	}
	
	Televisor(boolean ligado, int canal, int volume) {
		this.ligado = ligado;
		this.canal = canal;
		this.volume = volume;
	}
	
	String imprimir() {
		String statusTV;
		if(ligado == true) {
			statusTV = "ligado";
		} else {
			statusTV = "desligado";
		}
		
		return "A TV está " + statusTV + 
				". Canal: " + canal +
				". Volume: " + volume;
	}
}
