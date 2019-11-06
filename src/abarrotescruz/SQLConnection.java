package abarrotescruz;
//EN ESTA CLASE SE DEFINEN LOS METODOS PARA CONECTAR Y CONSULTAR A LA BASE DE DATOS
import java.sql.ResultSet;
import javax.swing.JTextField;

public class SQLConnection {
    
    public SQLConnection(){
        
    }
    
    public String setStringQuery(String query){
        return query ;
    }

    public ResultSet getProveedor() {
        ResultSet rs = null;
        return rs;
    }

    void insertaProveedor(String nombre, String producto, String direccion, String telefono) {
    }

    void ActualizaProveedor(String nombre, String producto, String direccion, String telefono) {
    }

    void recibeProducto(String NombreProd, float precio, int cantidad) {
    }

    void buscarProveedor(String NOMBRE_BUSCAR) {
    }

    void pagaServicio(String TipoServicio, float importe) {
    }

    void eliminarProveedor(String valor, String atributo) {
    }
}
