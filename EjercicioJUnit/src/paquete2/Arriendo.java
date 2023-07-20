package paquete2;
public abstract class Arriendo {
    public String nombreArrendatario;
    protected double arriendoMensual;
    protected double cuotaBase;
    public Arriendo(String nombre, double cuotaB){
        establecerNombreArrendatario(nombre);
        cuotaBase = cuotaB;
    }
    public void establecerNombreArrendatario(String nombre){
        nombreArrendatario = nombre;
    }
    public void establecerCuotaBase(double x){
        cuotaBase = x;
    }
    public abstract void establecerArriendoMensual();
    public String obtenerNombreArrendatario(){
        return nombreArrendatario;
    }
    public double obtenerCuotaBase(){
        return cuotaBase;
    }
    public double obtenerArriendoMensual(){
        return arriendoMensual;
    }
}
