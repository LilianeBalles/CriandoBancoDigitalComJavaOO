
public class Main {
    
    public static void main(String[] args) {
        Cliente liliane = new Cliente();
        liliane.setNome("Liliane");
        
        Conta cc = new ContaCorrente(liliane);
        Conta poupanca = new ContaPoupanca(liliane);
        
        cc.depositar(100);
        cc.transferir(100, poupanca);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
    
}
