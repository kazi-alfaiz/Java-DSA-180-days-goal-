package CollectionFrameWorkChapter.Collcetion2Part.Set;

import java.util.Objects;

public class Student {
    public int rull;
    public String name;

    public Student(int rull, String name) {
        this.rull = rull;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rull=" + rull +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rull == student.rull;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rull);
    }
}















