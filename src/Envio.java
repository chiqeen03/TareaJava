import java.util.ArrayList;

public class Envio {

    private String id;                  //Required
    private String dirRemitente;        //Required
    private String dirEntrega;          //Required
    private String cpRemitente;         //Required
    private String cdEntrega;           //Required
    private double peso;                //Required
    private Proveedor proveedor;        //Required
    private ArrayList<String> etiquetas;         //Required

    public Envio(Builder builder) {
        this.id = builder.id;
        this.dirRemitente = builder.dirRemitente;
        this.dirEntrega = builder.dirEntrega;
        this.cpRemitente = builder.cpRemitente;
        this.cdEntrega = builder.cdEntrega;
        this.peso = builder.peso;
        this.proveedor = builder.proveedor;
        this.etiquetas = builder.etiquetas;
    }

    public boolean nuevaEtiqueta(String etiqueta){
        if(etiquetas.contains(etiqueta)){
            return false;
        }
        etiquetas.add(etiqueta);
        return true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDirRemitente() {
        return dirRemitente;
    }

    public void setDirRemitente(String dirRemitente) {
        this.dirRemitente = dirRemitente;
    }

    public String getDirEntrega() {
        return dirEntrega;
    }

    public void setDirEntrega(String dirEntrega) {
        this.dirEntrega = dirEntrega;
    }

    public String getCpRemitente() {
        return cpRemitente;
    }

    public void setCpRemitente(String cpRemitente) {
        this.cpRemitente = cpRemitente;
    }

    public String getCdEntrega() {
        return cdEntrega;
    }

    public void setCdEntrega(String cdEntrega) {
        this.cdEntrega = cdEntrega;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public ArrayList<String> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(ArrayList<String> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public static class Builder{

        private String id;
        private String dirRemitente;
        private String dirEntrega;
        private String cpRemitente;
        private String cdEntrega;
        private double peso;
        private Proveedor proveedor;
        private ArrayList<String> etiquetas;

        public Builder(String id){
            this.id = id;
            this.dirRemitente = "";
            this.dirEntrega = "";
            this.cpRemitente = "";
            this.cdEntrega = "";
            this.peso = 0;
            this.proveedor = null;
            this.etiquetas = null;
        }

        public Builder(String id, String dirRemitente, String dirEntrega, String cpRemitente, String cdEntrega, double peso, Proveedor proveedor, ArrayList<String> etiquetas) {
            this.id = id;
            this.dirRemitente = dirRemitente;
            this.dirEntrega = dirEntrega;
            this.cpRemitente = cpRemitente;
            this.cdEntrega = cdEntrega;
            this.peso = peso;
            this.proveedor = proveedor;
            this.etiquetas = etiquetas;
        }

        public Envio build(){
            return new Envio(this);
        }
    }
}
