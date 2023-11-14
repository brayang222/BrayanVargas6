package com.brayanvargas.domainbv;

public class Revista extends Recurso implements Prestable{

   @Override
   public void prestar() {
      if (isPrestadoBrayan()){
         this.setPrestadoBrayan(true);
         System.out.println("se presto la revista");
      }
   }

   @Override
   public void devolver() {
      if (!isPrestadoBrayan()){
         this.setPrestadoBrayan(false);
         System.out.println("se devolvio la revista");
      }
   }

   @Override
   public String toString() {
      return "Revista";
   }
}
