package com.collections;

import java.util.List;
//Función index_of que retorne el índice de la primera ocurrencia de un String dentro de una lista de Strings. En caso de no encontrarse ninguna retorna el valor -1.

public class Lists {

    public int indexOf(String palabra, List<String> Lists) {
        for (int i = 0; i < Lists.size(); i++) {
            if (Lists.get(i).equals(palabra)) {
                return i;
            }
        }
        return -1;
    }


    //Función index_of_by_index que retorne el índice de la primera ocurrencia de un String dentro de una lista de Strings, a partir de un índice dado, incluido en la búsqueda. En caso de no encontrarse ninguna coincidencia retorna el valor -1.

    public int indexOfByindex(String palabra, List<String> lista, int posicion) {
        for (int i = posicion; i < lista.size(); i++) {
            if (lista.get(i).equals(palabra)) {
                return i;
            }
        }
        return -1;
    }

    //Función index_of_empty que retorne el índice del primer lugar “vacío” (igual a "") en una lista de Strings. De no encontrar ninguno que retorne -1.

    public int indexOfEmpty(List<String> Lists) {
        for (int i = 0; i < Lists.size(); i++) {
            if (Lists.get(i).equals("")) {
                return i;
            }
        }
        return -1;
    }

    //Función put, que dado un String y una lista de Strings lo coloque en el primer lugar vacío (igual a "") que encuentre y retorne el índice en donde lo colocó. De no haber ningún lugar vacío debe retornar -1.

    public int put(String remplazo, List<String> Lists) {
        for (int i = 0; i < Lists.size(); i++) {
            if (Lists.get(i).equals("")) {
                Lists.set(i,remplazo);
                return i;
            }
        }
        return -1;
    }
//Función remove que dado un String y una lista de Strings, busque el string, lo elimine si lo encuentra (lo cambia a "") y retorne el número de eliminaciones que ha hecho.

    public int remove(String elemento, List<String> Lists) {
        int eleminations= 0;
        for (int i = Lists.size() - 1; i >= 0; i--) {
            if (Lists.get(i).equals(elemento)) {
                Lists.remove(i);
                eleminations++;
            }
        }
        return eleminations;
    }

}
