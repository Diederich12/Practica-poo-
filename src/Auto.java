public class Auto extends VehiculoPasajero {
    private String tipoDeCombustible;

    // Constructor
    public Auto(String marca, String modelo, int año, int kilometraje, int numPasajero, String tipoDeCombustible) {
        super(marca, modelo, año, kilometraje, numPasajero);
        this.tipoDeCombustible = tipoDeCombustible;

    }

    // Getter y Setter para tipoDeCombustible
    public String getTipoCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;

    }

    // sobreescribir el metodo mostrarInfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de Combustible: " + tipoDeCombustible);
    }

    
    

    


}
