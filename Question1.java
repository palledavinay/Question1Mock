package in.ineuron.main;

public class Question1 {
	 public int mySqrt(int x) {
	        if (x == 0) {
	            return 0;
	        }
	        
	        int left = 1;
	        int right = x;
	        
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            
	            if (mid == x / mid) {
	                return mid;
	            } else if (mid < x / mid) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        
	        return right;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question1 solution = new Question1();
		System.out.println(solution.mySqrt(4)); 
		System.out.println(solution.mySqrt(8));
	}

}
