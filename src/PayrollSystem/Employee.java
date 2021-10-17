package PayrollSystem;

public class Employee{
    private int id;
    private String name;
    private String surname;


    public Employee(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double pay() {
        return 0.0d;
    }

    @Override
    public String toString() {
        return String.format("Puntori me ID-ne: %d %n Emri plote: %s %s %n Rroga: %.2f EUR"
                , id, name, surname, pay());
    }
}
