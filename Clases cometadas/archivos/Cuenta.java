package archivos;
import java.time.LocalDate;

/**
 * @author Denis Cuenca y EriKa Maza
 * Clase padre de las clases Corriente y Ahorro
 *
 */
public class Cuenta {
    private double saldo;

    /**
     *
     */
    protected String numero;
    private LocalDate fechaApertura;

    /**
     *
     * @param saldo
     * Valor que será usado para ingresar dinero a la cuenta
     * @param numero
     * Cadena que refleja el número de cuenta del clente
     * Constructor de la clase.
     */

    public Cuenta(double saldo, String numero){
        setSaldo(saldo);
        this.numero= numero;
        fechaApertura = LocalDate.now();
    }

    /**
     *
     * @return Devuelve un número con lo asignado al atributo saldo
     */
    public double getSaldo() {
        return saldo;
    }


    /**
     *
     * @param saldo
     * Método que valida el valor a asignar a saldo es correcto o no
     */

    public void setSaldo(double saldo) {
        if (!validarSaldoNoNegativo(saldo)){
            this.saldo = saldo;
        }else{

            throw new IllegalArgumentException("Saldo negativo");

        }
    }

    /**
     *
     * @return Devuelve una cádena con el valor de numero  de cuenta
     */
    public String getNumero() {
        return numero;
    }


    /**
     *
     * @param numero
     * Valor que será asignado al atributo numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }


    /**
     *
     * @param saldo
     * @return Método que devuelve un valor boleano señalando si el saldo es o no negativo
     */
    private boolean validarSaldoNoNegativo(double saldo){
        return saldo<0;
    }


    /**
     *
     * @param monto
     * Monto a depositar en la cuenta
     */
  public void depositar (double monto){
        if(monto >0){
            this.saldo = this.saldo+monto;

        }else{

            throw new IllegalArgumentException("Monto Negativo");
        }
  }
}
