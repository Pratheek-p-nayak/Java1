package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class P7 {
	public static void main(String[] args) throws IOException {
		int start=0,end=0;
		String line1="";
		FileWriter fw1 = null;
		Scanner sc1= new Scanner(System.in);
		start=sc1.nextInt();
		end=sc1.nextInt();
		System.out.println(start + "," + end);
		for(int j=start;j<end+1;j++) {
			String fname=j + ".txt";
			fw1= new FileWriter(fname);
			for(int i=1;i<11;i++) {
				String s1=j + "*" + i + "=" + j*i;
				fw1.write(s1);
				fw1.write("\n");
			}
			fw1.close();
		}
		fw1.close();
	}
}
