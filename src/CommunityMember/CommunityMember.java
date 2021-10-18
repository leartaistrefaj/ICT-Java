package CommunityMember;

public class CommunityMember {
    private int id;
    private String emri;
    private String adressa;



    public CommunityMember(int id,String emri, String adressa) {
        this.id = id;
        this.emri = emri;
        this.adressa = adressa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }


    public String getAdressa() {
        return adressa;
    }

    public void setAdressa(String adressa) {
        this.adressa = adressa;
    }

    @Override
    public String toString() {
        return String.format("ID: %s %n Emri: %s %n Adressa: %s",getId(),
                getEmri(),getAdressa());
    }
}
