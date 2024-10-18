package pkg1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class P12 {

	public static void main(String[] args){
		var list1=new ArrayList<>();
		var list2=new ArrayList<>();
		var list3=new ArrayList<>();
		var list4=new ArrayList<>();

		String template="Dear $1salutation $2name ,You are kindly requested to make a payment of $3amount by $4date";
		try {
			File f1=new File("list1.txt");
			FileWriter fw1=new FileWriter("message1.txt");
			Scanner sc1=new Scanner(f1);
			while(sc1.hasNext()) {
				var line1=sc1.nextLine();
				var arr1=line1.split(", ");
				list1.add(arr1[0]);
				list2.add(arr1[1]);
				list3.add(arr1[2]);
				list4.add(arr1[3]);
//				System.out.println(list1+"\n"+list2+"\n"+list3+"\n"+list4);
			}
			var salutation="";
			var name="";
			var amount="";
			var date="";
			var template2="";
			for(var i=0;i<list1.size();i++) {
				salutation=list1.get(i).equals("M")?"Mr.":"Ms.";
				name=list2.get(i).toString();
				amount=list3.get(i).toString();
				date=list4.get(i).toString();
				template2=template.
						replace("$1salutation", salutation).
						replace("$2name",name).
						replace("$3amount",amount).
						replace("$4date",date);
				System.out.println(template2);
				fw1.write(template2+"\n");
			}
			fw1.close();
		}
		catch(IOException ioe) {
			System.out.println("File not found"+ioe);
		}
	}

}
