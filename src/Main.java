/**
 *@Author Adrián García Domíguez
 * 21/02/2022
 */

//REFACT He canviat la ubicacio de la funcio main a la classe Main

/**
 * Classe Main
 */
public class Main {
    /**
     * Funcio main
     * @param args
     */
    public static void main(String... args) {
        int op,opP;
        Compra compra = new Compra();

        System.out.println("BENVINNGUT AL " + Compra.NOM_SUPERMERCAT);
        do {
            op = compra.menuPrincipal();
            switch(op) {
                case 1:
                    do {
                        opP =  compra.menuProducte();
                        switch(opP) {
                            case 1:
                                System.out.println("Afegir aliment");
                                compra.addAliment();
                                break;
                            case 2:
                                System.out.println("Afegir tèxtil");
                                compra.addTextil();
                                break;
                            case 3:
                                System.out.println("Afegir electrònica");
                                compra.addElectronica();
                                break;
                            default: break;
                        }
                    }while(opP!=0);
                    break;
                case 2: compra.passarCaixa(); break;
                case 3:
                    System.out.println("Carret");
                    compra.printCarret();
                    break;
                case 0:	System.out.println("Gràcies per la seva visita"); break;
                default: break;
            }

        }while(op!=0);

    }
}
