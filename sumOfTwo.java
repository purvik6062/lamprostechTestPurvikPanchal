import java.util.*;

public class sumOfTwo{
	
	public static void main(String args[])
{
		
		Scanner sc = new Scanner(System.in);			// Using Scanner
		System.out.println("Enter size of Array");		
        int size = sc.nextInt();						// for getting size of an array
		int arr[] = new int[size];
        System.out.println("Enter Array Elements:");		
        for(int i=0;i<size;i++){						//fetching array elements
            arr[i]=sc.nextInt();
		}
		System.out.println("Enter target");				//user will enter the target to find the sum..
        int target = sc.nextInt();
	
	
	/*		
		Starting our loop from 0th index till the size - 1 because array is starting from 0th index. And will increment i. After that we will start another loop from i+1 because to get the two elements of array one by one..
		
		after the loop we will compare two elements with comparison operator the given target and if the target matches with the two sum then it will return the index of that two..	*/
	for(int i=0; i<size-1; i++){			
		for(int j = i+1; j<size; j++){
			if(arr[i]+arr[j] == target){
				System.out.println(i+" "+j);  //will compare and return index
			}
		}
	}
}
}