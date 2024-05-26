public class Auto extends VehiculoPasajeros{
    private String tipoCombustible;

    //Constructor
    public Auto(String marca, String modelo, int año, int kilometraje, int numPasajeros, String tipoCombustible){
        super(marca, modelo, año, kilometraje, numPasajeros);
        this.tipoCombustible = tipoCombustible;
    }

    //Get, set para tipocombustible
    public String getTipoCombustible(){
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible){
        this.tipoCombustible = tipoCombustible;
    }
     

    //sobreescribir el metodo
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo de Combustible: " + tipoCombustible);
    }

    
    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento del auto. ");
        System.out.println("Mantenimiento: Cambio de aceite, revisión de frenos y neumáticos.");
    }

    // Método para calcular el costo de mantenimiento
    public double calcularCostoMantenimiento(double costoPorKm, int kilometrosRecorridos) {
        return costoPorKm * kilometrosRecorridos;
    }

}
