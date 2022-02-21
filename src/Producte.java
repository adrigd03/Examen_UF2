/**
 *@Author Adrián García Domíguez
 * 21/02/2022
 */

/**
 * Classe de producte
 */
public abstract class Producte {
	/**
	 * preu del producte
	 */
	private float preu;
	/**
	 * nom del producte
	 */
	private String nom;
	/**
	 * codi de barres del producte
	 */
	private String codibarres;

	/**
	 * Canvia el valor de les variables preu, nom i codibarres per els valors dels parametres
	 * @param preu float preu del producte
	 * @param nom String nom del producte
	 * @param codi String codi del producte
	 */
	public Producte(float preu, String nom, String codi) {
		this.preu = preu;
		this.nom = nom;
		codibarres = codi;
	}

	/**
	 * Aquetsta funcio dona el preu
	 * @return float retorna el preu
	 */
	public float getPreu() {
		return preu;
	}
	//REFACT He borrat les funcions setPreu, setNom i setCodibarres perque no eran utilitzades

	/**
	 * Aquesta funcio dona el nom
	 * @return String retorna el nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Aquesta funcio dona el codi de barres
	 * @return String retorna el codi de barres
	 */
	public String getCodibarres() {
		return codibarres;
	}

	/**
	 * Aquesat funcio comprova si el contingut de les variables codibarres i preu son iguals
	 * @param obj Object
	 * @return boolean retorna true si codi de barres i preu dela clase i l'objecte son iguals, si no retorna false.
	 */
	//REFACT He tret la variable boolean son_iguals
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		else {
			Producte p = (Producte) obj;
			if (codibarres.equals(p.getCodibarres()) && getPreu() == p.getPreu()) {
				return true;
			}
			else {
				return false;
			}
		}
	}

	/**
	 * Aquesta funcio dona el hashCode de codibarres
	 * @return int retorna el hashCode de codibarres
	 */
	@Override
	public int hashCode() {
		int codi = codibarres.hashCode();
		return codi;
	}
	
	
	

}
