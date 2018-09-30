import java.util.*;
public class masivi4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		int n=in.nextInt();
		int [] arr1= new int[n];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=in.nextInt();
		}
		System.out.println("2ri masiv: ");
		int p=in.nextInt();
		int[] arr2= new int[p];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=in.nextInt();
		}
		int pm=0;
		if(n>p) {
			pm=p;
		}else {
			pm=n;
		}
		int m =0;
		int ic=0;
		int c=0;
		int []arr = new int[n+p];
		if(n==p) {
			for(int i=0;i<arr.length;i+=2) {
			arr[i]=arr1[c];
			arr[i+1]=arr2[c];
			c++;
			System.out.println(arr[i]);
			System.out.println(arr[i+1]);
		}
		}else {
			c=0;
			while(c<pm){
				
				arr[m]=arr1[c];
				arr[m+1]=arr2[c];
				System.out.println(arr[m]);
				System.out.println(arr[m+1]);
				ic+=2;
				m+=2;
				c++;
		
			}
			while(ic<arr.length) {
				if(n>p) {
					arr[ic]=arr1[c];
					System.out.println(arr[ic]);
					
				}else {
					arr[ic]=arr2[c];
					System.out.println(arr[ic]);
					
				}
			ic++;
			c++;
			}
			
			
			}

		
		
		
		
		
	}

}
