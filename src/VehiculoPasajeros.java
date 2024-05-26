public class VehiculoPasajeros extends Vehiculo {

    private int numPasajeros;

    //Constructor
    public VehiculoPasajeros(String marca, String modelo, int año, int kilometraje, int numPasajeros){
        super(marca, modelo, año, kilometraje);
        this.numPasajeros = numPasajeros;
    }

    //Get, set para numPasajeros
    public int getNumPasajeros(){
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros){
       this.numPasajeros = numPasajeros;
    }

    //sobreescribir el metodo mostrar info
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero de pasajeros: " + numPasajeros);
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento del vehículo de pasajeros. Número de pasajeros: " + numPasajeros);
    }
}


