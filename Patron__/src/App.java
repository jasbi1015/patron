import singleton.Constante;

public class App{
    public static void main(String[] args) throws Exception{
        Constante constante = Constante.getIntance();
        System.out.println(constante);
        constante.setDatos("Iva", 0.16);
        System.out.println(constante);
        Constante constante2 = Constante.getIntance();
        System.out.println(constante2);
    }
}