package pkg1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P10 {

	public static void main(String[] args) throws IOException {
		List<String> names= new ArrayList<>();
		List<Integer> eMarks= new ArrayList<>();
		List<Integer> mMarks= new ArrayList<>();
		List<Integer> pMarks= new ArrayList<>();
		List<Integer> cMarks= new ArrayList<>();
		List<Integer> bMarks= new ArrayList<>();
		List<Integer> totalMarks=new ArrayList<>();
		int goldMedalistMarks=0;
		int pos=0;
		File f1=new File("Marks.txt");
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNext()) {
			String line1=sc1.nextLine();
			String arr1[]=line1.split(",");
			String arr2[]=arr1[3].split(":");
			String arr3[]=arr1[4].split(":");
			String arr4[]=arr1[5].split(":");
			String arr5[]=arr1[6].split(":");
			String arr6[]=arr1[7].split(":");
			names.add(arr1[0]);
			eMarks.add(Integer.parseInt(arr2[1]));
			mMarks.add(Integer.parseInt(arr3[1]));
			pMarks.add(Integer.parseInt(arr4[1]));
			cMarks.add(Integer.parseInt(arr5[1]));
			bMarks.add(Integer.parseInt(arr6[1]));
		}
		int highestEMarks=Collections.max(eMarks);
		int highestMMarks=Collections.max(mMarks);
		int highestPMarks=Collections.max(pMarks);
		int highestCMarks=Collections.max(cMarks);
		int highestBMarks=Collections.max(bMarks);
		for(int i=0;i<names.size();i++) {
			int count=eMarks.get(i)+mMarks.get(i)+pMarks.get(i)+cMarks.get(i)+bMarks.get(i);
			totalMarks.add(count);
		}
		goldMedalistMarks=Collections.max(totalMarks);
		pos=totalMarks.indexOf(goldMedalistMarks);
		String goldMedalist=names.get(pos);
		System.out.println(goldMedalist+ " IS the gold medalist (Overall Top Scorer) with "+ goldMedalistMarks+" Marks");
		
	}
	
}
