
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GraderTest {

    @Test
    public void menorQueCero(){
        Grader grader = new Grader();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    grader.determineLetterGrade(-2);
                });

    }
    @Test
    public void limiteF(){
        Grader grader = new Grader();
        assertEquals(grader.determineLetterGrade(59), 'F');
        
    }
    @Test
    public void limiteSuperiorD(){
        Grader grader = new Grader();
        assertEquals(grader.determineLetterGrade(69), 'D');
    }
    @Test
    public void limiteinferiorD(){
        Grader grader = new Grader();
        assertEquals(grader.determineLetterGrade(60), 'D');
    }
    @Test
    public void limiteSuperiorC(){
        Grader grader = new Grader();
        assertEquals(grader.determineLetterGrade(79), 'C');
    }
    @Test
    public void limiteInferiorC(){
        Grader grader = new Grader();
        assertEquals(grader.determineLetterGrade(70), 'C');
    }
    @Test
    public void limiteSuperiorB(){
        Grader grader = new Grader();
        assertEquals(grader.determineLetterGrade(89), 'B');
    }
    @Test
    public void limiteInferiorB(){
        Grader grader = new Grader();
        assertEquals(grader.determineLetterGrade(80), 'B');
    }
    @Test
    public void limiteSuperiorA(){
        Grader grader = new Grader();
        assertEquals(grader.determineLetterGrade(99), 'A');
    }
    @Test
    public void limiteInferiorA(){
        Grader grader = new Grader();
        assertEquals(grader.determineLetterGrade(99), 'A');
    }
}