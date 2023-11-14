package com.brayanvargas.domainbv;

public class Libro extends Recurso implements Prestable {

   public Libro(boolean prestadoBrayan, String nombreBrayan) {
      super(prestadoBrayan, nombreBrayan);
   }

   @Override
   public void prestar() {
      if (isPrestadoBrayan()) {
         this.setPrestadoBrayan(true);
         System.out.println("se presto el libro");
         if (!isPrestadoBrayan()) {
            System.out.println("se presto el libro " + getNombreBrayan());
         }
      }


   }

   @Override
   public void devolver () {
      if (!isPrestadoBrayan()) {
         this.setPrestadoBrayan(false);
         System.out.println("se devolvio el libro");
         if (isPrestadoBrayan()) {
            System.out.println("se devolvio el libro " + getNombreBrayan());
         }
      }
   }

}
