import java.time.LocalTime;

public class Competicion {

	private String circuito;
	private String imagenMapa;
	private int cilindrada;
	private int vueltas;
	private LocalTime vueltaRapida;
	private PilotoKart[] participantes;

	public Competicion(String circuito, String imagenMapa, int cilindrada, int vueltas) {
		this.circuito = circuito;
		this.imagenMapa = imagenMapa;
		this.cilindrada = cilindrada;
		this.vueltas = vueltas;
		this.vueltaRapida = LocalTime.parse("00:00:00.000");
	}

	public String getCircuito() {
		return circuito;
	}

	public void setCircuito(String circuito) {
		this.circuito = circuito;
	}

	public String getImagenMapa() {
		return imagenMapa;
	}

	public void setImagenMapa(String imagenMapa) {
		this.imagenMapa = imagenMapa;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getVueltas() {
		return vueltas;
	}

	public void setVueltas(int vueltas) {
		this.vueltas = vueltas;
	}

	public LocalTime getVueltaRapida() {
		return vueltaRapida;
	}

	public void setVueltaRapida(LocalTime vueltaRapida) {
		this.vueltaRapida = vueltaRapida;
	}

	public PilotoKart[] getParticipantes() {
		return participantes;
	}

	public void setParticipantes(PilotoKart[] participantes) {
		this.participantes = participantes;
	}

	public String mostrarDatosCompeticion() {

		return "COMPETICION SUPER MARIO KART \n ------------------------------------------------ \n "
				+ this.getCircuito() + "\n" + this.getCilindrada() + "cc - "
				+ this.getVueltas() + " vueltas \n" + this.getParticipantes().length
				+ " pilotos \n" + "Vuelta rápida: " + this.getVueltaRapida();
	}

}
