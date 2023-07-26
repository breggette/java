package carros;

public class modelos {
    private int ano;
    private String modelo;
    private Motor vc;
    int rodas;
    
    
    public modelos(String modelo, int ano, Motor n)  {
        this.ano = ano;
        this.modelo =  modelo;
        this.vc = n;
    }
    
    
    public void mostraCarro() {
        System.out.println("modelo: " + modelo);
        System.out.println("Ano: " +  ano);
        System.out.println("Motor: " + vc.getPotencia());
        
    }
    public static int numeroRodas() {
        System.out.println("Quantidades de rodas: " + rodas);
    }
}
