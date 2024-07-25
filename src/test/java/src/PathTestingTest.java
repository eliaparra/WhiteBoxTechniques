package src;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PathTestingTest {
    /*
    * Para el método determineResult, los caminos independientes son:

Camino 1: a = true, x > 0 → "A1"
Camino 2: a = true, x <= 0 → "A2"
Camino 3: a = false, b = true, x > 5 → "B1"
Camino 4: a = false, b = true, x <= 5 → "B2"
Camino 5: a = false, b = false → "C"
    * */

    PathTesting ejemplo = new PathTesting();
    @Test
    public void path1 (){
        //Camino 1: a = true, x > 0 → "A1"
        Assertions.assertEquals("A1", ejemplo.determineResult(true, true,1));
    }
    @Test
    public void path2 (){
        //Camino 2: a = true, x <= 0 → "A2"
        Assertions.assertEquals("A2", ejemplo.determineResult(true, true,0));
    }
    @Test
    public void path3 (){
        //Camino 3: a = false, b = true, x > 5 → "B1"
        Assertions.assertEquals("B1", ejemplo.determineResult(false, true,6));
    }
    @Test
    public void path4 (){
        //Camino 4: a = false, b = true, x <= 5 → "B2"
        Assertions.assertEquals("B2", ejemplo.determineResult(false, true,4));
    }
    @Test
    public void path5 (){
        //Camino 5: a = false, b = false → "C"
        Assertions.assertEquals("C", ejemplo.determineResult(false, false,4));
    }

}
