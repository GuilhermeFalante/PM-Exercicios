public class Circle extends Shape{
    private double raio;
    
    public Circle(float perimetro, float area ,double raio){
        super(perimetro, area);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }

    @override
    public void calculateArea(){
        this.setArea(2 * Math.PI * raio);
    }

    @override
    public void calculatePerimeter(){
        this.setPerimetro(Math.PI * Math.pow(raio, 2));
    }
}
