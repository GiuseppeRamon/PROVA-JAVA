package app;

import java.util.ArrayList;

public class Banco {
private String nomeBanco;
private ArrayList<ContaCorrente> listacontas;


 public Banco(String n){
 this.nomeBanco = n;
 this.listacontas = new ArrayList<ContaCorrente>();
    }

    public ArrayList<ContaCorrente> getContas() {
        return this.listacontas;
        
    }

    public void adicionaConta(ContaCorrente conta){
        this.listacontas.add(conta);
    }

    public void removeConta(int numeroConta){
        this.listacontas.remove(numeroConta);
    }
    public void depositar(int numeroConta, Double valor){
        listacontas.get(numeroConta).depositar(valor);
    }

    public void sacar(int numeroConta, Double valor){
        listacontas.get(numeroConta).sacar(valor);
    }
    public Integer totalDecontas(){
    return listacontas.size();
}

public Integer totalDeContas(){
    return listacontas.size();
}

@Override
public String toString(){
    return "Banco: " + this.nomeBanco + "\n" + this.listacontas + "\n" ;
}

}