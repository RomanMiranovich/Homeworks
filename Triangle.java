import java.math.BigDecimal;

/**
 * This class is used for keeping triangles with the lengths of its sides:
 * <b>a</b>, <b>b</b> and <b>c<b>
 * And for determination type of triangle.
 */

//todo modification this code with 3 classes of triangles
class Triangle {
  private BigDecimal a;
  private BigDecimal b;
  private BigDecimal c;

  /**
   * This constructor is used for creating new triangles.
   * The parameters are sides of triangle in String type.
   */ 
  //todo norm javadock
  public Triangle(String a, String b, String c) throws NumberFormatException {
    this.a = new BigDecimal(a);
    this.b = new BigDecimal(b);
    this.c = new BigDecimal(c);
    
    if (this.a.signum() <= 0 || this.b.signum() <= 0 || this.c.signum() <= 0) {
      throw new NumberFormatException();
    }
    
    BigDecimal sumAB = this.a.add(this.b);
    BigDecimal sumBC = this.b.add(this.c);
    BigDecimal sumAC = this.a.add(this.c);
    
    if (sumAB.compareTo(this.a) <= 0 || sumBC.compareTo(this.c) <= 0
        || sumAC.compareTo(this.b) <= 0) {
      throw new NumberFormatException(); //todo new kind of exception or find more right variant
    }  
  }

  //todo javadock
  public String checkTriangleType() {
    final String EQUILATERAL_ANSWER = "It is equilateral triangle";
    final String ISOSCELES_ANSWER = "It is isosceles triangle";
    final String CASUAL_ANSWER = "It is usual triangle";
    int x = 0;
    int y = 0;
    int z = 0;
    
    x = a.compareTo(b);
    y = b.compareTo(c);
    z = a.compareTo(c);

    if (x == 0 && y == 0 && z == 0) {
      return EQUILATERAL_ANSWER;
    } else if (x == 0 || y == 0 || z == 0) {
       return ISOSCELES_ANSWER;
    } else {
      return CASUAL_ANSWER;
    }
  }
}