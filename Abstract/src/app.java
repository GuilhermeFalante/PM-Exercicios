
public class app {
    public static void main(String[] args) {
        Triangle t = new Triangle(0, 0, 2, 4, 6);
        Circle c = new Circle(0, 0, 3);
        System.out.println(c.getPerimetro());
        System.out.println(t.getPerimetro());
        t.calculateArea();
        t.calculatePerimeter();
        System.out.println(t.getPerimetro());
        System.out.println(t.getArea());
        c.calculateArea();
        c.calculatePerimeter();
        System.out.println(c.getPerimetro());
        System.out.println(c.getArea());
    }
}
