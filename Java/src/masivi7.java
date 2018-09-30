import java.util.*;
public class masivi7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int [] arr= new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		System.out.println("2ri masiv: ");
		int k=in.nextInt();
		int[] arr2= new int[k];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=in.nextInt();
		}
		
		int nk=0;
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==arr2[i]) {
					nk++;
				}
			}
		}
		
		if(nk==k) {
			System.out.println("suvpadat");
		}
		else{
			System.out.println("ne suvpadat");
		}
		
		

	}

}
