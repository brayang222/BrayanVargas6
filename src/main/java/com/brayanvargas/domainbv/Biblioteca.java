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
      return true;
   }

   public boolean devolverRecursoVargas(Prestable prestable){
      return false;
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
