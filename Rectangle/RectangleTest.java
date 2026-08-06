//RectangleTest
package Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(18.0f);
        r.setWidth(10.0f);
        System.out.printf("\nPerimeter of Rectangle = %.2f", r.Perimeter());
        System.out.printf("\nArea of Rectangle = %.2f \n", r.Area());
    }
}
