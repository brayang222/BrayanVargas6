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
      if (prestable instanceof Libro) {
         Libro libro = (Libro) prestable;
         System.out.println("se presto el libro");
         libro.prestar();
         return true;
      } else if (prestable instanceof Cuento) {
         Cuento cuento = (Cuento) prestable;
         cuento.prestar();
         return true;
      } else if (prestable instanceof Revista) {
         Revista revista = (Revista) prestable;
         revista.prestar();
         return true;
      } else if (prestable instanceof Diccionario) {
         System.out.println("No se puede prestar un diccionario.");
         return false;
      } else if (prestable instanceof Tesis) {
         System.out.println("No se puede prestar una tesis.");
         return false;
      }

      System.out.println("El objeto no es una instancia de ninguna subclase de Recurso");
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
      boolean algunRecursoPrestado = false;

      for (Recurso recurso : recursosBrayan) {
         if (recurso.isPrestadoBrayan()) {
            System.out.println("La lista de prestados es:");
            System.out.println("- " + recurso);
            algunRecursoPrestado = true;
         }
      }

      if (!algunRecursoPrestado) {
         System.out.println("No hay ningún recurso prestado.");
      }
   }

   public List<Recurso> getRecursosBrayan() {
      return recursosBrayan;
   }

   public void setRecursosBrayan(List<Recurso> recursosBrayan) {
      this.recursosBrayan = recursosBrayan;
   }
}
