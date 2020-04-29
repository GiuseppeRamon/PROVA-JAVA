package app;

public class App {
    public static void main(String[] args) throws Exception {  
       
        Cliente pessoateste1 = new Cliente("Julio","099393","@gmail");
        Cliente teste2 = new Cliente("juju@gmail.com", "1234");
    
        Banco b1 = new Banco("BSS");
        Banco b2 = new Banco("T5r");
    
        ContaCorrente c1teste = new ContaCorrente("99", pessoateste1, "9940", "0876");
        ContaCorrente c2teste = new ContaCorrente("99", teste2, "9940", "0876");
        
        c1teste.depositar(80.86266);
        c2teste.depositar(40.00);
        c2teste.sacar(20.00);
        b1.adicionaConta(c1teste);
        b2.adicionaConta(c2teste);
        
        System.out.println(c1teste.getSaldo());
     

        System.out.println("Hello Java");
    }
}