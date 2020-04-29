package app;

public class ContaCorrente {
private Cliente nomeC;
private String nagencia;
private String nconta;
private double saldo;


public ContaCorrente(String agencia, Cliente nomeC, String nconta, String nagencia){
this.nomeC = nomeC;
this.nconta = nconta;
this.nagencia = nagencia;
this.saldo = 0;

}
protected Boolean sacar(Double valor){
    if (valor > this.saldo){
        return false;
    }
    this.saldo = saldo - valor;
    return true;
}


protected Boolean depositar(Double valor){
    if (valor > 0){
        this.saldo =saldo - valor;
        return true;
    }  
    return false;
}


 public double getSaldo(){
 return saldo;
 }

 public String getNconta(){
    return nconta;
    }

    public String getNagencia() {
        return this.nagencia;
    }

    public String getNConta() {
        return this.nconta;
    }

    public Cliente getCliente() {
        return this.nomeC;
    }
 
    @Override
    public String toString(){
        return  this.nomeC.toString() + "\n" +
        " Agência: " + this.nagencia + "\n" + " Saldo: " + this.saldo + " Conta: " + this.nconta + "\n";
    }

}
