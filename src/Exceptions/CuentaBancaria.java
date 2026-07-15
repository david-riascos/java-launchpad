package Exceptions;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void retirar(double monto) throws SaldoInsuficienteException {
        // TODO: si monto > saldo, lanzar SaldoInsuficienteException
        if (monto > saldo) {
            throw new SaldoInsuficienteException("Tu saldo es: " + saldo + ", Intentas retirar: " + monto);
        }
        saldo -= monto;
    }
}