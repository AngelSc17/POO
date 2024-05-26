public class Camion extends VehiculoCarga {
    private int numEjes;

    //Constructor
    public Camion(String marca, String modelo, int año, int kilometraje, int capacidadCarga, int numEjes){
        super(marca, modelo, año, kilometraje, capacidadCarga);
        this.numEjes = numEjes;
    }

    //Get, set para numejes
    public int getNumEjes(){
        return numEjes;
    }

    public void setNumEjes(int numEjes){
        this.numEjes = numEjes;
    }
    
    //sobreescribir
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero de ejes: " + numEjes);
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento del camión. ");
        System.out.println("Mantenimiento: Inspección del sistema de frenado, revisión de la transmisión y del sistema eléctrico.");
    }
}


