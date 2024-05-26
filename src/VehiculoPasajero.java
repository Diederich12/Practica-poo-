public class VehiculoPasajero extends Vehiculo {

    private int numPasajero;

    public  VehiculoPasajero(String marca, String modelo, int año, int kilometraje, int numPasajero) {
        super(marca, modelo, año, kilometraje);
        this.numPasajero = numPasajero;
    }

    public int getNumPasajero() {
        return numPasajero;
    }

    public void setNumPasajero(int numPasajero) {
        this.numPasajero = numPasajero;
    }

    // sobreescribir el metodo mostrarInfo ()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println(" Numero de Pasajero: " + numPasajero);
    }


}
