import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;
public class StudentTest {
    Student wes = new Student("Wesley", 123);
    @Before
    public void init(){
        wes.addGrade(17);
        wes.addGrade(97);
    }


    @Test
   public void noGrades(){
        assertFalse(wes.getGrades().isEmpty());
    }
    @Test
    public void getIdTest(){
        assertEquals(123, wes.getId());
    }
    @Test
    public void getNameTest(){
        assertTrue(wes.getName().equalsIgnoreCase("Wesley"));
    }
    @Test
    public void addGradeTest(){
        assertFalse(wes.getGrades().isEmpty());
    }
    @Test
    public void getGradesTest(){
        ArrayList<Integer> test = new ArrayList<>();
        test.add(17);
        test.add(97);
        assertEquals(test, wes.getGrades());
    }
    @Test
    public void getAverageTest(){
        assertEquals(57, wes.getGradeAverage(), 0);
    }
}
