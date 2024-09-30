package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class P6 {
	public static void main(String[] args) throws FileNotFoundException,IOException {
		int start=0,end=0;
		String line1="";
		File f= new File("in3.txt");
		FileWriter fw1= new FileWriter("out.txt");
		Scanner sc1= new Scanner(f);
		line1=sc1.nextLine();
		String arr1[]=line1.split(",");
		start=Integer.parseInt(arr1[0]);
		end=Integer.parseInt(arr1[1]);
		System.out.println(start + "," + end);
		for(int j=start;j<end+1;j++) {
			for(int i=1;i<11;i++) {
				String s1=j + "*" + i + "=" + j*i;
				fw1.write(s1);
				fw1.write("\n");
				
			}
			fw1.write("\n");
		}
		fw1.close();
	}
}
