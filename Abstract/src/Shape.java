package src;   

//Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape. Write a test program that creates objects of Circle and Triangle and prints the area and perimeter of each shape.
public abstract class Shape {
    private float perimetro;
    private float area;
    public Shape(float perimetro, float area){
        this.perimetro = perimetro;
        this.area = area;
    }
    public float getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
    public float getArea() {
        return area;
    }
    public void setArea(float area) {
        this.area = area;
    }  

    public abstract void calculateArea();
    public abstract void calculatePerimeter();
}
