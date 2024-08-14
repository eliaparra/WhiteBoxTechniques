import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class DecisionTest {

    //Tests for IF

    @Test
    void menorqueCero() {
        Decision decision = new Decision();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    decision.processInput(-2, "a");
                });
    }

    @Test
    void igualCero() {
        Decision decision = new Decision();
        Assertions.assertEquals("Zero - Category A", decision.processInput(0, "a"));


    }

    @Test
    void menorDiez() {
        Decision decision = new Decision();
        Assertions.assertEquals("Single digit - Category A", decision.processInput(9, "a"));
    }

    @Test
    void igualDiez() {
        Decision decision = new Decision();
        Assertions.assertEquals("Double digits - Category A", decision.processInput(10, "a"));
    }

    @Test
    void menorCien() {
        Decision decision = new Decision();
        Assertions.assertEquals("Double digits - Category A", decision.processInput(99, "a"));
    }

    @Test
    void igualCien() {
        Decision decision = new Decision();
        Assertions.assertEquals("Large number - Category A", decision.processInput(100, "a"));
    }

    @Test
    void mayorCien() {
        Decision decision = new Decision();
        Assertions.assertEquals("Large number - Category A", decision.processInput(150, "a"));
    }
    // Test for SWITCH CASE

    @Test
    void categoryA() {
        Decision decision = new Decision();
        Assertions.assertEquals("Single digit - Category A", decision.processInput(1, "a"));
    }

    @Test
    void categoryB() {
        Decision decision = new Decision();
        Assertions.assertEquals("Single digit - Category B", decision.processInput(1, "b"));
    }

    @Test
    void categoryC() {
        Decision decision = new Decision();
        Assertions.assertEquals("Single digit - Category C", decision.processInput(1, "c"));
    }

    @Test
    void unknownCategory() {
        Decision decision = new Decision();
        Assertions.assertEquals("Single digit - Unknown category", decision.processInput(1, "d"));
    }
}
