package archivos;
/**
 * @author Denis Cuenca y Erika Maza
 * Clase que permitirá recrear las acciones de una cuenta bancaria corriente
 *
 * Esta es una clase hija de la clase Cuenta
 */
public class Corriente extends Cuenta {
    private int nroMaxCheques;
    private SecuencialCheque secuenciaCH;

    /**
     *
     * @param saldo
     * Valor que será usado para asignar  valores a la cuenta
     * @param numero
     * Valor que  regleja el número de cuenta del cliente
     *
     * Constructor de la clase
     */
    public Corriente(double saldo, String numero){ super(saldo, numero);}

    /**
     *
     * @return
     * Método que retorna el múmero maximo de cheques
     */
    public int getNroMaxCheques() {
        return nroMaxCheques;
    }

    /**
     *
     * @param nroMaxCheques
     * Valor que será asignado como el número maximo de cheques
     */
    public void setNroMaxCheques(int nroMaxCheques) {
        this.nroMaxCheques = nroMaxCheques;
    }

    /**
     *
     * @return
     * Método que retorna el contenido del atributo secuencialCH
     */
    public SecuencialCheque getSecuencialCH() {
        return secuenciaCH;
    }

    /**
     *
     * @param secuencialCH
     * Valor que será asignado al atributo secuencialCH
     */
    public void setSecuencialCH(SecuencialCheque secuencialCH) {
        this.secuenciaCH = secuencialCH;
    }
}
