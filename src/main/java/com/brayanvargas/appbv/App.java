package com.brayanvargas.appbv;

import com.brayanvargas.domainbv.*;

import java.util.List;

public class App {
   public static void main(String[] args) {
      Biblioteca biblioteca = new Biblioteca();

      Cuento cuento = new Cuento();
      Libro libro = new Libro();
      Revista revista = new Revista();
      Tesis tesis = new Tesis();
      Diccionario diccionario = new Diccionario();

      biblioteca.addRecursoVargas(cuento);
      biblioteca.addRecursoVargas(libro);
      biblioteca.addRecursoVargas(revista);

      biblioteca.listaPrestadosVargas();

   }
}
