import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int row, column;
		System.out.println("Welcome to Minefield!");
		System.out.println("Please decide the number of columns");
		column = scan.nextInt();
		System.out.println("Please decide the number of rows");
		row = scan.nextInt();
		
		MayinTarlasi mayin = new MayinTarlasi(row,column);
		mayin.run();
		
	}

}
