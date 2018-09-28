import java.util.*;
public class masivi1d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
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
        
  
        
        for(int i=0; i<arr.length;i++){
            if(arr[i]==ng){
                arr[i]=-2147483648;
            }
        }
        ng=-2147483648;
        int vng=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>vng){
                vng=arr[i];
                
            }
        }
        
        System.out.println(vng);
        
		
		

	}

}
