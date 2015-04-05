
package clases;

public class Datos {
    
    private int maxUsu = 50;
    private Usuario misUsuarios[] = new Usuario[maxUsu];
    private int contUsu = 0;
    
    public Datos(){
        Usuario miUsuario = new Usuario("zulu","Juan Carlos","Zuluaga Cardona", "123", 1);
        misUsuarios[contUsu] = miUsuario;
        contUsu ++;
    }
    
    public Usuario[] getUsuario(){
        return misUsuarios;
    }
            
    public boolean validarUsuario(String usuario, String clave){
             boolean aux = false;
             for(int i=0;i<contUsu;i++){
                 if(misUsuarios[i].getIdUsuario().equals(usuario) && misUsuarios[i].getClave().equals(clave)){
                 return true;
                 }
             }
             return false;
    }
    
    public boolean existeUsuario(String usuario){
             boolean aux = false;
             for(int i=0;i<contUsu;i++){
                 if(misUsuarios[i].getIdUsuario().equals(usuario)){
                 return true;
                 }
             }
             return false;
    }
    
    public int posicionUsuario(String usuario){
             for(int i=0;i<contUsu;i++){
                 if(misUsuarios[i].getIdUsuario().equals(usuario)){
                 return i;
                 }
             }
             return -1;
    }
    
    public String agregarUsuario(Usuario miUsuario){
        if(contUsu == maxUsu){
            return "Se ha alcanzado el número máximo de usuarios";
        }
        
        misUsuarios[contUsu] = miUsuario;
        contUsu ++;
        return "Usuario agregado correctamente";
    }
}
