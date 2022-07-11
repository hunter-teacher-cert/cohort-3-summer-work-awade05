/**
 * Rational class by Team BangPi
 *Alicia Wade
 * collaborators: William L, Susie S,  Wayne Tobias
 */


/**
   class Rational
   An instance of this class will represent a rational number (p/q s.t. p,q ints && q!=0),
   and facilitate mathematical operations with another instance of class Rational.
   Basic level (complete all):
   - default constructor x
   - toString x
   - multiply x
   - divide x
   Intermediate level (complete Basic methods plus these methods):
   - floatValue
   - overloaded constructor x
   Advanced level (complete Basic + Intermediate + these methods):
   -
*/
// the first big goal is to make an output that looks something like n/d


public class Rational
{
  // Instance variables aka attributes for numerator and denominator
  private int _numerator;
  private int _denominator;


  // default constructor (no parameters)
  // creates a new Rational with value 0/1
  // the constructor gives stuff to the private values
  public Rational()
  {
    this._numerator = 0;
    this._denominator =1;
  }


  // overloaded constructor
  // takes 2 parameters, one for the numerator, one for the denominator
  // if an invalid denominator is attempted, should print a message and set the number to 0/1
  public Rational( int n, int d )
  {
    
    this._numerator = n;
    this._denominator = d;
    // is this correct? yes! 
  }


  // toString
  // returns a string representation of the rational number (formatting of your choice)
  public String toString()
  {

    return this._numerator + "/" + this._denominator;
    
    //I think they want us to keep it as x/x format even if it evals to a whole number
    //okay that makes sense!
    // I am going to compress this down to just that return then for everyone!
    
  }

  // with the above 3 done we can look at a lot of the test cases


  // floatValue
  // returns floating point approximation of the number
  // uses the most precise floating point primitive
  public double floatValue()
  {
    // have turn the interigers into doubles
    // we can do that by casting one or both of the ints in new doubles
    double n = this._numerator;
    double d = this._denominator;
    
    return n/d; 
  }


  // multiply
  // takes a Rational parameter and multiplies it by this Rational
  // does not return a value
  // modifies this object
  // does not modify input
  // need not reduce
  public void multiply( Rational r )
  {

    // let's start with the numerator - short operation *= returns the product
    this._numerator *= r._numerator; // numerators set to curent value times r._num
    this._denominator *= r._denominator;
  }


  // divide
  // same as multiply, except operation is division
  public void divide( Rational r )
  {
    // t.n/t.d ÷ r.n/r.d = t.n/t.d × r.d/r.n
    // switch denominator and numerator for division
    this._numerator *= r._denominator;
    this._denominator *= r._numerator;

    
    // we can't use straight divsion because it might ressult in a decimal so we have
    // to use the whole silly math  thing of (A/B) / (C/D) is the same as
    // (A/B) * (D/C)!
    
  }

}//end class
