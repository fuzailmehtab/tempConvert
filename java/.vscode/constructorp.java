class Cylinder{
  private int radius;
  private int height;
  
  public Cylinder(int radius, int height) {
    this.radius = radius;
    this.height = height;
  }
  public int getHeight() {
    return height;
  }
  public void setHeight(int height) {
    this.height = height;
  }
  public int getRadius() {
    return radius;
  }
  public void setRadius(int radius) {
    this.radius = radius;
  }
  //problem2
  public double surfaceArea(){
    return 2 * 3.14 * radius  * radius + 2 * 3.14 * radius * height;
    //return 2*math.PI*radius*radius+2*math.PI*radius*height for exact value.
  }
}
class Rectangle {
private int length;
private int breadth; 
public Rectangle() {
  this.length = 4;
  this.breadth = 5;
}
public Rectangle(int length, int breadth) {
  this.length = length;
  this.breadth = breadth;
}
}

public class constructorp {
  public static void main(String[] args) {
    //problem 1
    // Cylinder mCylinder =new Cylinder();
    // mCylinder.setHeight(12);
    // int h = mCylinder.getHeight();
    // System.out.println(h);
    // mCylinder.setRadius(14);
    // int r = mCylinder.getRadius();
    // System.out.println(r);
    // //problem 2
    // System.out.println(mCylinder.surfaceArea());
    //problem 3
    //
    Cylinder mCylinder = new Cylinder(14,12);
    mCylinder.getHeight();
    mCylinder.getRadius();
    System.out.println(mCylinder.surfaceArea());
    //problem 4
    Rectangle r = new Rectangle();
  }
}
