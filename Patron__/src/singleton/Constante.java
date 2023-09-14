package singleton;

public class Constante {
    
    private static Constante instancia;

    private String nombreConstante;
    private double valorConstante;E
    private Constante(){
        nombreConstante = "N/A";
        valorConstante = 0;
    }
    
    public static Constante getIntance(){
        if(instancia == null){
            instancia = new Constante();
            System.out.println("Instancia creada por primera y unica vez");
        }
        return instancia;
    }


    public String toString(){
        return "Constante [nombreConstante=" + nombreConstante + ", valorConstante=" + valorConstante + "]";
    }

    public void setDatos(String name, double value){
        this.nombreConstante = name;
        this.valorConstante = value;
    }

}

