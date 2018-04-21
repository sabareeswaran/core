package general;

public class Patterns {

	public static void makePattern1(int n) {
		
		for(int i=0;i<=n;i++) {
			int counter =1;
			for(int j=1;j<=i;j++) {
				System.out.print(i);
				if(counter==i) {
				}
				else {
					System.out.print("*");
				}
				counter = counter+1;
			}if(i>0)
			System.out.println();
		}
		for(int i=n-1;i>0;i--) {
			int counter =1;
			for(int j=1;j<=i;j++) {
				System.out.print(i);
				if(counter==i) {
				}
				else {
					System.out.print("*");
				}
				counter = counter+1;
			}if(i>0)
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		makePattern1(5);
	}
}
