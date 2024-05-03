//Code in java
public class Main {
	
	public static void main(String[] args) {
		int n = 3;
		for(n=1;n<100000;n++) {
		System.out.println("Ulam Sequence for n= "+ n+":");
		UlamSequence(n);
		}
	}
	
	public static void UlamSequence(int n) {
		System.out.print(n+" ");
		while(n!=2) {
			if(n%2==0) {
				n = n/2;
			} else {
				n = n*3+1;
			}
			System.out.print(n+" ");
		}
	}
}
