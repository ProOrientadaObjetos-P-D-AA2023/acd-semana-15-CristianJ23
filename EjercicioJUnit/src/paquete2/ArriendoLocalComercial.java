package paquete2;
public class ArriendoLocalComercial extends Arriendo{
    protected double valorAdicionalFijo;
    public ArriendoLocalComercial(String nombre, double cuotaB){
        super(nombre, cuotaB);
    }
    @Override
    public void establecerNombreArrendatario(String nombre){
        nombreArrendatario = nombre.toUpperCase();
    }
    public void establecerValorAdicionalFijo(double x){
        valorAdicionalFijo = x;
    }
    @Override
    public void establecerArriendoMensual(){
        arriendoMensual = obtenerCuotaBase() + obtenerValorAdicionalFijo();
    }
    public double obtenerValorAdicionalFijo(){
        return valorAdicionalFijo;
    }
    @Override
    public String toString(){
        String cadena = String.format("Ariendo de Local Comercial\n"
                + "Nombre Arrendatario: %s\n"
                + "Cuota base: %.2f\n"
                + "Valor adicional fijo: %.2f\n"
                + "Arriendo Total: %.2f\n", 
                obtenerNombreArrendatario(),
                obtenerCuotaBase(),
                obtenerValorAdicionalFijo(),
                obtenerArriendoMensual());
        return cadena;
    }
}
