
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void menorQueCero() {
        Grader grader = new Grader();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    grader.determineLetterGrade(-2);
                });

    }

    @Test
    void limiteF() {
        Grader grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(59));

    }

    @Test
    void limiteSuperiorD() {
        Grader grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(69));
    }

    @Test
    void limiteinferiorD() {
        Grader grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(60));
    }

    @Test
    void limiteSuperiorC() {
        Grader grader = new Grader();
        assertEquals('C', grader.determineLetterGrade(79));
    }

    @Test
    void limiteInferiorC() {
        Grader grader = new Grader();
        assertEquals('C', grader.determineLetterGrade(70));
    }

    @Test
    void limiteSuperiorB() {
        Grader grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(89));
    }

    @Test
    void limiteInferiorB() {
        Grader grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(80));
    }

    @Test
    void limiteSuperiorA() {
        Grader grader = new Grader();
        assertEquals('A', grader.determineLetterGrade(99));
    }

    @Test
    void limiteInferiorNotaA() {
        Grader grader = new Grader();
        assertEquals('A', grader.determineLetterGrade(99));
    }
}