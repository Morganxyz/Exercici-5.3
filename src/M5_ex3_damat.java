import java.util.Scanner;
public class M5_ex3_damat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		int num = 0;
		int rand =(int)Math.ceil((Math.random() * 10));
				
		//System.out.println(rand); Para comprobar que funciona
				
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introdueix una xifra del 1 al 10: ");
		num = entrada.nextInt();
				
		while (num != rand) {
			System.out.println("Introdueix una xifra del 1 al 10: ");
			num = entrada.nextInt();
						
			}
		if(num == rand) {
			System.out.println("Enhorabona, has encertat la xifra que l´ordinador a generat, que era el número: " + rand);
		}
		}
				
				
}

