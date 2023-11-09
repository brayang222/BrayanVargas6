package com.brayanvargas.domainbv;

public class Tesis extends Recurso{

   public Tesis(boolean prestadoBrayan, String nombreBrayan) {
      super(prestadoBrayan, nombreBrayan);
   }

   @Override
   public String toString() {
      return "Tesis";
   }
}
