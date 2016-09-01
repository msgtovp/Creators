package org.creators;

import java.io.IOException;
import java.util.Scanner;
import com.creators.store.ui.StockManager;

public class Solution {
	public static void main(String args[]) throws IOException {
		Scanner scan = new Scanner(System.in);
		StockManager sm = new StockManager();
		while(true) {
			System.out.print("\n1.Add\n2.Update\n3.Delete\n4.List All\n5.Exit\n\tYour wish : ");
			int ch = scan.nextInt();
			switch(ch) {
				case 1:
					sm.insert();
					break;
				case 2:
					System.out.print("Item Code to update : ");
					sm.update(scan.nextInt());
					break;
				case 3:
					System.out.print("Item Code want to delete : ");
					sm.delete(scan.nextInt());
					break;
				case 4:
					sm.print();
					break;
				case 5:
					System.out.println("Bye.. Bye..");
					break;
			}
			System.out.println();
			if(ch == 5)
				break;
		}
		scan.close();
	}
}
