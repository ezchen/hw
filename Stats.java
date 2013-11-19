//Eric Chen
//pd 9
//HW10
//2013-10-7
//class Stats

/* ---------------------------------------------------
   This class serves a purpose similar to that of the built-in class Math:
   it provides a set of commonly used statistical functions.
   As such, the methods are all declared static, since no Objects of this
   class need ever be instantiated.
   --------------------------------------------------- */
public class Stats {

    public static int mean( int a, int b ) {
	return (a + b) / 2; //N: integer division will truncate/floor quotient
    }

    public static double mean( double a, double b ) {
	double ans = ( a + b ) / 2;
	return ans; 
    }

    public static int max( int a, int b ) {
	return ( a + b + Math.abs(a-b) ) / 2; 
    }

    public static double max( double a, double b ) {
	return ( a + b + Math.abs(a-b) ) / 2; 
    }

    public static int geoMean( int a, int b ) {
	// the double returned by Math.sqrt() must be 
	// typecast into an int
	return (int) Math.sqrt( a * b );
    }

    public static double geoMean( double a, double b ) {
	return Math.sqrt( a * b );
    }

    public static double max(double a, double b, double c) {
	    return max(b, max(a, c));
    }

    public static int geoMean(int a, int b, int c) {
	    return (int) Math.sqrt(a * b * c);
    }

    public static double geoMean(double a, double b, double c) {
	    return Math.pow(a*b*c, 1.0/3.0);
    }

    public static int gcd(int a, int b) {
	    int x = 2;
	    int gcd = 1;
	    while (x <= Math.min(a, b)) {
		    if (a % x == 0 && b % x == 0) {
			gcd = x;
		    }
		    x++;
	    }
	    return gcd;
    }

    public static int gcder(int a, int b) {
	    if (b==0)
		    return a;
	    else
		    return gcder(b, a%b);
    }

    public static int gcdew(int a, int b) {
	    int newB = b;
	    while (b!=0) {
		    newB = b%a;
		    a = b;
		    b = newB;
	    }
	    return a;
    }

    public static int lcm( int num1, int num2 ) {
	    return (num1 * num2) / gcder( num1, num2 );
    }


}//end class Stats
