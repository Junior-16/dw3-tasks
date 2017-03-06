class lista{
	public static void main(String[] args) {
		Agenda lista = new Agenda();
		lista.append("Junior");
		lista.append("Vitor");
		System.out.print("O tamanho eh:"+" "+lista.size+"\n");
		//System.out.print(lista.primeiro.proximo.anterior);
		lista.mostrar();
		System.out.print(lista.primeiro.proximo.value+"\n");
		System.out.print(lista.primeiro.proximo.anterior.value);

}
}