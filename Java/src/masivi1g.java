import java.util.*;
public class masivi1g {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int[] arr= new int[n];
		for(int i=0;i <arr.length;i++) {
			arr[i]=in.nextInt();
		}
		int ng=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>ng) {
				ng=arr[i];
			}
		}
		int nm=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<nm) {
				nm=arr[i];
			}
		}
		int raz=ng-nm;
		int c=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==raz) {
				System.out.println(raz);
				c++;
				break;
			}
		}
		if(c==0) {
			System.out.println("nqma takova n v masiva");
		}

		
		
		
	}

}
