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
   }

   public void prestarRecursoVargas(Prestable prestable){
      System.out.println("Se presto el recurso" + prestable);
   }

   public void devolverRecursoVargas(Prestable prestable){
      System.out.println("Se devolvio el recurso" + prestable);
   }

   public void listaPrestadosVargas(){
      System.out.println("La lisa de prestados es " + recursosBrayan);
   }

   public List<Recurso> getRecursosBrayan() {
      return recursosBrayan;
   }

   public void setRecursosBrayan(List<Recurso> recursosBrayan) {
      this.recursosBrayan = recursosBrayan;
   }
}
