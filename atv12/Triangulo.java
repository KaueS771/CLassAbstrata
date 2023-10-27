public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(String cor, double base, double altura){
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double areaTriangulo(){
        return base * altura/2;

    }
    public String toString(){
        String tria ="Area do Triangulo:" + areaTriangulo();
        return tria;

    }
    
}
