package GeoWhithResearch;

import java.util.Objects;

public class Person {
    public String fullName;

    public int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
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
