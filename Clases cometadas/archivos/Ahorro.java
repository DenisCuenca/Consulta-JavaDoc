package archivos;
/**
 * @author Denis Cuenca y Erika Maza
 * Clase que permitirá recrear las acciones de una cuenta bancaria de ahorro
 *
 * Esta es una clase hija de la clase Cuenta
 */
public class Ahorro extends Cuenta{
    private double interesAnual;

    /**
     *
     * @param saldo
     * Parámetro que se le asignará al atrubuto saldo
     * @param numero
     * Parámetro que será asignado al atributo número
     * @param interesAnual
     * Parametro del interes anual de la cuenta ahorro
     * Constructor de la clase Ahorro
     */
    public Ahorro(double saldo, String numero, double interesAnual) {

        super (saldo, numero);
        this.interesAnual = interesAnual;
    }

    /**
     *
     * @return
     * Método que devuelve el número de cuenta concatenado para diferenciarlo par diferenciarlo como cuenta de ahorro
     */
    @Override
    public String getNumero(){
        return "CTA-AH-".concat(super.getNumero());

    }

    /**
     *
     * @return
     * Método que retorna el numero almacenado en el atrubuto Interes anual
     */
    public double getInteresAnual() {
        return interesAnual;
    }

    /**
     *
     * @param monto
     * Valor que se evaluará si en valido o no para asignar
     * @return
     * Método que retorna un valor boleano en donde se señala si el monto a retirar es valido
     */
    private boolean isMontoValido(double monto){
        return monto >0;
    }

    /**
     *
     * @param monto  Monto a retirar en la cuenta de ahorro
     *
     */
    public void retirar(double monto){
    if(isMontoValido(monto)){
        setSaldo( getSaldo() - monto );
    }else{
        throw new IllegalArgumentException("El monto no es valido");
    }
    }
}
