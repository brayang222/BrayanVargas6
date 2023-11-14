package com.brayanvargas.appbv;

import com.brayanvargas.domainbv.*;

import java.util.List;

public class App {
   public static void main(String[] args) {
      Biblioteca biblioteca = new Biblioteca();

      Cuento cuento = new Cuento(false, "El principito");
      Libro libro = new Libro(false, "Teoría del todo");
      Revista revista = new Revista(false, "Avon");
      Tesis tesis = new Tesis(false, "Tesis astronómica");
      Diccionario diccionario = new Diccionario(false, "Wikipedia");

      biblioteca.addRecursoVargas(cuento);
      biblioteca.addRecursoVargas(libro);
      biblioteca.addRecursoVargas(revista);

      biblioteca.listaPrestadosVargas();

   }
}
