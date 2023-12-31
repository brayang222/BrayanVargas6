package com.brayanvargas.domainbv;

public class Cuento extends Recurso implements Prestable {


   public Cuento(boolean prestadoBrayan, String nombreBrayan) {
      super(prestadoBrayan, nombreBrayan);
   }

   @Override
   public void prestar() {
         if (!isPrestadoBrayan()) {
            this.setPrestadoBrayan(true);
            System.out.println("se presto el cuento " + getNombreBrayan());
         }
   }

   @Override
   public void devolver() {
         if (isPrestadoBrayan()) {
            this.setPrestadoBrayan(false);
            System.out.println("se devolvio el cuento " + getNombreBrayan());
         }
   }

   @Override
   public String toString() {
      return "Cuento";
   }
}