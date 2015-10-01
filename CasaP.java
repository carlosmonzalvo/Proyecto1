class CasaP {
   private DireccionP dir;
   PersonaP []casas;
   int indice,noper,contperso=0;
   public void CasasCap(int per)   {
      casas= new PersonaP[per];
      casas[indice]=new PersonaP();
      System.out.println("Hola");
      for(indice=0;indice<per;indice++)      {  
         noper=Teclado.LeeEntero("¿Cuántas personas hay en el hogar ["+(indice+1)+"]?");
         
         casas[indice].PersonaP(noper);
         dir.CapturaDireccion();
         contperso=contperso+noper;
         
      }
   }
}
