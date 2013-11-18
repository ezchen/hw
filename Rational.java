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

	public String toString() {
		return num + " / " + denom;
	}

	public void multiply( Rational otherNum ) {
		num = num * otherNum.num;
		denom = denom * otherNum.denom;	
	}

	public void divide( Rational otherNum ) {
		num = num / otherNum.num;
		denom = denom / otherNum.denom;
	}

	public static void main(String[] args) {
		Rational number = new Rational( 3, 5 );

		System.out.println( number );
		System.out.println( number.floatValue() );
	}

}
