public class Proveedor {
    private String nombre;
    private double diferenciaPrecio;
    private String region;
    private double envioDocumento;
    private double envioCaja;
    private double cargoExcesoPeso;

    private Proveedor(Builder builder){
        this.nombre = builder.nombre;
        this.diferenciaPrecio = builder.diferenciaPrecio;
        this.region = builder.region;
        this.envioDocumento = builder.envioDocumento;
        this.envioCaja = builder.envioCaja;
        this.cargoExcesoPeso = builder.cargoExcesoPeso;
    }

    //Checar este
    public String crearTipoEnvio(){
        return null;
    }

    //Checar este
    public String getProveedor(){
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDiferenciaPrecio() {
        return diferenciaPrecio;
    }

    public void setDiferenciaPrecio(double diferenciaPrecio) {
        this.diferenciaPrecio = diferenciaPrecio;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getEnvioDocumento() {
        return envioDocumento;
    }

    public void setEnvioDocumento(double envioDocumento) {
        this.envioDocumento = envioDocumento;
    }

    public double getEnvioCaja() {
        return envioCaja;
    }

    public void setEnvioCaja(double envioCaja) {
        this.envioCaja = envioCaja;
    }

    public double getCargoExcesoPeso() {
        return cargoExcesoPeso;
    }

    public void setCargoExcesoPeso(double cargoExcesoPeso) {
        this.cargoExcesoPeso = cargoExcesoPeso;
    }

    public static class Builder{
        private String nombre;              //Required
        private double diferenciaPrecio;    //Optional
        private String region;              //Required
        private double envioDocumento;      //Required
        private double envioCaja;           //Required
        private double cargoExcesoPeso;     //Optional

        public Builder(String nombre, String region, double envioDocumento, double envioCaja) {
            this.nombre = nombre;
            this.region = region;
            this.envioDocumento = envioDocumento;
            this.envioCaja = envioCaja;
        }

        public Builder withDiferenciaPrecio(double diferenciaPrecio){
            this.diferenciaPrecio = diferenciaPrecio;
            return this;
        }

        public Builder withCargoExcesoPeso(double cargoExcesoPeso){
            this.cargoExcesoPeso = cargoExcesoPeso;
            return this;
        }

        public Proveedor build(){
            return new Proveedor(this);
        }
    }
}
