public class ContaBanco {
    int numero;
    String agencia;
    String titular;
    double saldo;

    public ContaBanco(int numero, String agencia, String titular) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = 25.00;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso! Novo saldo: R$ " + this.saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso! Novo saldo: R$ " + this.saldo);
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

}
