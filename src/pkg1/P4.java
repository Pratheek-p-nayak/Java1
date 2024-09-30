package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P4 {
	public static void main(String[] args) throws FileNotFoundException {
		File f1= new File("in.txt");
		Scanner sc1= new Scanner(f1);
		int start=sc1.nextInt();
		int end=sc1.nextInt();
		for(int j=start;j<end+1;j++) {
			for(int i=1;i<11;i++) {
				System.out.println(j + "*" + i + "=" + j*i);
			}
			System.out.println();
			
		}
	}
}
