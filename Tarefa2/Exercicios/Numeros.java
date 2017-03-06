import java.util.Scanner;

class Numeros{
	public static int Fatorial(int a){
		int b = 1;
		int result = 1;
		while (b <= a){
			result = result * b;
			b++;
		}
		return result;
	}

	public static void Fibonacci(){

		Scanner num = new Scanner(System.in);
		System.out.print("Digite um numero da serie: ");
		int nume = num.nextInt();
		int x = 1;
		int z = 1;
		int y = 0;
		System.out.print(0+" ");
		while(x <= nume){
			System.out.print(x+" ");
			x = z + y;
			y = z;
			z = x;
		}
	}

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("Digite 1 para Fatorial e 2 para Fibonacci: ");
		int a = num.nextInt();
		if(a == 1){
			System.out.print("Digite o numero para o fatorial: ");
			int x = num.nextInt();
			System.out.print("O fatorial eh"+" "+Fatorial(x));
		}else{
			Fibonacci();
		}
		
	}
}