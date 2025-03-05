package cuentas;

/**
 * Clase cuenta que contendra los datos de la cuenta
 *
 * @author david
 */
public class CCuenta {

    /**
     * nombre del propietario del a cuenta
     */
    private String nombre;
    /**
     * numero de cuenta
     */
    private String cuenta;
    /**
     * saldo de la cuenta
     */
    private double saldo;
    /**
     * tipo de interes de la cuenta
     */
    private double tipoInterés;

    /**
     * Constructor vacio de la clase cuenta
     */
    public CCuenta() {
    }

    /**
     * constructor de la clase cuenta que redibe los parametros
     *
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
    // inicio de sets y gets
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    // fin de gets y sets
    /**
     * metodo que devuelve el saldo de la cuenta
     * @return  double con el valor de la cuenta
     */
    public double estado() {
        return getSaldo();
    }
    /**
     * metodo para ingresar dinero en la cuenta
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * metodo para rertir dinero de la cuenta 
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }
}
