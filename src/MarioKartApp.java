import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class MarioKartApp {

	public static void main(String[] args) {

		Competicion juanDeColoniaRace = new Competicion("Senda Arco Iris", "img/rainbowroad_map.png", 250, 3);

		PilotoKart mario = new PilotoKart("Mario", "img/mario.png", new int[] { 3, 3, 3, 4, 3 });
		PilotoKart luigi = new PilotoKart("Luigi", "img/luigi.png", new int[] { 3, 3, 3, 4, 3 });
		PilotoKart peach = new PilotoKart("Peach", "img/peach.png", new int[] { 2, 4, 2, 4, 3 });
		PilotoKart yoshi = new PilotoKart("Yoshi", "img/yoshi.png", new int[] { 2, 3, 3, 3, 4 });
		PilotoKart bowser = new PilotoKart("Bowser", "img/bowser.png", new int[] { 5, 1, 5, 1, 3 });
		PilotoKart donkeykong = new PilotoKart("Donkey Kong", "img/donkeykong.png", new int[] { 4, 2, 4, 2, 2 });
		PilotoKart toad = new PilotoKart("Toad", "img/toad.png", new int[] { 1, 4, 1, 5, 4 });
		PilotoKart koopa = new PilotoKart("Koopa", "img/koopa.png", new int[] { 1, 5, 2, 4, 3 });
		PilotoKart daisy = new PilotoKart("Daisy", "img/daisy.png", new int[] { 2, 4, 2, 4, 3 });
		PilotoKart wario = new PilotoKart("Wario", "img/wario.png", new int[] { 5, 1, 5, 1, 2 });

		PilotoKart[] pilotosJuanDeColoniaRace = { mario, luigi, peach, yoshi, bowser, donkeykong, toad, koopa, daisy,
				wario };

		juanDeColoniaRace.setParticipantes(pilotosJuanDeColoniaRace);

		iniciarCompeticion(juanDeColoniaRace);
		menuPilotos(pilotosJuanDeColoniaRace);

	}

	public static void iniciarCompeticion(Competicion competicion) {

		ImageIcon fotoMapa = new ImageIcon(competicion.getImagenMapa());
		UIManager.put("OptionPane.okButtonText", "Aceptar"); // Para cambiar el texto del boton y que ponga "Aceptar" en
																// vez de "OK"
		JOptionPane.showMessageDialog(null, competicion.mostrarDatosCompeticion(),
				"SUPER MARIO KART: " + competicion.getCircuito(), JOptionPane.PLAIN_MESSAGE, fotoMapa);

	}

	public static void menuPilotos(PilotoKart[] piloto) {

		int posicion = 0;

		while (JOptionPane.CLOSED_OPTION == -1) {

			ImageIcon fotoPiloto = new ImageIcon(piloto[posicion].getImagen());

			// Crear el array de opciones
			String[] opciones = { "Anterior", "Seleccionar piloto", "Siguiente" };

			// Mostrar el JOptionPane con los botones y obtener el botón seleccionado
			int seleccion= 0;
			if (piloto[posicion].isSeleccionado()) {
				seleccion = JOptionPane.showOptionDialog(null, piloto[posicion].mostrarDatosPiloto() + "\n PILOTO SELECCIONADO",
						"Piloto: " + piloto[posicion].getPiloto(),
						JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, fotoPiloto, opciones, opciones[1]);
			} else {
				seleccion = JOptionPane.showOptionDialog(null, piloto[posicion].mostrarDatosPiloto(),
						"Piloto: " + piloto[posicion].getPiloto(),
						JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, fotoPiloto, opciones, opciones[1]);
			}

			// Realizar una acción dependiendo del botón seleccionado
			if (seleccion == 0) {
				posicion--;
			} else if (seleccion == 1) {

				for (int i = 0; i < piloto.length; i++) {
					piloto[i].setSeleccionado(false);
				}
				;
				piloto[posicion].setSeleccionado(true);

			} else if (seleccion == 2) {
				posicion++;
			}

			if (posicion == piloto.length) {
				posicion = 0;
			} else if (posicion < 0) {
				posicion = piloto.length - 1;
			}

		}
	}

	public static void seleccionPiloto(PilotoKart piloto) {

		if (piloto.isSeleccionado()) {

		}
	}

}
