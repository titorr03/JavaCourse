import java.util.*;
public class masivi1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		int [] arr= new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i]=in.nextInt();
		}
		float sredno=0;
		for(int a=0; a <arr.length; a++) {
			sredno=sredno+arr[a];
		}
		sredno=Math.round(sredno/n);
		int p=0;
		float raz;
		int raz2=0;;
		raz=Math.abs(arr[0]-sredno);
		for(int r=0; r <arr.length; r++) {
			if (Math.abs(arr[r]-sredno)<raz) {
				raz=Math.abs(arr[r]-sredno);
				raz2= arr[r];
				p++;
			}
}
		if(p==0) {
			raz2=arr[0];
			System.out.println(raz2);
		}else{
			
			for(int u=0;u <arr.length;u++) {
			if (Math.abs(arr[u]-sredno)==raz){
				if (raz2>arr[u]){
					System.out.println(arr[u]);
				break;
			}else {
				System.out.println(raz2);
				break;
				}
			}
		}
		
		}
		
		
		
		
		
	}

}
