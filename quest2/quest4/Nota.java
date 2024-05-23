package Abstract.quest2.quest4;

public class Nota {
    private float nota;
    private int numProva;
    
    public Nota(float nota , int numProva){
        setNota(nota);
        setNumProva(numProva);
    }
    
    public float getNota() {
        return nota;
    }
    public void setNota(float nota) {
        this.nota = nota;
    }
    public int getNumProva() {
        return numProva;
    }
    public void setNumProva(int numProva) {
        this.numProva = numProva;
    }
    
}
