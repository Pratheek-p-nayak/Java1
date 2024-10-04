package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class P8 {
	public static void main(String[] args) throws IOException {
		int start=0,end=0;
		String line1="";
		String dir="TABLES/";
		LocalDateTime dt= LocalDateTime.now();
		DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("yyyyMMdd_hhmmss");
		FileWriter fw1 = null;
		File f1=new File(dir);
		f1.mkdir();
		Scanner sc1= new Scanner(System.in);
		start=sc1.nextInt();
		end=sc1.nextInt();
		System.out.println(start + "," + end);
		for(int j=start;j<end+1;j++) {
			String part1=j + "_";
			String part2=dtf1.format(dt);
			String part3=".txt";
			String fname=part1 + part2 + part3;
			fw1= new FileWriter(dir+fname);
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
