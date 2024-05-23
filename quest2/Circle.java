package Abstract.quest2;

public abstract class Circle extends Shape{
    private float raio;
    
    public Circle(float perimetro, float area ,float raio){
        super(perimetro, area);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
    public void setRaio(float raio) {
        this.raio = raio;
    }
}
