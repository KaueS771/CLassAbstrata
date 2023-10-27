public class Circulo extends Figura{
    private double raio;

    public Circulo(String cor,double raio){
        super(cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double areaCirculo(){
        return Math.PI * raio * raio;
    }
    public double getDiametro(){
        return 2 * raio;
    }
    public String toString(){
        String circu ="Area do Ciruculo: " + areaCirculo() + "\n Diametro: " + getDiametro();
        return circu;
    }
    
    
}
