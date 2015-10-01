class Estadisticas
{
   public int listaMenu()
   {
      int opcion;
      do
        {
            opcion=Teclado.LeeEntero("1)Ingresos promedio por familia.\ln 2)Promedio de nivel de estudios.\ln3)Porcentaje de personas que hablan más de un idioma.\ln4)Promedio de persona más vieja por familia.\ln5)Promedio de persona más joven por familia.\ln6)Porcentaje de personas que trabajan.\ln7)Porcentaje de personas que estudian.\ln8)Promedio de edad.\ln9)Promedio de personas por colonia.\ln10)Promedio de personas por delegación.\ln11)Porcentaje de hombres.\ln12)Porcentaje de mujeres.\ln13)Porcentaje de personas que tienen casa propia.\ln14)Porcentaje de personas que rentar su vivienda.\ln15)Salir.\ln");
            if (opcion>15 || opcion<1)
                System.out.println("Error, opcion no valida");
            switch(opcion)
            {
               case 1:
            }
        }while(opcion>15 || opcion<1);
        return opcion;
    }
    public PromIngresos() //Promedio de ingresos de los hogares
    {
    }
    public PromNivelEst() // Saber el indice de analfabetismo
    {
    }
    public PorcenIdioma() // Posiblilidad de salir al extranjero
    {
    }
    public PerVieja() // Indice de edad maxima por hogar
    {
    }
    public PerJoven() // Indice de edad minima por hogar
    {
    }
    public PorcEstudia() // Saber porcentaje de perosonas que Estudian
    {
    }
    public PorcTrabaja() // Saber porcentaje de personas que Trabajan
    {
    }
    public PromEdad() // %pais, saber si es una pais joven o viejo
    {
    }
    public PerColonia() // Saber el porcentaje por colonia
    {
    }
    public PerDelegacion() // Saber porcentaje por delegacion
    {
    }
    public PorcMujer() // Saber porcentaje de Hombres y mujeres
    {
    }
    public PorcHombre() // Saber porcentaje de Hombres y mujeres
    {
    }
    public PorcPropia() // Saber porcentaje de personas que tienen cassa propia o rentan
    {
    }
    public PorcRenta() // Saber porcentaje de personas que tienen cassa propia o rentan
    {
    }
}
