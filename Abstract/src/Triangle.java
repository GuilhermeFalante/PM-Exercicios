public class Triangle extends Shape{
    private float a;
    private float b;
    private float c;

    public Triangle(float perimetro, float area, float a, float b, float c){
        super(perimetro, area);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getC() {
        return c;
    }
    public void setC(float c) {
        this.c = c;
    }
    public float getA() {
        return a;
    }
    public void setA(float a) {
        this.a = a;
    }
    public float getB() {
        return b;
    }
    public void setB(float b) {
        this.b = b;
    }

    @override
    public void calculateArea(){
        this.setArea((this.a * this.b) / 2);
    }

    @Override
    public void calculatePerimeter(){
        this.setPerimetro(this.a + this.b + this.c);
    }
}
