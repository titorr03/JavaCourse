import java.util.*;
public class masivi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner (System.in);
		int n=in.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		System.out.println("2ri masiv: ");
		int p=in.nextInt();
		int[] arr2= new int[p];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=in.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int r=0;r<arr2.length;r++) {
				if(arr[i]==arr2[r]) {
					System.out.println(arr[i]);
				}
			}
		}
		
		
		
		
		
		
		

	}

}
