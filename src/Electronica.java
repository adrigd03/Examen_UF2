/**
 *@Author Adrián García Domíguez
 * 21/02/2022
 */

/**
 * Classe electronica
 */
public class Electronica extends Producte {
	/**
	 * dies de garantia
	 */
	private int dies_garantia;

	/**
	 *Canvia el valor de les variables preu, nom i codi del la classe Producte per els valor dels parametres
	 * @param preu float preu del producte
	 * @param nom String nom del producte
	 * @param codi String codi codi del producte
	 * @param diesg int diesq dies de garantia del producte
	 */
	public Electronica(float preu, String nom, String codi, int diesg) {
		super(preu, nom, codi);
		dies_garantia = diesg;
	}

	/**
	 * Aquesta funcio calcula el preu d'un producte
	 * @return float retorna el preu calculat
	 */
	@Override
	public float getPreu() {
		float preu = super.getPreu();
		return (float) (preu + preu*(dies_garantia/365)*0.1);
	}

	/**
	 * Aquesta funcio dona un string amb el nom i preu del producte separats per un espai
	 * @return String retorna el nom i el preu.
	 */
	@Override
	public String toString() {
		return getNom() + "," + getPreu();
	}
	
	
	

}
