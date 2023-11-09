package com.brayanvargas.domainbv;

public class Libro extends Recurso implements Prestable {
   @Override
   public void prestar() {
      if (isPrestadoBrayan()){
         System.out.println("se presto el libro");
      }
   }

   @Override
   public void devolver() {
      if (!isPrestadoBrayan()){
         System.out.println("se devolvio el libro");
      }
   }

   @Override
   public String toString() {
      return "Libro";
   }
}
