
package clases;

public class Datos {
    
    private int maxUsu = 50;
    private int maxPro = 100;
    private Usuario misUsuarios[] = new Usuario[maxUsu];
    private Producto misProductos[] = new Producto[maxPro];
    private int contUsu = 0;
    private int contPro = 0;
    
    public Datos(){
        Usuario miUsuario;
        
        miUsuario = new Usuario("zulu","Juan Carlos","Zuluaga Cardona", "123", 1);
        misUsuarios[contUsu] = miUsuario;
        contUsu ++;
        
        miUsuario = new Usuario("hernan","Hernan ","Ramirez ", "123", 2);
        misUsuarios[contUsu] = miUsuario;
        contUsu ++;
        
        miUsuario = new Usuario("pedro","Dario"," Salas", "123", 2);
        misUsuarios[contUsu] = miUsuario;
        contUsu ++;
        
        Producto miProducto;
        
        miProducto = new Producto("1", "Coca Cola x 350 ML", 1500, 1, "");
        misProductos[contPro] = miProducto;
        contPro ++;
        
        miProducto = new Producto("2", "Manzana Postobon", 1600, 2, "Tómela bien fría");
        misProductos[contPro] = miProducto;
        contPro ++;
        
        miProducto = new Producto("3", "Uva Postobon", 1300, 3, "");
        misProductos[contPro] = miProducto;
        contPro ++;
    }
    
    public int numeroUsuarios(){
        return contUsu;
    }
    
    public int numeroProductos(){
        return contPro;
    }
    
    public Usuario[] getUsuario(){
        return misUsuarios;
    }
    
    public Producto[] getProductos(){
        return misProductos;
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
    
    public int posicionProducto(String producto){
             for(int i=0;i<contPro;i++){
                 if(misProductos[i].getIdProducto().equals(producto)){
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
    
    public String agregarProducto(Producto miProducto){
        if(contPro == maxPro){
            return "Se ha alcanzado el número máximo de productos";
        }
        
        misProductos[contPro] = miProducto;
        contPro ++;
        return "Producto agregado correctamente";
    }
    
    public String modificarUsuario(Usuario miUsuario, int pos){
        misUsuarios[pos].setNombres(miUsuario.getNombres());
        misUsuarios[pos].setApellidos(miUsuario.getApellidos());
        misUsuarios[pos].setClave(miUsuario.getClave());
        misUsuarios[pos].setPerfil(miUsuario.getPerfil());
        return "Usuario modificado correctamente";
    }
    
    public String modificarProducto(Producto miProducto, int pos){
        misProductos[pos].setDescripcion(miProducto.getDescripcion());
        misProductos[pos].setPrecio(miProducto.getPrecio());
        misProductos[pos].setIva(miProducto.getIva());
        misProductos[pos].setNota(miProducto.getNota());
        return "Producto modificado correctamente";
    }
    
    public String borrarUsuario(int pos){
        for(int i= pos; i<contUsu-1; i++){
            misUsuarios[i] = misUsuarios[i+1];
        }
        contUsu--;
        return "Usuario borrado correctamente";
    }
    
    public String borrarProducto(int pos){
        for(int i= pos; i<contPro-1; i++){
            misProductos[i] = misProductos[i+1];
        }
        contPro--;
        return "Producto borrado correctamente";
    }
}
