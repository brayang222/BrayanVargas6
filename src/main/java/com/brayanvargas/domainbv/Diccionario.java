package com.brayanvargas.domainbv;

public class Diccionario extends Recurso{

   public Diccionario(boolean prestadoBrayan, String nombreBrayan) {
      super(prestadoBrayan, nombreBrayan);
   }

   @Override
   public String toString() {
      return "Diccionario";
   }
}
