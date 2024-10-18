package pkg1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P11 {

	public static void main(String[] args) throws IOException {
		String mesTemp[]=new String[100];
		String names[]= new String[10];
		String salutations[]= new String[10];
		String amount[]=new String[10];
		String date[]= new String[10];
		File f1= new File("template.txt");
		File f2= new File("list1.txt");
		FileWriter fw1=new FileWriter("message.txt");
		Scanner sc1= new Scanner(f1);
		Scanner sc2= new Scanner(f2);
		String line1="";
		line1=sc1.nextLine();
		mesTemp=line1.split(" ");
		line1="";
		int i=0;
		while(sc2.hasNext()) {
			line1=sc2.nextLine();
			String arr1[]=line1.split(",");
			names[i]=arr1[1];
			amount[i]=arr1[2];
			date[i]=arr1[3];
			if(arr1[0].equals("F")) {
				salutations[i]="Ms.";
			}
			else {
				salutations[i]="Mr.";
			}
			i++;
		}
		for(int k=0;k<i;k++) {
			String s1=mesTemp[0]+" "+salutations[k]+names[k]+""+mesTemp[3]+" "+mesTemp[4]+" "+mesTemp[5]+" "+mesTemp[6]+" "+mesTemp[7]+" "+mesTemp[8]+" "+mesTemp[9]+" "+mesTemp[10]+" "+mesTemp[11]+" "+amount[k]+" "+mesTemp[13]+" "+date[k]+".\n";
//			System.out.println(s1);
			fw1.write(s1);
		}
		fw1.close();
	}
	
}
