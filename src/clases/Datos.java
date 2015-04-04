
package clases;

public class Datos {
    public boolean validarUsuario(String usuario, String clave){
        if(usuario.equalsIgnoreCase("zulu") && clave.equalsIgnoreCase("123")){
            return true;
        }
        else{
            return false;
        }        
    }
}
