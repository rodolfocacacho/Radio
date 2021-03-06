import java.util.*;
import java.lang.*;

public class Carro implements Radio{
    public Carro() {}
    private double emisora;
    private boolean estado;
    private boolean frecuencia;
    private double[] botonesAM = new double[] {530,530,530,530,530,530,530,530,530,530};
    private double[] botonesFM = new double[] {87.9,87.9,87.9,87.9,87.9,87.9,87.9,87.9,87.9,87.9};   


    /*
    *@param double emisora
    *@return
    */
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
        this.botonesAM[numBoton] = emisora;
    }
    
    public double getBotonesAM(int numBoton){
        return botonesAM[numBoton];
    }
    
        public void setBotonesFM(int numBoton, double emisora){
        this.botonesFM[numBoton] = emisora;
    }
    
    public double getBotonesFM(int numBoton){
        return botonesFM[numBoton];
    }
    
    public void ON_OFF() {
        estado = !estado;
    }

    public void AM_FM() {
        frecuencia = !frecuencia;
        if (frecuencia == true){
            emisora = 87.9;
        } else {
            emisora = 530;
        }
    }

    public void Cambio_de_Emisora(boolean upDown) {
        if (frecuencia == true && upDown == true){
             emisora = emisora + 0.2;
             if (emisora > 107.9){
                 emisora = 87.9;
             }
         }
         if (frecuencia == true && upDown == false){
             emisora = emisora - 0.2;
             if (emisora < 87.9){
                 emisora = 107.9;
             }
         }
         if (frecuencia == false && upDown == true){
             emisora = emisora + 10;
             if (emisora > 1610){
                 emisora = 530;
             }
         }
         if (frecuencia == false && upDown == false){
             emisora = emisora - 10;
             if (emisora < 530){
                 emisora = 1610;
             }
         }
      }
  
      public void Guardar_Emisora(int boton) {
            boton = boton - 1;
          if (frecuencia == true){
            setBotonesFM(boton,getEmisora());
         } else{
            setBotonesAM(boton,getEmisora());
         }

      }

    public void Seleccionar_emisora_guardada(int boton) {
        boton = boton -1;
        if (frecuencia == false){
            emisora = botonesAM[boton];
        } else{
            emisora = botonesFM[boton];
        }
    }

    public void Guardar_seleccion() {
        
    }


}
