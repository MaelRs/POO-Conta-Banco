package contaBanco;

public class PooContaBanco {
	public static void main(String[] args) {
		ContaBanco conta1=new ContaBanco();
		conta1.setNumConta(1111);
		conta1.setTitular("CRISTIANO COUTINHO");
		conta1.abrirConta("CC");
		conta1.depositar(600);
		
		conta1.status();
		
		ContaBanco conta2=new ContaBanco();
		conta2.setNumConta(2222);
		conta2.setTitular("ANA MARIA");
		conta2.abrirConta("CP");
		conta2.sacar(320);
		
		conta2.status();
		
		
	}

}
