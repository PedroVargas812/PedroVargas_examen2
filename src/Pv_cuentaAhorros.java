public class Pv_cuentaAhorros extends Pv_cuenta {
    private boolean activa;

    public Pv_cuentaAhorros(float saldo, float tasa) {
        super(saldo, tasa);
        this.activa = saldo >= 20;
    }


    public void depositar(float cantidad) {
        if (!activa && (getSaldo() + cantidad) >= 20) {
            activa = true;
        }

        if (activa) {
            super.depositar(cantidad);
        } else {
            System.out.println("Cuenta inactiva. El depósito no puede realizarse.");
        }
    }


    public void retirarr(float cantidad) {
        if (activa && cantidad <= getSaldo()) {
            super.retirar(cantidad);
            if (getSaldo() < 20) {
                activa = false;
            }
        } else {
            System.out.println("Cuenta inactiva o fondos insuficientes.");
        }
    }

    public void imprimir() {
        System.out.println("Saldo actual: $" + getSaldo());
        System.out.println("Número de depósitos: " + getNumeroDepositos());
        System.out.println("Número de retiros: " + getNumeroRetiros());
        System.out.println("Tasa anual: " + (getTasaAnual() * 100) + "%");
    }
}





