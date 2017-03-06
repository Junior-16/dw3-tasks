public class No{
	No proximo;
	No anterior;
	String value;
	public No(String valor){
		this.proximo = null;
		this.anterior = null;
		this.value = valor;
	}
}