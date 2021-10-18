package CommunityMember;

public class Employee extends CommunityMember{


    public Employee(int id, String emri, String adressa) {
        super(id, emri, adressa);
    }

    @Override
    public String toString() {
        return super.toString() ;
    }
}
