import java.util.*;
public class masivi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int [] arr= new int[n];
        
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        int nm= arr[0]+arr[1];
        
        for(int r=0;r<arr.length;r++){
        
            for(int t=0;t<arr.length;t++){
                if(arr[r]+arr[t]<nm&&r!=t){
                    nm=arr[r]+arr[t];
                }
                
            }
        }
        
        
        System.out.println(nm);
	}

}
