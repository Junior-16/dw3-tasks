public class Agenda{
	int size;
	No primeiro;
	public Agenda(){
		this.primeiro = null;
		this.size = 0;
	}

	void append(String nome){
		No x = new No(nome);
		No y = this.primeiro;
		if (this.primeiro == null){
			this.primeiro = x;
			this.size += 1;
		}else{
			No ante = y;
			while(y.proximo != null){
				if(this.size == 1){
					ante = y;
				}
				y = y.proximo;
				if(this.size > 1){
					ante = y;
				}
			}
			x.anterior = ante;
			y.proximo = x;
			this.size += 1;
		}
	}

	void mostrar(){
		int index = 0;
		No itr = this.primeiro;
		while(index < this.size){
			System.out.print("Lista"+"["+index+"]"+" "+"="+" "+itr.value+"\n");
			itr = itr.proximo;
			index++;
		}
	}
}