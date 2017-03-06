class Funcionario{
	String nome;
	String departamento;
	double salario;
	String data_entrada;
	String rg;
	Data dataEntrada;
	public Funcionario(String name,String depart,double sal,String rg1){
		nome = name;
		departamento = depart;
		salario = sal;
		rg = rg1;
	}

	void mostrar_dados(){
		System.out.print("Nome:"+" "+this.nome+"\n"+"Departamento:"+" "+this.departamento+"\n");
		System.out.print("Salario:"+" "+this.salario+"\n"+"Data da contratacao:"+" "+"\n");
		System.out.print("RG:"+" "+this.rg+"\n"+"\n");
		System.out.print("Dia: "+this.dataEntrada.dia+"\n");
		System.out.print("Mes: "+this.dataEntrada.mes+"\n");
		System.out.print("Ano: "+this.dataEntrada.ano+"\n");
		System.out.print(dataFormatada()+"\n");
	}

	void recebeAumento(double valor){
		this.salario += valor;
	}

	void ganhoAnual(){
		System.out.print("O ganho anual sera:"+" "+"R$"+this.salario * 12);
	}

	String dataFormatada(){
		return(this.dataEntrada.dia+"/"+this.dataEntrada.mes+"/"+this.dataEntrada.ano);
	}

}