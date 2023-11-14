package com.brayanvargas.domainbv;

public abstract class Recurso {
   private boolean prestadoBrayan;
   private String nombreBrayan;

   public Recurso(boolean prestadoBrayan, String nombreBrayan) {
   }

   public boolean isPrestadoBrayan() {
      return prestadoBrayan;
   }

   public String getNombreBrayan() {
      return nombreBrayan;
   }

   public void setPrestadoBrayan(boolean prestadoBrayan) {
      this.prestadoBrayan = prestadoBrayan;
   }

   @Override
   public String toString() {
      return "Recurso{" +
            "prestadoBrayan=" + prestadoBrayan +
            ", nombreBrayan='" + nombreBrayan + '\'' +
            '}';
   }
}
