class Teste{
	public static void main(String[] args){
		Funcionario f1 = new Funcionario("Junior","Contabilidade",1500.0,"060.128.040-84");
		Data data = new Data(20,6,2000);
		f1.dataEntrada = data;//Exercicio 7
		f1.recebeAumento(350);//Exercicio 2
		f1.mostrar_dados();//Exercicio 3
		System.out.print(diferente()+"\n");//Exercicio 4
		System.out.print(igual());//Exercicio 5

	}

	static String igual(){
		Funcionario fun1 = new Funcionario("Junior","Contabilidade",1500.0,"060.128.040-84");
		Funcionario fun2 = fun1;
		if(fun1 == fun2){
			return ("Iguais");
		}
		else{
			return ("Diferentes");
		}
	}

	static String diferente(){
		Funcionario fun1 = new Funcionario("Junior","Contabilidade",1500.0,"060.128.040-84");
		Funcionario fun2 = new Funcionario("Junior","Contabilidade",1500.0,"060.128.040-84");
		if(fun1 == fun2){
			return ("Iguais");
		}
		else{
			return ("Diferentes");
		}
	}
}