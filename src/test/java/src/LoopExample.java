package src;

public class LoopExample {
    /**
     * Calcula la suma de los primeros N números naturales.
     *
     * @param N El número hasta el cual se deben sumar los números naturales.
     * @return La suma de los primeros N números naturales.
     */

    /*
    * El Loop Testing (pruebas de bucle) es una técnica de prueba de caja blanca que se centra en la
    *  validación de la funcionalidad de los bucles dentro del código. Los bucles son componentes críticos del software,
    *  ya que pueden introducir errores como bucles infinitos, condiciones de terminación incorrectas y problemas
    * de rendimiento. Las pruebas de bucle se aseguran de que los bucles funcionen correctamente bajo diferentes
    * condiciones.

------------Tipos de Pruebas de Bucle-----------------
* Zero Iterations: El bucle no se ejecuta.
* One Iteration: El bucle se ejecuta una sola vez.
* Multiple Iterations: El bucle se ejecuta un número finito de veces.
* Boundary Testing: Se prueba en los límites de las condiciones del bucle.
* N Iterations: El bucle se ejecuta N veces, donde N es un número específico de iteraciones.
* Complex Loops: Bucle con condiciones internas y múltiples puntos de salida
    *
    * */
    public int sumNaturalNumbers(int N) {
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        return sum;
    }

}
