import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        Proveedor[] proveedores = new Proveedor[3];
        {
            proveedores[0] = new Proveedor.Builder("EnvioExpress", "Sonora", 39, 25).withCargoExcesoPeso(500).build();
            proveedores[1] = new Proveedor.Builder("BombaEnvios", "Yucatan", 42, 20).build();
            proveedores[2] = new Proveedor.Builder("PastesGo", "Pachuca", 59, 19).withCargoExcesoPeso(600).build();
        }

        Cliente[] listaDeClientes = new Cliente[2];
        {
            listaDeClientes[0] = new Cliente.Builder("258fght", new RFC.Builder("hifuehsi").build()).build();
            listaDeClientes[1] = new Cliente.Builder("688juij", new RFC.Builder("gyuwdwdv").build()).build();
            listaDeClientes[2] = new Cliente.Builder("745fbee", new RFC.Builder("kokgrbma").build()).build();
        }

        ArrayList<String> etiquetas0 = new ArrayList<>();
        etiquetas0.add("fragil");
        etiquetas0.add("firma contra entrega");
        listaDeClientes[0].nuevoEnvio(new Envio.Builder("458927", "Mexico", "Mexico", "08547", "06598", 500, proveedores[1], etiquetas0).build());
    }
}
