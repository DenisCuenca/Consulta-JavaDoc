package archivos;
/**
 * @author Denis Cuenca y Erika Maza
 * Clase que ejemplifica el accionar de una chequera
 */
public class SecuencialCheque {
    private String inicio;
    private String fin;

    /**
     *
     * @param inicio
     * Cádena que Refleja el inicio de  la chequera
     */
    public void setInicio(String inicio){
        this.inicio= inicio;
    }

    /**
     *
     * @return
     * Método que retorna el vlor del inio de la chequera
     */
    public String getInicio() {
        return inicio;
    }

    /**
     *
     * @return
     * Método que retorna el fin de la chequera
     */
    public String getFin() {
        return fin;
    }

    /**
     *
     * @param fin
     * Valor que refleje el fin de la chequera
     */
    public void setFin(String fin) {
        this.fin = fin;
    }
}
