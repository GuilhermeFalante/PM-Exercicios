package Abstract.quest2;

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

}
