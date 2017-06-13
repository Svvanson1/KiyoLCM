
	
	public static boolean isOdd(int n) {
		if (n % 2 == 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	private static long gcd(long a, long b)
	{
	    while (b > 0)
	    {
	        long temp = b;
	        b = a % b;
	        a = temp;
	    }
	    return a;
	}

	private static long gcd(long[] input)
	{
	    long result = input[0];
	    for(int i = 1; i < input.length; i++) result = gcd(result, input[i]);
	    return result;
	}
	
	private static long lcm(long a, long b)
	{
	    return a * (b / gcd(a, b));
	}

	private static long lcm(long[] input)
	{
	    long result = input[0];
	    for(int i = 1; i < input.length; i++) result = lcm(result, input[i]);
	    return result;
	}
	
    public static long KiyoLCM(Object[][] a) {
    	int rows = a.length;
    	int cols = a[0].length;
    	long sum = 0;
    	long[] sumArray = new long[rows];
    	
    	for (int i = 0; i < rows; i++) {
    			sum = 0;
    	    for (int j = 0; j < cols; j++) {
    	    	if ((!(a[i][j].getClass().getName().equalsIgnoreCase("int"))) || (!(a[i][j].getClass().getName().equalsIgnoreCase("integer")))) {
    	    		if(isOdd((Integer) a[i][j])) {
    	    			sum += (Integer) a[i][j];
    	    		}
    	    		
    	    	}
    	    }
    	    sumArray[i] = sum;
    	}
    	
    	return lcm(sumArray);
    }
}
