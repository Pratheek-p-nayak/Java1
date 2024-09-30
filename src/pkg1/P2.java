package pkg1;

public class P2 {
	public static void main(String[] args) {
		int start=3,end=20;
		for(int j=start;j<end+1;j++) {
			for(int i=1;i<11;i++) {
				System.out.println(j + "*" + i + "=" + j*i);
			}
			System.out.println();
			
		}
	}
}
