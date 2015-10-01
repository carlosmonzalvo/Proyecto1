class PersonaP
{
   private int edad, genero,estudios,ocupacion, idioma, ingresos, casa;
   private String colonia, delegacion;
   
   //Método Contructor
   public void PersonaP(int ed, int gen, int std, int ocp, int idiom, int ingr, int cas, String col, String del){
      edad = ed;
      genero = gen;
      ocupacion = ocp;
      estudios = std;
      idioma = idiom;
      ingresos = ingr;
      casa = cas;
      colonia = col;
      delegacion = del;
   }
 
 //Métodos modificadores .. SETTERS INVESTIGUEN EN INTERNET DIOS MIO!
 public void setEdad(ed){
    edad = ed;
 }
 public void setIdioma(idiom){
    idioma = idiom
 }
 public void setGenero(gen){
    genero = gen;
 }
 public void setOcupacion(ocp){
    ocupacion = ocp;
 }
  public void setEstudios(std){
    estudios = std;
 }
 public void setIngresos(ingr){
    ingresos = ingr;
 }
 public void setCasa(cas){
    casa = cas;
 }
 public void setColonia(col){
    colonia = col;
 }
 public void setDelegacion(del){
    delegacion = del;
 }
  
 /*
 string getData(){
 return [1,2,3,4,5,6,7,8]
 }
 (STRING, [INT])
 carlos.getData.0
 
 printf (carlos.getData()[5]);
 int(String)
 
 Tuplas en Java
 Casting Int- String
 Casting String -Int
 
 */ 
   
}
