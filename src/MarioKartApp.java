import javax.swing.JOptionPane;

public class MarioKartApp {

	public static void main(String[] args) {

		Competicion juanDeColoniaRace = new Competicion("Senda Arco Iris", "img/rainbowroad_map.png", 250, 3);
		
		PilotoKart mario = new PilotoKart("Mario", "img/mario.png", new int[] {3, 3, 3, 4, 3});
		PilotoKart luigi = new PilotoKart("Luigi", "img/luigi.png", new int[] {3, 3, 3, 4, 3});
		PilotoKart peach = new PilotoKart("Peach", "img/peach.png", new int[] {2, 4, 2, 4, 3});
		PilotoKart yoshi = new PilotoKart("Yoshi", "img/yoshi.png", new int[] {2, 3, 3, 3, 4});
		PilotoKart bowser = new PilotoKart("Bowser", "img/bowser.png", new int[] {5, 1, 5, 1, 3});
		PilotoKart donkeykong = new PilotoKart("Donkey Kong", "img/donkeykong.png", new int[] {4, 2, 4, 2, 2});
		PilotoKart toad = new PilotoKart("Toad", "img/toad.png", new int[] {1, 4, 1, 5, 4});
		PilotoKart koopa = new PilotoKart("Koopa", "img/koopa.png", new int[] {1, 5, 2, 4, 3});
		PilotoKart daisy = new PilotoKart("Daisy", "img/daisy.png", new int[] {2, 4, 2, 4, 3});
		PilotoKart wario = new PilotoKart("Wario", "img/wario.png", new int[] {5, 1, 5, 1, 2});
		
		PilotoKart[] pilotosJuanDeColoniaRace = { mario, luigi, peach, yoshi, bowser, donkeykong, toad, koopa, daisy, wario };
		
		juanDeColoniaRace.setParticipantes(pilotosJuanDeColoniaRace);
		
		iniciarCompeticion(juanDeColoniaRace);
	}
	
	public static void iniciarCompeticion(Competicion competicion) {
			
	}

}
