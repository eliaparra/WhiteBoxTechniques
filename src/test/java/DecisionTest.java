import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class DecisionTest {

    //Tests for IF

    @Test
    public void menorqueCero(){
        Decision decision = new Decision();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    decision.processInput(-2,"a");
                });
    }
    @Test
    public void igualCero(){
        Decision decision = new Decision();
        Assertions.assertEquals(decision.processInput(0,"a"),"Zero - Category A");


    }
    @Test
    public void menorDiez(){
        Decision decision = new Decision();
        Assertions.assertEquals(decision.processInput(9,"a"),"Single digit - Category A");
    }
    @Test
    public void igualDiez(){
        Decision decision = new Decision();
        Assertions.assertEquals(decision.processInput(10,"a"),"Double digits - Category A");
    }
    @Test
    public void menorCien(){
        Decision decision = new Decision();
        Assertions.assertEquals(decision.processInput(99,"a"),"Double digits - Category A");
    }
    @Test
    public void igualCien(){
        Decision decision = new Decision();
        Assertions.assertEquals(decision.processInput(100,"a"),"Large number - Category A");
    }
    @Test
    public void mayorCien(){
        Decision decision = new Decision();
        Assertions.assertEquals(decision.processInput(150,"a"),"Large number - Category A");
    }
    // Test for SWITCH CASE

    @Test
    public void categoryA(){
        Decision decision = new Decision();
        Assertions.assertEquals(decision.processInput(1,"a"),"Single digit - Category A");
    }
    @Test
    public void categoryB(){
        Decision decision = new Decision();
        Assertions.assertEquals(decision.processInput(1,"b"),"Single digit - Category B");
    }
    @Test
    public void categoryC(){
        Decision decision = new Decision();
        Assertions.assertEquals(decision.processInput(1,"c"),"Single digit - Category C");
    }
    @Test
    public void unknownCategory(){
        Decision decision = new Decision();
        Assertions.assertEquals(decision.processInput(1,"d"),"Single digit - Unknown category");
    }
}
