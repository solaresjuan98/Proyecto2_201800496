/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author juan333
 */
public class CaminoMinimo {
    //Determinar todos los caminos

    public String algoritmoFloyd(long[][] matAdy) {

        int vertices = matAdy.length;
        long matrizAdyacencia[][] = matAdy;
        String caminos[][] = new String[vertices][vertices];
        String caminosAuxiliares[][] = new String[vertices][vertices];
        String caminoRecorrido = "", cadena = "", caminos_aux = "";
        int i, j, k;
        float temp1, temp2, temp3, temp4, minimo;

        // Iniciar las matrices caminos y caminos aux
        for (i = 0; i < vertices; i++) {
            for (j = 0; j < vertices; j++) {
                caminos[i][j] = "";
                caminosAuxiliares[i][j] = "";
            }
        }

        for (k = 0; k < vertices; k++) {
            for (i = 0; i < vertices; i++) {
                for (j = 0; j < vertices; j++) {
                    temp1 = matrizAdyacencia[i][j];
                    temp2 = matrizAdyacencia[i][k];
                    temp3 = matrizAdyacencia[k][j];
                    temp4 = temp2 + temp3;

                    // encontrando el minimo
                    minimo = Math.min(temp1, temp4);

                    if (temp1 != temp4) {
                        if (minimo == temp4) {
                            caminoRecorrido = "";
                            caminosAuxiliares[i][j] = k + "";
                            caminos[i][j] = caminoRecursivo(i, k, caminosAuxiliares, caminoRecorrido) + (k + 1);
                        }
                    }

                    matrizAdyacencia[i][j] = (long) minimo;
                }
            }
        }

        // Agregando el camino (minimo) a cadena
        for (i = 0; i < vertices; i++) {
            for (j = 0; j < vertices; j++) {
                cadena = cadena + "[" + matrizAdyacencia[i][j] + "]";

            }

            cadena = cadena + "\n";
        }

        /**
         * Importante
         */
        for (i = 0; i < vertices; i++) {
            for (j = 0; j < vertices; j++) {
                if (matrizAdyacencia[i][j] != 1000000000) {
                    if (i != j) {
                        if (caminos[i][j].equals("")) {
                            caminos_aux += "De (" + (i + 1) + "-->" + (j + 1) + ") irse por... (" + (i + 1) + ", " + (j + 1) + ")\n";

                        } else {
                            // Si tiene mas de un "intermediario"
                            caminos_aux += "De (" + (i + 1) + "-->" + (j + 1) + ") irse por...(" + (i + 1) + ", " + caminos[i][j] + ", " + (j + 1) + ") \n";
                        }
                    }
                }
            }
        }

        return "La matriz de caminos mas cortos entre los vertices es: \n" + cadena
                + "\n los diferentes caminos mas cortos entre vertices son: \n"
                + caminos_aux;
    }

    public String caminoRecursivo(int i, int k, String[][] caminos_aux, String caminoRecorrido) {

        if (caminos_aux[i][k].equals("")) {
            return "";
        } else {
            // Recursivamente
            caminoRecorrido += caminoRecursivo(i, Integer.parseInt(caminos_aux[i][k]), caminos_aux, caminoRecorrido)
                    + (Integer.parseInt(caminos_aux[i][k]) + 1) + ", ";

            return caminoRecorrido;
        }
    }
}
