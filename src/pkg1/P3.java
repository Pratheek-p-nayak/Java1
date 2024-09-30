package pkg1;

import java.util.Scanner;

public class P3 {
	public static void main(String[] args) {
		Scanner sc1= new Scanner(System.in);
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
