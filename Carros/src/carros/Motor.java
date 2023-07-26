package carros;
public class Motor {
    private double potencia;
    private String combustivel;
    
    public Motor(double p, String c){
    this.combustivel = c;
    this.potencia = p;
    }
    public double getPotencia(){
        return potencia;
    }
    public String getCombustivel(){
        return combustivel;
    }
    public void setPotencia(double p ){
    this.potencia = p;
    }
    public void setCombustivel(String c){
    this.combustivel = c;
    }
}
