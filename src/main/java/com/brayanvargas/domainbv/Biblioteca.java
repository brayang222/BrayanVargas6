package com.brayanvargas.domainbv;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

   private List<Recurso> recursosBrayan;

   public Biblioteca() {
      this.recursosBrayan = new ArrayList<>();
   }

   public void addRecursoVargas(Recurso recurso){
      System.out.println("Se añadió el recurso " + recurso);
      recursosBrayan.add(recurso);
   }

   public boolean prestarRecursoVargas(Prestable prestable){
      if (prestable instanceof Recurso){
         prestable.prestar();
         return true;
      }
      return false;
   }

   public boolean devolverRecursoVargas(Prestable prestable){
      if (prestable instanceof Recurso){
         prestable.devolver();
         return false;
      }
      return false;
   }

   public void listaPrestadosVargas(){
      System.out.println("La lisa de prestados es ");
      for (Recurso recursoAndres : recursosBrayan) {
         if (recursoAndres.isPrestadoBrayan()) {
            System.out.println(recursoAndres);
         }
      }
      System.out.println("La lisa de prestados es " );
   }

   public List<Recurso> getRecursosBrayan() {
      return recursosBrayan;
   }

   public void setRecursosBrayan(List<Recurso> recursosBrayan) {
      this.recursosBrayan = recursosBrayan;
   }
}
