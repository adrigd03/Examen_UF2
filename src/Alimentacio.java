/**
 * @Author Adrián García Domíguez
 * 21/02/2022
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Classe de alimentacio
 */
public class Alimentacio extends Producte {
	/**
	 * data
	 */
	private LocalDate d;

	/**
	 *Canvia el valor de les variables preu, nom i codi del la classe Producte per els valor dels parametres i guarda la data de caducitat.
	 * @param preu float El preu del producte
	 * @param nom String El nom del producte
	 * @param codi String Codi del producte
	 * @param datac LocalDate Data de caducitat del producte
	 */
	public Alimentacio(float preu, String nom, String codi, LocalDate datac) {
		super(preu, nom, codi);
		d = datac; //obtenim la data de caducitat
	}

	/**
	 * Aquesta funcio calcula el preu d'un producte
	 * @return float retorna el preu calculat
	 */
	@Override
	public float getPreu() {
		float preu = super.getPreu();
		long dif;
		dif = ChronoUnit.DAYS.between(d,LocalDate.now());
		preu = preu - (float) (preu*(1/(dif+1)) + (preu*(0.1)));
		//System.out.println("preu:" + preu);
		return preu;
	}

	/**
	 * Aquetsta funcio agafa el nom i el preu de 'un producte i els ajunta en un nou String
	 * @return String retorna un nou string amb el nom i preu.
	 */
	@Override
	public String toString() {
		return new String(getNom() + " " + getPreu());
	}
	


}
