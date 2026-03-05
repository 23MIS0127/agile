import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testGradeA() {
        assertEquals('A', App.calculateGrade(95, 92, 90));
    }

    @Test
    public void testGradeB() {
        assertEquals('B', App.calculateGrade(80, 78, 76));
    }

    @Test
    public void testGradeC() {
        assertEquals('C', App.calculateGrade(65, 62, 60));
    }

    @Test
    public void testGradeF() {
        assertEquals('F', App.calculateGrade(30, 40, 45));
    }
}
