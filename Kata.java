import java.util.ArrayList;

public class Kata {
	
	public static int gcd(int a, int b) {
		if (a < 1 || b < 1) {
			System.out.println("Given integer is less than one ");
		}
		int remainder = 0;
		do {
			remainder = a % b;
			a = b;
			b = remainder;
		} while (b != 0);
		return a;
	}
	
	public static int lcm(int a, int b) {
		if (a == 0 || b == 0) {
			return 0;
		}
		else {
			return (a * b) / gcd(a, b);
		}
		
	}
	
	public static ArrayList<Integer> removeEven(Object[][] n) {
		int rows = n.length;
    	int cols = n[0].length;
    	ArrayList<Integer> evenList = new ArrayList<Integer>();
    	
		for(int i = 0; i < rows; i++) {
		    for(int j = 0; j < cols; j++) {
		        evenList.add((Integer) n[i][j]);
		    }
		}
		return evenList;
	}
	
    public static long KiyoLCM(Object[][] a) {
    	int rows = a.length;
    	int cols = a[0].length;
    	long sum = 0;
    	Integer a1;
    	
    	for (int i = 0; i < rows; i++)
    	    for (int j = 0; j < cols; j++)
    	    {
    	        if((int) a[i][j] % 2 == 0) {
    	            a[i][j] = 0;
    	        }
    	        else {
    	        	a1 = (int) a[i][j];
    	        	sum += Long.valueOf(a1.longValue());
    	        }
    	    }
    		return sum;
    	}
    }
