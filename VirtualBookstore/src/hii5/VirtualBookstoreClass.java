package hii5;

import java.util.Scanner;

public class VirtualBookstoreClass {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bookStore obj1 = new bookStore("Felipe");
		obj1.showMenu();

	}

}
	class bookStore{
		String CustmerName;
		String[] DramaCheap;
		String[] DramaExpensive;
		String[] CrimeCheap;
		String[] CrimeExpensive;
		String[] ChosenArray;
		bookStore(String name){
			CustmerName = name;
			DramaCheap = new String [] {"El Tunel","La Hojarasca","El Viejo y el Mar"};
			DramaExpensive = new String [] {"Crimen y Castigo","El Rey Lear","Montgomery"};
			CrimeCheap = new String []{"Sherlock Holmes","Hercules Poirot","La Lectora"};
			CrimeExpensive = new String [] {"Hannibal","Mi Lucha","La Abuela"};
}
		void printArray(char x, char y) {
	
			if(x == 'A'&& y == 'F') {
				for ( int i = 0 ; i < 3 ; i++) {
					System.out.println(i+1 + " . " + DramaCheap[i]);
					ChosenArray = DramaCheap;
				}
			}else if(x == 'A'&& y == 'H') {
				for(int i = 0 ; i <3 ; i++) {
					System.out.println(i+1 + "." + DramaExpensive[i]);
					ChosenArray = DramaExpensive;
				}
			}else if(x == 'C'&& y == 'F') {
				for ( int i = 0 ; i < 3 ; i++) {
					System.out.println(i+1 + " . " + CrimeCheap[i]);
					ChosenArray = CrimeCheap;
				}
			}else if(x == 'C'&& y == 'H') {
				for(int i = 0 ; i <3 ; i++) {
					System.out.println(i+1 + "." + CrimeExpensive[i]);
					ChosenArray = CrimeExpensive;
		}
	}
}
		void chooseBook(int num, String[] Array) {
			if(num == 1) {
				System.out.println("Your choice is : ");
				System.out.println(Array[0]);
			}else if(num == 2) {
				System.out.println("Your choice is : ");
				System.out.println(Array[1]);
			}else if(num == 3) {
				System.out.println("Your choice is : ");
				System.out.println(Array[2]);
			}
		}
		void showMenu(){
			System.out.println("Welcome " + CustmerName);
			System.out.println("=====================================================================================");
			System.out.println("Please choose the genre first" );
			System.out.println("=====================================================================================");
			System.out.println("A. Drama");
			System.out.println("C. Crime");
			System.out.println("E. Exit");
			char genre = '\0';
			char cost = '\0';
			
			Scanner scanner = new Scanner (System.in);
			genre = scanner.next().charAt(0);
				System.out.println("\n");
				switch(genre) {
					case'A':
					case'C':
						System.out.println("\n");
						System.out.println("=====================================================================================");
						System.out.println("Please Choose your price range" );
						System.out.println("=====================================================================================");
						System.out.println("F. Less than USD 40");
						System.out.println("H. More than USD 40");
						System.out.println("E. Exit");
						break;
					case'E':
						break;
						default:
						System.out.println("Invalid input! please enter another option");
						break;
						
						
			
}
				Scanner scanner2 = new Scanner(System.in);
				cost = scanner.next().charAt(0);
				printArray(genre,cost);
				System.out.println("=====================================================================================");
				System.out.println("Choose your book");
				System.out.println("=====================================================================================");
				int book;
				Scanner scanner3 = new Scanner (System.in);
				book = scanner3.nextInt();
				chooseBook(book,ChosenArray);

}}
