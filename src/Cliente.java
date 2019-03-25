import java.util.ArrayList;

public class Cliente {
    private String id;
    private ArrayList<Envio> envios;
    private RFC rfc;

    private Cliente(Builder builder){
        this.id = builder.id;
        this.rfc = builder.rfc;
        envios = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Envio> getEnvios() {
        return envios;
    }

    public void setEnvios(ArrayList<Envio> envios) {
        this.envios = envios;
    }

    public RFC getRfc() {
        return rfc;
    }

    public void setRfc(RFC rfc) {
        this.rfc = rfc;
    }

    public boolean nuevoEnvio(Envio envio){
        if(envios.contains(envio)){
            return false;
        }
        envios.add(envio);
        return true;
    }

    public Envio getEnvio (String id){
        Envio aux = new Envio.Builder(id).build();
        Envio placeHolder;

        Envio resultado = null;

        boolean booleanAux = true;
        int i = 0;
        while(booleanAux && i < envios.size()){
            placeHolder = envios.get(i);
            if(placeHolder.getId().equals(aux.getId())) {
                booleanAux = false;
                resultado = placeHolder;
            }
        }

        return resultado;
    }

    public static class Builder{
        private final String id;
        private final RFC rfc;

        public Builder(String id, RFC rfc){
            this.id = id;
            this.rfc = rfc;
        }

        public Cliente build(){
            return new Cliente(this);
        }
    }
}
