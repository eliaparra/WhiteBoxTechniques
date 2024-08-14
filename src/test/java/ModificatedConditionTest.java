import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ModificatedConditionTest {

    //Test first IF
    @Test
    void first() {
        ModificatedCondition mCondition = new ModificatedCondition();
        Assertions.assertEquals(0.20,mCondition.calculateDiscount(true, false, true, 50));
    }

    @Test
    void second() {
        ModificatedCondition mCondition = new ModificatedCondition();
        Assertions.assertEquals(0.00,mCondition.calculateDiscount(false, false, false, 150));
    }

    @Test
    void third() {
        ModificatedCondition mCondition = new ModificatedCondition();
        Assertions.assertEquals(0.10,mCondition.calculateDiscount(false, true, false, 50));
    }

    // Test Else if (is member $$ hasCoupon)
    @Test
    void forth() {
        ModificatedCondition mCondition = new ModificatedCondition();
        Assertions.assertEquals(0.15,mCondition.calculateDiscount(true, true, false, 50));
    }

    @Test
    void fifth() {
        ModificatedCondition mCondition = new ModificatedCondition();
        Assertions.assertEquals(0.2,mCondition.calculateDiscount(true, true, true, 50));
    }

    //Test else if(ismember OR hasCoupon
    @Test
    void sexto() {
        ModificatedCondition mCondition = new ModificatedCondition();
        Assertions.assertEquals(0.10,mCondition.calculateDiscount(true, false, false, 50));
    }

    @Test
    void septimo() {
        ModificatedCondition mCondition = new ModificatedCondition();
        Assertions.assertEquals(0.2,mCondition.calculateDiscount(true, true, true, 120));
    }

    @Test
    void octavo() {
        ModificatedCondition mCondition = new ModificatedCondition();
        Assertions.assertEquals(0.20,mCondition.calculateDiscount(true, false, true, 120));
    }

    @Test
    void A() {
        ModificatedCondition mCondition = new ModificatedCondition();
        Assertions.assertEquals(0.20,mCondition.calculateDiscount(true, false, false, 120));
    }
//Test isHoliday

    @Test
    void noveno() {
        ModificatedCondition mCondition = new ModificatedCondition();
        Assertions.assertEquals(0.05, mCondition.calculateDiscount(false, false, true, 50));
    }

    @Test
    void decimo() {
        ModificatedCondition mCondition = new ModificatedCondition();
        Assertions.assertEquals(0.00,mCondition.calculateDiscount(false, false, false, 50));
    }

    @Test
    void undecimo() {
        ModificatedCondition mCondition = new ModificatedCondition();
        Assertions.assertEquals(0.00, mCondition.calculateDiscount(false, false, false, 150));
    }
}
