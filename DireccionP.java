class DireccionP{
private int delegacion;

public int CapturaDireccion(int dir){
LeeDelegacion(dir);
}
public void LeeDelegacion(){
delegacion=Teclado.LeeEntero("En que delegacion viven: \n1.-Coyoacan\n2.-Gustavo A. Madero\n3.-Iztapalapa\n4.-Álvaro Obregón\n5.-Tlalpan\n6.-Otra\n");
}
public void Listar(){
System.out.println(delegacion);
}
}
