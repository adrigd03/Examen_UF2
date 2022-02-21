/**
 *@Author Adrián García Domíguez
 * 21/02/2022
 */

/**
 * Classe de textil
 */
public class Textil extends Producte {
	/**
	 * compsosicio del producte
	 */
	private String composicio;
	/**
	 * codificacio del producte
	 */
	private String codificacio;

	/**
	 *Canvia el valor de les variables preu, nom i codi del la classe Producte per els valor dels parametres i guarda la data de caducitat.
	 * @param preu float El preu del producte
	 * @param nom String El nom del producte
	 * @param codi String Codi del producte
	 * @param compo String Composicio del producte
	 */
	public Textil(float preu, String nom, String codi, String compo) {
		super(preu, nom, codi);
		composicio = compo;
		codificacio = preu + codi;
	}

	/**
	 * No se utilitza
 	 * @return retorna la compsicio del producte
	 */
	public String getComposicio() {
		return composicio;
	}

	/**
	 * No se utilitza
	 * @param composicio String composicio del producte
	 */
	public void setComposicio(String composicio) {
		this.composicio = composicio;
	}

	/**
	 *Aquesta funcio dona un sttring amb el nom i preu separats per un espai
	 * @return Strign retorna un string amb nom i preu
	 */
	@Override
	public String toString() {
		return new String(getNom() + " " + getPreu());
	}

	//REFACT borrat funcio getCode perque no s'utilitzaba

}
