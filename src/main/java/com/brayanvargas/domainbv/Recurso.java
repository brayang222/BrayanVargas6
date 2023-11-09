package com.brayanvargas.domainbv;

public abstract class Recurso {
   private boolean prestadoBrayan;
   private String nombreBrayan;

   public boolean isPrestadoBrayan() {
      return prestadoBrayan;
   }

   public String getNombreBrayan() {
      return nombreBrayan;
   }

   public void setPrestadoBrayan(boolean prestadoBrayan) {
      this.prestadoBrayan = prestadoBrayan;
   }
}
