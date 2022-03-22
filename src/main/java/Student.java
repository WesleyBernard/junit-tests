import java.beans.Transient;
import java.util.ArrayList;

public class Student {
private long id;
private String name;
private ArrayList<Integer> grades;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public Student(String name, long id){
    this.id = id;
    this.name = name;
    this.grades = new ArrayList<Integer>();
}
public void addGrade(int grade){
        this.grades.add(grade);
}
public double getGradeAverage(){
        double average = 0;
    for (int i = 0; i < this.grades.size(); i++) {
        average += this.grades.get(i);
    }
    return average/this.grades.size();
}
}
