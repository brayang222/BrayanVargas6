package com.brayanvargas.domainbv;

public class Cuento extends Recurso implements Prestable {

   @Override
   public void prestar() {
      if (isPrestadoBrayan()){
         this.setPrestadoBrayan(true);
         System.out.println("se presto el cuento");
      }
   }

   @Override
   public void devolver() {
      if (!isPrestadoBrayan()){
         this.setPrestadoBrayan(false);
         System.out.println("se devolvio el cuento");
      }
   }

   @Override
   public String toString() {
      return "Cuento";
   }
}
