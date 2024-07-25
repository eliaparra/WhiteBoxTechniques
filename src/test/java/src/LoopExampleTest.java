package src;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoopExampleTest {

    LoopExample loop = new LoopExample();

    @Test
    public void ZeroIterations(){
        Assertions.assertEquals(0, loop.sumNaturalNumbers(0));
    }
    @Test
    public void OneIterations(){
        Assertions.assertEquals(1, loop.sumNaturalNumbers(1));
    }
    @Test
    public void MultipleIterations(){
        Assertions.assertEquals(15, loop.sumNaturalNumbers(5));
    }

}
