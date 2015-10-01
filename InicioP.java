class InicioP {
 
   public static void main(String []args)   {
      int opcion,p;
      CasaP cas = new CasaP();
      Menu menu=new Menu();
      //EstadisticasP e=new EstadisticasP();
      do {
         opcion=menu.Menu("1)Iniciar censo.\n2)Consultar estadisticas.\n3)Salir.\n",3);
         switch(opcion) {
            case 1:System.out.println("Iniciando...");
                   p=Teclado.LeeEntero("Dame el numero total de casas para el censo: ");
                   cas.CasasCap(p);
                  break;
            //case 2:e.CalculaEstadisticas();
              //    break;
                  }
      } while(opcion!=3);
}
}
//Para que corra necesitan la clase menu que nos dio la maestra
