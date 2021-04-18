package Part1.oop;

import lombok.Data;

import java.time.LocalDate;

@Data
abstract public class Employee {

    public static final String DEFAULT_NAME = "WHATEVER";
    public static int nextId;

    private String name;
    private int id;
    private LocalDate hiringDate;

    public Employee(String name) {
        this.name = name;
        id = nextId++;
        hiringDate = LocalDate.now();
    }

    public Employee() {
        this(DEFAULT_NAME);
    }

    public abstract double getPay();

}
