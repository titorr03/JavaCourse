import java.util.*;
public class masivi1d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		boolean vtoro=true;
        int n= in.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        
        int ng=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>ng){
                ng=arr[i];
            }
        }
        int nm=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]<nm){
                nm=arr[i];
            }
        }
        if(ng==nm) {
        	vtoro=false;
        }
  
        
        for(int i=0; i<arr.length;i++){
            if(arr[i]==ng){
                arr[i]=nm-1;
            }
        }
        ng=nm-1;
        int vng=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>vng){
                vng=arr[i];
                
            }
        }
        
        if(vtoro==false) {
        	System.out.println("nqma vtoro");
        }else {
        	System.out.println(vng);
        }
        
		
		

	}

}
