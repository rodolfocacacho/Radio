import java.util.*;

public class Carro implements Radio{
    public Carro() {}
    private double emisora;
    private boolean estado;
    private boolean frecuencia;
    private double[] botonesAM;
    private double[] botonesFM;
    
    public void setEmisora(double emisora){
        this.emisora = emisora;
    }
    
    public double getEmisora(){
        return emisora;
    }
    
    public void setEstado(boolean estado){
        this.estado = estado;
    }
    
    public boolean getEstado(){
        return estado;
    }
    
    public void setFrecuencia(boolean frecuencia){
        this.frecuencia = frecuencia;
    }
    
    public boolean getFrecuencia(){
        return frecuencia;
    }
    
    public void setBotonesAM(int numBoton, double emisora){
        botonesAM[numBoton] = emisora;
    }
    
    public double getBotonesAM(int numBoton){
        return botonesAM[numBoton];
    }
    
        public void setBotonesFM(int numBoton, double emisora){
        botonesFM[numBoton] = emisora;
    }
    
    public double getBotonesFM(int numBoton){
        return botonesFM[numBoton];
    }
    //True = ON -- False = OFF
    public void ON_OFF() {
        boolean state;
        state = getEstado();
        if (state == true){
            setEstado(false);
        } else {
            setEstado(true);
        }
    }
    //True = AM -- False = FM
    public void AM_FM() {
        boolean frequency;
        frequency = getFrecuencia();
        if (frequency == true){
            setFrecuencia(false);
            setEmisora(87.9);//Para no dejar mal las emisoras al realizar el cambio
        } else {
            setFrecuencia(true);
            setEmisora(530);//Para no dejar mal las emisoras al realizar el cambio
        }
    }
    //upDown True = UP -- False = DOWN
    public void Cambio_de_Emisora(boolean upDown) {
        boolean frequency = getFrecuencia();
        double estacion = getEmisora();
        if (frequency == true && upDown == true){
            estacion = estacion + 10;
            if (estacion > 1610){
                estacion = 530;
            }
        }
        if (frequency == true && upDown == false){
            estacion = estacion - 10;
            if (estacion < 530){
                estacion = 1610;
            }
        }
        if (frequency == false && upDown == true){
            estacion = estacion + 0.2;
            if (estacion > 107.9){
                estacion = 87.9;
            }
        }
        if (frequency == false && upDown == false){
            estacion = estacion - 0.2;
            if (estacion < 87.9){
                estacion = 107.9;
            }
        }
    }

    public void Guardar_Emisora(int boton) {
        boolean frequency = getFrecuencia();
        if (frequency == true){
            setBotonesAM(boton,getEmisora());
        } else{
            setBotonesFM(boton,getEmisora());
        }
    }

    public void Seleccionar_emisora_guardada() {
        
    }

    public void Guardar_seleccion() {
        
    }

    public void MenuOn() {
        
    }

    public void MenuOff() {
        
    }

}
