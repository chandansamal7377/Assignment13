public class Uc1 {
  // determines the largest of three Comparable objects
  public static <G extends Comparable<G>> G maximum(G x, G y, G z) {
    G max = x; // assume x is initially the largest

    if (y.compareTo(max) > 0)
      max = y; // y is the largest so far

    if (z.compareTo(max) > 0)
      max = z; // z is the largest

    return max; // returns the largest object
  } // end method maximum

  public static void main(String args[]) {
    System.out.print("Maximum of %d, %d and %d is %d\n\n", 3, 4, 5, maximum(3, 4, 5));
  }
}
