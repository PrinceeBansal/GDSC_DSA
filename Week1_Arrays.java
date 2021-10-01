package gdsc_DSA;

public class Week1_Arrays {
	
	//Find First and Last Position of Element in Sorted Array
	public int[] searchRange(int[] nums, int target) {
		int start = 0;
		int end = 0 ;
		int count = 0;
		
		for(int i=0 ; i<nums.length ; i++) {
			
			if(nums[i]==target && count==0) {start = i ; end =i; count++;}
			else if(nums[i]==target && count!=0) {end = i ;}
		}
		
		if(start==0 && end==0 && count==0) {int[] arr1 = {-1,-1}; return arr1;}
		else {int[] arr2 = {start , end}; return arr2;}
    
	}
	
	
	//reverse an array
	public static void reverseArray(int[] arr) {
		int m = arr.length;
		
		
		for(int i = m-1 ; i>=0 ; i-- ) {
			System.out.println(arr[i]);
			
		}
	}
	
	
	//Find Immediate Smaller Than X 
	
	public static int immediateSmaller(int arr[], int n, int x) {
		int currentAns = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(x > arr[i] && arr[i]>currentAns) {currentAns = arr[i];}
		}
		
		if(currentAns == Integer.MIN_VALUE) {return -1;}
		else {return currentAns;}
		
	}
	
	
	
	//rotate array
	public static void rotate(int [] arr , int d) {
		if(arr.length==0) {return;}
		
		if(d >= arr.length && arr.length!= 0) {d %= arr.length;}
	     
		reverse(arr , 0 , arr.length-1);
		reverse(arr , 0 , arr.length-d-1);
		reverse(arr , arr.length-d , arr.length-1);
	}
	
	
	public static void reverse(int[] arr , int start , int end ) {
		while(start<end) {
			swapElements(arr , start , end);
			start += 1;
			end-= 1;
		}
	}
		
		
		public static void swapElements(int[] arr , int start , int end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		
		
	}
		
		
		//two sum
		 public int[] twoSum(int[] nums, int target) {
		     for (int i = 0; i < nums.length; i++) {
		    	  
		     for (int j = i + 1; j < nums.length; j++) {
		    	 
		                if (nums[j] == target - nums[i]) {
		                    return new int[] { i, j };
		              }
		                
		        }
		     
		   }
		       
		        return null;
 }
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,6,2,4,8,9,7,1};
		reverseArray(arr);

	}

}
