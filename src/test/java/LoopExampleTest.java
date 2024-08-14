import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LoopExampleTest {

    LoopExample loop = new LoopExample();

    @Test
    void ZeroIterations() {
        Assertions.assertEquals(0, loop.sumNaturalNumbers(0));
    }

    @Test
    void OneIterations() {
        Assertions.assertEquals(1, loop.sumNaturalNumbers(1));
    }

    @Test
    void MultipleIterations() {
        Assertions.assertEquals(15, loop.sumNaturalNumbers(5));
    }

}
