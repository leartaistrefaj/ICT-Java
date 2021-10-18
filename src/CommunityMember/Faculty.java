package CommunityMember;

public class Faculty extends Employee{
    private String departamenti;

    public Faculty(int id, String emri,String adressa, String departamenti) {
        super(id, emri, adressa);
        this.departamenti = departamenti;
    }

    public String getDepartamenti() {
        return departamenti;
    }

    public void setDepartamenti(String departamenti) {
        this.departamenti = departamenti;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Departamenti: %s %n",getDepartamenti());
    }
}
