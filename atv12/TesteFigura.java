public class TesteFigura {
    public static void main(String [] agr){
        Circulo cir = new Circulo("Azul",6);
        Retangulo ret = new Retangulo("Vermelho", 10, 15);
        Triangulo tri = new Triangulo("Verde", 10, 10);
        Quadrado qua = new Quadrado(null, 0, 0);


        String tria = tri.toString();
        System.out.println(tri);

        String retan = ret.toString();
        System.out.println(ret);

        String circu = cir.toString();
        System.out.println(cir);




        
        

    }
    
}
