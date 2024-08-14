public class PathTesting {
    /**
     * Método que determina el resultado basado en varios parámetros.
     *
     * @param a Primer parámetro booleano.
     * @param b Segundo parámetro booleano.
     * @param x Valor entero.
     * @return Resultado en forma de cadena.
     */
    public String determineResult(boolean a, boolean b, int x) {
        String result = "";

        if (a) {
            if (x > 0) {
                result = "A1";
            } else {
                result = "A2";
            }
        } else {
            if (b) {
                if (x > 5) {
                    result = "B1";
                } else {
                    result = "B2";
                }
            } else {
                result = "C";
            }
        }

        return result;
    }
}

