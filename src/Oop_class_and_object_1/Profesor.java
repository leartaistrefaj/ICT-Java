package Oop_class_and_object_1;

public class Profesor {

    private String emri;
    private String mbiemri;
    private String vendbanimi;
    private int id;
    private int mosha;
    private String fakulteti;
    private String departamenti;
    private int nrLendeve;

    public Profesor(){}

    public Profesor(String emri, String mbiemri, String vendbanimi, int id, int mosha, String fakulteti,
                    String departamenti, int nrLendeve){
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.vendbanimi = vendbanimi;
        this.id = id;
        this.mosha = mosha;
        this.fakulteti = fakulteti;
        this.departamenti = departamenti;
        this.nrLendeve = nrLendeve;
    }
    public String getEmri(){
        return emri;
    }
    public void setEmri(String emri){
        this.emri = emri;
    }
    public String getMbiemri(){
        return mbiemri;
    }
    public void setMbiemri(String mbiemri){
        this.mbiemri = mbiemri;
    }
    public String getVendbanimi(){
        return vendbanimi;
    }
    public void setVendbanimi(String vendbanimi){
        this.vendbanimi = vendbanimi;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getMosha(){
        return mosha;
    }
    public void setMosha(int mosha){
        this.mosha = mosha;
    }
    public String getFakulteti(){
        return fakulteti;
    }
    public void setFakulteti(String fakulteti){
        this.fakulteti = fakulteti;
    }
    public String getDepartamenti(){
        return departamenti;
    }
    public void setDepartamenti(String departamenti){
        this.departamenti = departamenti;
    }
    public int getNrLendeve(){
        return nrLendeve;
    }
    public void setNrLendeve(int nrLendeve){
        this.nrLendeve = nrLendeve;
    }


}
