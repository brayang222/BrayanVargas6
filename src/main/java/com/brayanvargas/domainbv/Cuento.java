package com.brayanvargas.domainbv;

public class Cuento extends Recurso implements Prestable {

   @Override
   public void prestar() {
      if (isPrestadoBrayan()){

      }
   }

   @Override
   public void devolver() {

   }

   @Override
   public String toString() {
      return "Cuento";
   }
}
