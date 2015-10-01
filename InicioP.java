class InicioP
{
   static CasaP cas = new CasaP();
   static Estadisticas estadis = new Estadisticas();
   static int p;
   public static int listaMenu()
   {
      int op;
      do 
      {
         op =Teclado.LeeEntero("1)Iniciar censo.\n2)Consultar estadisticas.\n3)Salir.\n");
         if (op>3 || op<1)
            System.out.println("Error, opción no valida.");
      }
      while(op>3);
      return op; 
   }
   public static void main(String []args)
   {
      int opc;
      do 
      {
         opc = listaMenu();
         switch(opc)
         {
            case 1: p=Teclado.LeeEntero("¿Cuántas casas serán?");
                    cas.CasasCap(p);
               break;
            case 2: estadis.listaMenu();
               break;
         }
      }
      while(opc>3);
   }
}
