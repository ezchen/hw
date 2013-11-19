public class Rational {

	private int num;
	private int denom;

	public Rational() {
		this.num = 0;
		this.denom = 1;
	}

	public Rational( int num, int denom ) {
		this();
		if ( denom != 0 ) {
			this.num = num;
			this.denom = denom;
		}
	}

	public double floatValue() {
		return (double) num/denom;
	}

	public void multiply( Rational otherNum ) {
		num = num * otherNum.num;
		denom = denom * otherNum.denom;	
	}

	public void divide( Rational otherNum ) {
		num = num * otherNum.denom;
		denom = denom * otherNum.num;
	}

	public void add( Rational otherNum ) {
		int LCM = Stats.lcm( denom, otherNum.denom );
		num = num * (LCM/denom) + (otherNum.num * (LCM/otherNum.denom));
		denom = LCM;
	}

	public void subtract( Rational otherNum ) {
		int LCM = Stats.lcm( denom, otherNum.denom );
		num = num * (LCM/denom) - (otherNum.num * (LCM/otherNum.denom));
		denom = LCM;
	}

	public int gcd() {
		return Stats.gcder(num, denom);
	}

	public static int gcd(int num, int denom) {
		return Stats.gcder(num, denom);
	}

	public void reduce() {
		int GCD = this.gcd();
		num /= GCD;
		denom /= GCD;
	}

	public String toString() {
		return num + " / " + denom;
	}

	public int compareTo( Rational otherNum ) {
		if (this.floatValue() == otherNum.floatValue()) {
			return 0;
		} else if (this.floatValue() < otherNum.floatValue()) {
			return -1;
		}
		return 1;
	}

	public static void main(String[] args) {
		Rational number = new Rational( 3, 5 );
		Rational number3 = new Rational( 4, 5 );
		Rational number2 = new Rational( 1, 2 );
		Rational number4 = new Rational( 5, 9 );
		Rational number5 = new Rational( 50, 5 );
		Rational number6 = new Rational( 10, 50 );

		/*	
		 *	
		System.out.println( number );
		System.out.println( number.floatValue() );

		number.multiply(number2);
		System.out.println( number );

		number3.divide(number2);
		System.out.println( number3 );

		number4.add(number2);
		System.out.println( number4 );

		number.subtract(number2);
		System.out.println( number );

		System.out.println( number.gcd() );
		System.out.println( number5.gcd() );
		System.out.println( number6.gcd() );
		*/

		System.out.println( number.compareTo( number3 ) );
		System.out.println( number.compareTo( number ) );
		System.out.println( number.compareTo( number2 ) );
		

		
	}

}
