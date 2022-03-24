import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CohortTest {
    Cohort elixir;
    @Before
    public void inti() {
        elixir = new Cohort();
        Student ray = new Student(1, "Ray");
        elixir.addStudent(ray);
        ray.addGrade(85);
        ray.addGrade(90);
        Student wes = new Student(2, "Wesley");
        elixir.addStudent(wes);
        wes.addGrade(88);
        wes.addGrade(97);
    }
    @Test
    public void testStudentAdd() {
        assertEquals(2, elixir.getStudents().size());
    }

    @Test
    public void testGetCurrentList() {
        assertNotNull(elixir.getStudents());
    }

    @Test
    public void testGetAverage() {
        assertEquals(90.0,elixir.getCohortAverage(),2);
    }
}
