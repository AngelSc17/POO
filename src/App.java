public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Informacion de los vehiculos. ");

        //Crear instancias de cada tipo de vehiculo
        Auto auto = new Auto("Toyota", "Corolla", 2020, 15000, 5 ,"Gasolina");

        Camion camion = new Camion("Volvo", "FH", 2019, 75000,20000, 4);

        //Mostrar la informacion de cada vehiculo
        System.out.println("Informacion del Auto: ");
        auto.mostrarInfo();
        auto.realizarMantenimiento();
        double costoMantenimiento = auto.calcularCostoMantenimiento(0.50, 1000);
        System.out.println("Costo de mantenimiento del auto: " + costoMantenimiento);

        System.out.println("\nInformacion del Camion: ");
        camion.mostrarInfo();
        camion.realizarMantenimiento();

    }
}
