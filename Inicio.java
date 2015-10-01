class Inicio {
 
   public static void main(String []args)   {
      int opcion;
      Menu menu=new Menu();
      Estadisticas e;
      do {
         opcion=menu.Menu("1)Iniciar censo.\ln2)Consultar estadisticas.\ln3)Salir.\ln",3);
         switch(opcion) {
            case 1:System.out.println("Iniciando...");
                   Teclado.LeeEntero("¿Cuantas casas van a ser en total? ");
                  break;
            case 2:e.CalculaEstadisticas()
                  break;
                  }
      } while(opcion!=3);
}
}
