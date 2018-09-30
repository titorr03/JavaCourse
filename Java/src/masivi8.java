import java.util.*;
public class masivi8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		boolean saw= true;
		int n=in.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int ng=arr[i];
					arr[i]=arr[j];
					arr[j]=ng;
				}
			}
		}
		int c=0;
		int np=0;
		int ngp =0;
		for (int i=0;i<arr.length;i++) {
			c=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					c++;
				}
			}
			if(c>np) {
				np=c;
				ngp=arr[i];
			}
		}
		
		if(n%2==0) {
			if(np>n/2) {
				saw=false;
			}
		}else {
			if(np>n/2) {
				saw=false;
			}
		}
		
		if(n%2==1&&(ngp==arr[0]||ngp==arr[n-1])) {
			saw=true;
		}
		
		if(saw==false) {
			System.out.println("ne moje");
		}else {
			System.out.println("moje");
		}
	

		
	}

}
