
public class OPERACIONES {
    private double Valor, resultado;
    private int cambio, cambiofinal;

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public int getCambio() {
        return cambio;
    }

    public void setCambio(int cambio) {
        this.cambio = cambio;
    }

    public int getCambiofinal() {
        return cambiofinal;
    }

    public void setCambiofinal(int cambiofinal) {
        this.cambiofinal = cambiofinal;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public OPERACIONES() {
    }

    
    public double convertir(){
        
        
        if(cambio == 0 && cambiofinal == 1){
            resultado= Valor* 0.85;
        }
        else
            if(cambio == 0 && cambiofinal == 0){
                resultado= Valor;
            }    
        if(cambio == 0 && cambiofinal == 2){
            resultado= Valor*24.77;
        }
        else
            if(cambio == 0 && cambiofinal == 2){
                resultado= Valor;
            }
        
        
        
        if(cambiofinal == 0 && cambio == 1){
            resultado= Valor* 1.17;
        }
        else
            if(cambiofinal == 0 && cambio == 1){
                resultado= Valor;
            }
        if(cambiofinal == 0 && cambio == 2){
            resultado= Valor* 0.040;
        }
        else
            if(cambiofinal == 1 && cambio == 2){
                resultado= Valor;
            }
        
        
        
        if(cambio == 0 && cambio == 0){
            resultado= Valor* 0.034;
        }
        else
            if(cambio == 1 && cambio == 1){
                resultado= Valor;
            }   
        
        if(cambio == 1 && cambio == 1){
            resultado= Valor* 29.23;
        }
        else
            if(cambio == 2 && cambio == 2){
                resultado= Valor;
            }
        
        return resultado;
    }
    
    
}
