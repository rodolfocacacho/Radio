public interface Radio{
    public void OnOff(){}
    public void AmFm(){}
    public void CambiarEmisora(){}
    public void GuardarEmisora(){}
    public void SeleccionarEmisora(){}
    public void GuardarSeleccionar(){}
}

public class Carro implements Radio{
    //Almacena si se encuentra encendida o apagada
    private boolean encendido;
    //Almacena si se encuentra en AM o FM
    private boolean frecuencia;
    //Botones para guardar emisoras
    private int bot1;
    private int bot2;
    private int bot3;
    private int bot4;
    private int bot5;
    private int bot6;
    private int bot7;
    private int bot8;
    private int bot9;
    private int bot10;
    private int bot11;
    private int bot12;
    //Almacena la emisora actual
    private float emisoraActual
    //Almacena si los botones guardaran o seleccionaran
    private boolean saveSelect

//PONERLE CUERPO A ESTOS METODOS
    public void OnOff(){
        
    }
    public void AmFm(){
    
    }
    public void CambiarEmisora(){
    
    }
    public void GuardarEmisora(){
    
    }
    public void SeleccionarEmisora(){
    
    }
    public void GuardarSeleccionar(){
    
    }
}