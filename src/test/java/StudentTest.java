import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
public class StudentTest {

    @Test
   public void noGrades(){
        Student wes = new Student("Wesley", 123);
        assertTrue(wes.getGrades().isEmpty());
    }
    @Test
    public void getIdTest(){
        Student wes = new Student("Wesley", 123);
        assertEquals(123, wes.getId());
    }
    @Test
    public void getNameTest(){
        Student wes = new Student("Wesley", 123);
        assertTrue(wes.getName().equalsIgnoreCase("Wesley"));
    }
    @Test
    public void addGradeTest(){
        Student wes = new Student("Wesley", 123);
        wes.addGrade(98);
        assertFalse(wes.getGrades().isEmpty());
    }
    @Test
    public void getGradesTest(){
        Student wes = new Student("Wesley", 123);
        wes.addGrade(17);
        wes.addGrade(97);
        ArrayList<Integer> test = new ArrayList<>();
        test.add(17);
        test.add(97);
        assertEquals(test, wes.getGrades());
    }
    @Test
    public void getAverageTest(){
        Student wes = new Student("Wesley", 123);
        wes.addGrade(17);
        wes.addGrade(97);
        assertEquals(57, wes.getGradeAverage(), 0);
    }
}
