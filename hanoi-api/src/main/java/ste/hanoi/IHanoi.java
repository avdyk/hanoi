package ste.hanoi;

/**
 * Représente les trois tours de Hanoi dont la première comprend cinq disques
 * dont les valeurs vont de 1 à 5.
 * 
 * @author <a href="mailto:arnaud.vandyck@ulg.ac.be">Arnaud Vandyck</a> pour <a
 *         href="http://steformations.be/">STE-Formations</a>
 * @version 1.0
 */
public interface IHanoi {

	/**
	 * Initialisation du jeu (remet les trois tours en état).
	 */
	void init();

	/**
	 * Déplacement d'un disque d'une tour à une autre. Si le disque de la tour
	 * d'origine est plus grand que celui de la tour de destination, aucun
	 * mouvement ne devra être effectué.
	 * 
	 * @param from
	 *            la tour de départ.
	 * @param to
	 *            la tour d'arrivée.
	 */
	void move(int from, int to);

	/**
	 * Déplacement d'un ou plusieurs disque d'une tour à un autre en passant par
	 * la troisième.
	 * 
	 * @param size
	 *            le nombre de disques.
	 * @param from
	 *            la tour de départ.
	 * @param to
	 *            la tour d'arrivée.
	 * @param by
	 *            la tour par laquelle on passe.
	 */
	void move(int size, int from, int to, int by);

	/**
	 * Retourne une représentation sous forme de chaîne des trois tours.
	 * 
	 * @return une représentation sous forme de chaîne des trois tours.
	 */
	@Override
	String toString();
}
