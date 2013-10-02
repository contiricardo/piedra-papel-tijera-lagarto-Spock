package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {

	private Forma forma;
	
	/**
	 * Toda Mano debe crearse con una forma dada, que será
	 * la que determine su condición en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */
	public Mano(final Forma forma) {
		this.forma = forma;
		/*throw new RuntimeException("No implementado aún");*/
	}

	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	public Resultado jugarCon(final Mano otra) {
		Integer j1 = this.forma.getValor();
		Integer j2 = otra.forma.getValor();
		
		Integer res = j1 - j2;
		
		if (res == -4 || res == -3 || res == 1 || res == 2)
			return Resultado.GANA;
		
		if (res == 0)
			return Resultado.EMPATA;
		
		
		return Resultado.PIERDE;
		/*throw new RuntimeException("No implementado aún");*/
	}
}
