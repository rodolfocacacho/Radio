public interface Radio{
    public void ON_OFF();
    public void AM_FM();
    public void Cambio_de_Emisora(boolean a);
    public void Guardar_Emisora(int x);
    public void Seleccionar_emisora_guardada(int y);
    public void Guardar_seleccion();
    public double getEmisora();
}
