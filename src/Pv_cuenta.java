public class Pv_cuenta {
    protected float saldo;
    protected int numeroDepositos;
    protected int numeroRetiros;
    protected float tasaAnual;

    public Pv_cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
        this.numeroDepositos = 0;
        this.numeroRetiros = 0;
    }

    public void depositar(float cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            numeroDepositos++;
        }
    }

    public void retirar(float cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            numeroRetiros++;
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public int getNumeroDepositos() {
        return numeroDepositos;
    }

    public int getNumeroRetiros() {
        return numeroRetiros;
    }

    public float getTasaAnual() {
        return tasaAnual;
    }
}

