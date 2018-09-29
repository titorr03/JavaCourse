import java.util.*;
public class masivi5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		int [] arr=new int[n];
		int s=n/2;
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		
		int ng=0;
		for(int i=0;i<s;i++) {
			for(int j=i+1;j<s;j++) {
			if(arr[i]<arr[j]) {
				ng=arr[i];
				arr[i]=arr[j];
				arr[j]=ng;
			}	
		}	
		}
		
		int nm=0;
		for(int i=s;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				nm=arr[i];
				arr[i]=arr[j];
				arr[j]=nm;
			}	
		}	
		}
		
		
		
		
	
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

		
		
		
		
	}

}
