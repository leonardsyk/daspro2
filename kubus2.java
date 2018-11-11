import java.util.Scanner;
public class kubus2 {
	public static void main (String[] args) {
	int menu, sisi, rumusv, rumusk; String jawab;
	do{

	//input
	Scanner input=new Scanner(System.in);
	System.out.println("==========Penghitung Volume & Keliling Kubus==========");
	do {
	System.out.println("Pilih diantara kedua command yang tersedia (1 = VOLUME ; 2 = KELILING)");
	System.out.print("input menu : ");
	menu=input.nextInt();
	if (menu == 1)
		System.out.println("Loading rumus volume...");
	else if (menu == 2)
		System.out.println("Loading rumus keliling...");
	else
		System.out.println("CMD TIDAK DIKENALI, MASUKKAN CMD YANG TERSEDIA");
	}while (menu > 2);
	
	//rumus
	System.out.print("Input sisi : ");
	sisi=input.nextInt();
	rumusv = sisi * sisi * sisi;
	rumusk = sisi * 12;
	
	//printout
	if (sisi <= 0)
		System.out.println("Volume tidak dapat dihitung");
	else if (sisi > 0 && menu == 1)	
		System.out.println("Volume Kubus : "+rumusv +" cm^3");
	else
		System.out.println("Keliling Kubus : "+rumusk +" cm^2");
	
	//perulangan
	System.out.print("Ingin menghitung lagi? (yes/no) = ");
			jawab = input.nextLine();
			jawab = input.nextLine();

	}While (jawab.equalsIgnoreCase("yes"));
	}
}