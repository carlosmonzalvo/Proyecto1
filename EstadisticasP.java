class EstadisticasP
{
   CasaP person = new CasaP();
   PersonaP per = new PersonaP();
   public int CalculaEstadisticas()
   {
      int opcion;
      do
        {
            opcion=Teclado.LeeEntero("1)Ingresos promedio por familia.\n 2)Promedio de nivel de estudios.\n3)Idioma mas hablado.\n4)Promedio de persona más vieja por familia.\n5)Promedio de persona más joven por familia.\n6)Porcentaje de personas que trabajan.\n7)Porcentaje de personas que estudian.\n8)Promedio de edad.\n9)Promedio de personas por delegación.\n10)Porcentaje de hombres.\n11)Porcentaje de mujeres.\n12)Porcentaje de personas que tienen casa propia.\n14)Porcentaje de personas que rentar su vivienda.\n15)Salir.\n");
            if (opcion>15 || opcion<1)
                System.out.println("Error, opncion no valida");
            switch(opcion)
            {
               case 1: System.out.println(PromIngresos());
                  break;
               case 2: System.out.println(PromNivelEst());
                  break;
               case 3: System.out.println(NumerootroIdioma());
                  break;
               case 4: System.out.println(PerVieja());
                  break;
               case 5: System.out.println(PerJoven());
                  break;
               case 6: //System.out.println(PromEstudia());
                  break;
               case 7: //System.out.println(PromTrabaja());
                  break;
               case 8: System.out.println(PromEdad());
                  break;
               case 9: //System.out.println(PerColonia());
                  break;
               case 10: System.out.println(PerDelegacion());
                  break;
               case 11: System.out.println(PerMujer());
                  break;
               case 12: System.out.println(PerHombre());
                  break;
               case 13: //System.out.println(PerPropia());
                  break;
               case 14: //System.out.println(PerRenta());
                  break;
            }
        }while(opcion>15 || opcion<1);
        return opcion;
    }
    public double PromIngresos()
    {
      int i;
      double prom=0;
      System.out.println(person.indice);
      for(i=0;i<person.indice;i++)
      {
         
         prom=prom+(per.ingresos);
      }
      return(prom=prom/i);
    }
    public void PromNivelEst()
    {
      int i ;
      double prom=0;
      for(i=0;i<person.indice;i++)
      {
        prom=prom+(per.estudios[i]);
      }
      return(prom=prom/i+1);
    }
    public int NumerootroIdioma()
    {
      int countX=0;
      for(int=0;i<=indice;i++){
        if (per.LeeIdioma().equals("x")){
          countX++;
      }
    }
    return countX;
    }
    
    /*public float PerVieja()
    {
      int i,prom=0,cont=0;
      for(i=0;i<person.indice;i++)
      {
         prom=prom+(per.edad[per.edad.length-1]);
      }
      return(prom=prom/i);
    }*/
    public float PerVieja()
    {
      int i,prom=0,cont=0;
      for(i=0;i<=person.indice;i++)
      {
         prom=prom+(person.casas[i].edad[per.edad.length-1]);
      }
      prom=prom/i-1;
      return prom;
    }
    public float PerJoven()
    {
      int i,prom=0,cont=0;
      for(i=0;i<person.indice;i++)
      {
         prom=prom+(per.edad[0]);
      }
      return(prom=prom/i);
    }
    public void PorcEstudia()
    {
    }
    public void PorcTrabaja()
    {
    }
    public void PromEdad()
    {
      int i ;
      double prom=0;
      for(i=0;i<person.indice;i++)
      {
        prom=prom+per.edad[i];
      }
      return(prom=prom/i+1);
    }
    public void PerColonia()
    {
    }
    public int PerDelegacion()
    {
      int countD=0;
      for(i=0;i<person.indice;i++){
        if(dir.LeeDelegacion()){
          countD++;
      }
      return countD;
    }
    public int PerMujer()
    {
      int countM=0;
      for(int i=0;i<person.indice;i++){
         if(per.LeeGenero.equals(fem)){
            countM++;
         }
      }
      return countM;
   }
   
    public int PerHombre()
    {
       int countH=0;
      for(int i=0;i<person.indice;i++){
         if(per.LeeGenero.equals(masc)){
            countH++;
         }
      }
      return countH;
    }
    public void PerPropia(){
    
      
    }
    public void PerRenta()
    {
    }
}
