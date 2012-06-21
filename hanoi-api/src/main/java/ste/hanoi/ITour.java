package ste.hanoi;

/**
 * Représente une de trois tours.
 * 
 * @author <a href="mailto:arnaud.vandyck@ulg.ac.be">Arnaud Vandyck</a> pour <a
 *         href="http://steformations.be/">STE-Formations</a>
 * @see java.util.Stack
 * @see java.util.List
 * @version 1.0
 */
public interface ITour {
	/** "     |     " */
	String LIGNE0 = "     |     ";
	/** "    1|1    " */
	String LIGNE1 = "    1|1    ";
	/** "   22|22   " */
	String LIGNE2 = "   22|22   ";
	/** "  333|333  " */
	String LIGNE3 = "  333|333  ";
	/** " 4444|4444 " */
	String LIGNE4 = " 4444|4444 ";
	/** "55555|55555" */
	String LIGNE5 = "55555|55555";

	/**
	 * Ajoute une entier sur la pile. L'entier est compris entre 1 et 5
	 * (inclus). On ne peut ajouter de nombre supérieur au nombre sur la pile.
	 * 
	 * @param i
	 *            le nombre ajouté (entre 1 et 5)
	 * @return le nombre ajouté.
	 * @throws IllegalStateException
	 *             si le nombre ajouté est plus grand que le nombre qui est déjà
	 *             dans la pile.
	 */
	Integer push(Integer i) throws IllegalStateException;

	/**
	 * Retire un nombre de la pile.
	 * 
	 * @return le nombre qui était sur la pile.
	 */
	Integer pop();

	/**
	 * Retourne le nombre sur la pile mais ne l'enlève pas.
	 * 
	 * @return le nombre au sommet de la pile.
	 */
	Integer peek();

	/**
	 * Retourne la taille de la pile.
	 * 
	 * @return la taille de la pile.
	 */
	int size();

	/**
	 * Est-ce que la pile est vide ou non?
	 * 
	 * @return <code>true</code> si la pile est vide...
	 */
	boolean isEmpty();

	/**
	 * Retourne une représentation de la tour à la ligne passée en argument
	 * (entre 0 et 4).
	 * 
	 * @param line
	 *            la ligne (entre 0 et 4).
	 * @return la chaîne de caractère qui représente la tour à la ligne en
	 *         question.
	 */
	String toString(int line);

}
