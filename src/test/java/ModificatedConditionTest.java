import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ModificatedConditionTest {

    //Test first IF
    @Test
    public void first(){
        ModificatedCondition mCondition = new ModificatedCondition();
        Assertions.assertEquals(mCondition.calculateDiscount(true, false, true,50),0.20);
    }
    @Test
    public void second(){
        ModificatedCondition mCondition = new ModificatedCondition();
        Assertions.assertEquals(mCondition.calculateDiscount(false, false, false,150),0.00);
    }
    @Test
    public void third(){
        ModificatedCondition mCondition = new ModificatedCondition();
        Assertions.assertEquals(mCondition.calculateDiscount(false, true, false,50),0.10);
    }
    // Test Else if (is member $$ hasCoupon)
    @Test
    public void forth(){
        ModificatedCondition mCondition = new ModificatedCondition();
        Assertions.assertEquals(mCondition.calculateDiscount(true, true, false,50),0.15);
    }
    @Test
    public void fifth(){
        ModificatedCondition mCondition = new ModificatedCondition();
        Assertions.assertEquals(mCondition.calculateDiscount(true, true, true,50),0.2);
    }
    //Test else if(ismember OR hasCoupon
    @Test
    public void sexto(){
        ModificatedCondition mCondition = new ModificatedCondition();
        Assertions.assertEquals(mCondition.calculateDiscount(true, false, false,50),0.10);
    }
    @Test
    public void septimo(){
        ModificatedCondition mCondition = new ModificatedCondition();
        Assertions.assertEquals(mCondition.calculateDiscount(true, true, true,120),0.2);
    }
    @Test
    public void octavo(){
        ModificatedCondition mCondition = new ModificatedCondition();
        Assertions.assertEquals(mCondition.calculateDiscount(true, false, true,120),0.20);
    }
    @Test
    public void A(){
        ModificatedCondition mCondition = new ModificatedCondition();
        Assertions.assertEquals(mCondition.calculateDiscount(true, false, false,120),0.20);
    }
//Test isHoliday

    @Test
    public void noveno(){
        ModificatedCondition mCondition = new ModificatedCondition();
        Assertions.assertEquals(mCondition.calculateDiscount(false, false, true,50),0.05);
    }
    @Test
    public void decimo(){
        ModificatedCondition mCondition = new ModificatedCondition();
        Assertions.assertEquals(mCondition.calculateDiscount(false, false, false,50),0.00);
    }
    @Test
    public void undecimo(){
        ModificatedCondition mCondition = new ModificatedCondition();
        Assertions.assertEquals(mCondition.calculateDiscount(false, false, false,150),0.00);
    }
}
