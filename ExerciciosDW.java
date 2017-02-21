class ExerciciosDW{
	public static void Numeros(){
		int x = 150;
		while (x <= 300){
			System.out.print(x+" ");
			x++;
		}
	}

	public static void main(String[] args){
		//Numeros();
		//Soma();
		//Multiplos();
		//Fatorial();
		//Fibonacci();
		//Shit();
		Table();
	}

	public static void Soma(){
		int num = 0;
		int cont = 1;
		while (cont <= 1000){
			num = num + cont;
			cont++;
		}
		System.out.print(num);
	}

	public static void Multiplos(){
		int  y = 1;
		while(y <= 100){
			if(y % 3 == 0){
				System.out.print(y+ "  ");
			}
			y++;
		} 
	}

	public static void Fatorial(){
		int fat = 1;
		int cont = 1;
		while (cont <= 10){
			System.out.print("Fatorial de"+" "+cont+" "+fat+'\n');
			cont++;
			fat = fat * cont;
		}
	}

	public static void Fibonacci(){
		int x = 0;
		int y = 1;
		int x1 = 0;
		//System.out.print(0);
		while(x < 100){
			x1 = x;
			x = x + y;
			y = x1;
			if(x > 100){
				break;
			}
			System.out.print(x+"\n");			
		}
	}

	public static void Shit(){
		int x = 20;
		while (x != 1){
			if (x % 2 == 0){
				x = x / 2;
				System.out.print(x+"\n");
			}
			else if (x % 2 == 1){
				x = 3 * x + 1;
				System.out.print(x+"\n");
			}
		}
	}

	public static void Table(){
		int nume;
		int num;
		System.out.print(1+"\n");
		for (num = 2; num <= 6; num++){
			for (nume = 1; num*nume <= java.lang.Math.pow(num,2); nume++){
				System.out.print(num*nume+" ");
			}
			System.out.print("\n");
		}
	}

}