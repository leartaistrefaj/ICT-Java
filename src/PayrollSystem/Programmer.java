package PayrollSystem;

public class Programmer extends SalariedEmployee{
    public Programmer(int id, String name, String surname, double salary) {
        super(id, name, surname, salary);
    }

    @Override
    public String toString() {
        return super.toString()+"\nTitulli punes: Programer";
    }
}
