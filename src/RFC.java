public class RFC {
    private String id;              //required
    private String dirFiscal;       //optional
    private String razonFiscal;     //optional

    private RFC(Builder builder){
        this.id = builder.id;
        this.dirFiscal = builder.dirFiscal;
        this.razonFiscal = builder.dirFiscal;
    }

    public String getRFC(){
        return id;
    }

    public void setRFC(String id){
        this.id = id;
    }

    public String getDirFiscal() {
        return dirFiscal;
    }

    public void setDirFiscal(String dirFiscal) {
        this.dirFiscal = dirFiscal;
    }

    public String getRazonFiscal() {
        return razonFiscal;
    }

    public void setRazonFiscal(String razonFiscal) {
        this.razonFiscal = razonFiscal;
    }

    public static class Builder{
        private final String id;
        private String dirFiscal;
        private String razonFiscal;

        public Builder(String id){
            this.id = id;
        }

        public Builder withDirFiscal(String dirFiscal){
            this.dirFiscal = dirFiscal;
            return this;
        }

        public Builder withRazonFiscal(String razonFiscal){
            this.razonFiscal = razonFiscal;
            return this;
        }

        public RFC build(){
            return new RFC(this);
        }
    }
}
