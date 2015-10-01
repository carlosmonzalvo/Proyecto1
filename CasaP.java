
class CasaP
{
   private DireccionP dir;
   int indice, sueldo;
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
   sueldo=Teclado.LeeEntero("Cual es el ingreso total de la casa: ");
   }
}
