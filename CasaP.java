
/*class CasaP
{
   private DireccionP dir;
   int indice;
   double sueldo;
   PersonaP []casas= new PersonaP[100];
   public void CasasCap()
   {
      for(indice=0;indice<casas.length;indice++)
      {
         casas[indice].CapturaPersona();
         dir.CapturaDireccion();
         LeeSueldo();
      }
   }
   public void LeeSueldo(){
   sueldo=Teclado.LeeDouble("Cual es el ingreso total de la casa: ");
   }
}
*/
class CasaP
{
   private DireccionP dir;
   PersonaP []casas;
   int indice,noper,contperso=0;
   public void CasasCap(int per)
   {
      casas= new PersonaP[per];
      System.out.println("Hola");
      for(indice=0;indice<per;indice++)
      {  
         noper=Teclado.LeeEntero("¿Cuántas personas hay en el hogar?");
         casas[indice].PersonaP(noper);
         contperso=contperso+noper;
      }
   }
}
