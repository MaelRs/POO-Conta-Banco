package contaBanco;

public class ContaBanco {
	public int numConta;
	protected String tipoConta;
	private String titular;
	private float saldo;
	private boolean status;
	
	public ContaBanco() {
		this.saldo=0;
		this.status=false;
	}
	
	public int getNumConta() {
		return numConta;
	}


	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}


	public String getTipoConta() {
		return tipoConta;
	}


	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public float getSaldo() {
		return saldo;
	}


	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}


	public boolean getStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void abrirConta(String t) {
		this.setTipoConta(t);
		this.setStatus(true);
		if(t=="CC") {
			this.setSaldo(50);
		}else if(t=="CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso e Voce ganhou R$"+this.getSaldo()+" reais como incentivo.");
		System.out.println("---------------------------------------");
	}
	
	public void fecharConta() {
		if(this.getSaldo()>0) {
			System.out.println("Não e possível encerrar conta com saldo positivo!");
		}else if(this.getSaldo()<0) {
			System.out.println("Não e possível encerrar conta com Saldo Negativo!");
		}else {
			this.setStatus(false);
			System.out.println("Conta encerrada com sucesso!");
		}
	}
	
	public void depositar(float v) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo()+v);
			System.out.println("Deposito de R$"+v+" reais efetuado na conta de "+this.getTitular()+" com sucesso!");
		}else {
			System.out.println("Impossivel depositar!Conta fechada!");
		}
	}
	
	public void sacar(float v) {
		if(this.getStatus()) {
			if(this.getSaldo()>=v) {
				this.setSaldo(this.getSaldo()-v);
				System.out.println("Saldo de R$"+v+" reais Efetuado com sucesso!");
			}else if(this.getSaldo()<v) {
				System.out.println("Saldo insuficiente para o saque pretendido.");
			}
		}else {
			System.out.println("IMPOSSIVEL SACAR! CONTA FECHADA.");
		}
	}
	
	public void pagarMensalidade() {
		int v=0;
		if (this.getTipoConta()=="CC") {
			v=12;
		}else if (this.getTipoConta()=="CP") {
			v=20;
		}
		if (this.getStatus()) {
			if(this.getSaldo()>=v) {
				this.setSaldo(this.getSaldo()-v);
				System.out.println("Mensalidade Paga com Sucesso!");
			}else {
				System.out.println("Saldo Insuficiente para o pagamento da mensalidade!");
			}
		}else {
			System.out.println("IMPOSSIVEL PAGAR MENSALIDADE! CONTA FECHADA!");	
		}
	}

	public void status() {
	System.out.println("Dados Bancarios");
	System.out.println("Numero da Conta: "+this.getNumConta());
	System.out.println("Tipo: "+this.getTipoConta());
	System.out.println("Titular: "+this.getTitular());
	System.out.println("Saldo: "+this.getSaldo());
	System.out.println("Status: "+this.getStatus());
	
	}
	

}
