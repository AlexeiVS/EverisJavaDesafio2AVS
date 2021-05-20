package operators;

/**
 * 
 * @author Alexei Viadero
 *
 */

public class Pinball {

	private final int holeOne = 30;
	private final int holeTwo = 50;
	private final int holeThree = 100;
	private final int holeFour = 80;
	private final int holeFive = 10;
	private final int bridgeOne = 5;
	private final int bridgeTwo = 25;
	private final int tunnelOne = 15;
	private final int tunnelTwo = 75;
	
	int score = 0;
	int sum = 0;
	int valorBola = score;

	/**
	 * 
	 * @param road
	 */
	public void bolaMovimiento(int road) {

		// Numero aleatorio desde 0 al 9 en un bucle
		for (int i = 0; i < 1000; i++) {
			valorBola = (int) Math.random() * 9;

			switch (valorBola) {
			case 1:
				road = holeOne;
			case 2:
				road = holeTwo;
			case 3:
				road = holeThree;
			case 4:
				road = holeFour;
			case 5:
				road = holeFive;
			case 6:
				road = bridgeOne;
			case 7:
				road = bridgeTwo;
			case 8:
				road = tunnelOne;
			case 9:
				road = tunnelTwo;
			case 0:
				break;

			}
			System.out.println("GAME OVER " + score);
		}
	}
}
