package com.brayanvargas.domainbv;

public class Revista extends Recurso implements Prestable{

   public Revista(boolean prestadoBrayan, String nombreBrayan) {
      super(prestadoBrayan, nombreBrayan);
   }

   @Override
   public void prestar() {
      if (!isPrestadoBrayan()){
         System.out.println("se presto la revista " + getNombreBrayan());
      }
   }

   @Override
   public void devolver() {
      if (isPrestadoBrayan()){
         System.out.println("se devolvio la revista " + getNombreBrayan());
      }
   }

   @Override
   public String toString() {
      return "Revista";
   }
}
