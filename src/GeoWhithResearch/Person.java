package GeoWhithResearch;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class Person implements SaveToFile{
    public String fullName;
    public int age;
    private String faileName = "Person.txt";

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return fullName + ' ' +age;
    }

    @Override
    public void saveToFile() throws IOException {
        try (FileWriter writer = new FileWriter(faileName, false)) {
            writer.write(toString());
            writer.flush();
        } catch (IOException ex) {
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(getFullName(), person.getFullName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName(), age);
    }
}


