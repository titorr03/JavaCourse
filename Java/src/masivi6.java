import java.util.*;
public class masivi6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		int [] arr= new int[10];
		String[] mesec= {"Septemvri", "Oktomvri", "Noemvri","Dekemvri", "Qnuari", "Fevruari", "Mart", "April","Mai", "Yuni"};
		for(int i=0;i<arr.length;i++) {
			System.out.print(mesec[i]+": ");
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
		
		System.out.println("Nai-silno : ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ng) {
				System.out.println(mesec[i]);
			}
		}
		
		System.out.println("Nai-slabo : ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==nm) {
				System.out.println(mesec[i]);
			}
		}
		

		
		
	}

}
