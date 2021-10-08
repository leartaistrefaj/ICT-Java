package Oop_class_and_object_1;

public class Student {

    private String emri;
    private String mbiemri;
    private String vendbanimi;
    private int id;
    private int mosha;
    private String fakulteti;
    private String drejtimi;
    private int vitiAkademik;
    private double notaMesatare;

    public Student(){}

    public Student(String emri, String mbiemri, String vendbanimi, int id, int mosha, String fakulteti, String drejtimi,
                   int vitiAkademik, double notaMesatare){
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.id = id;
        this.mosha = mosha;
        this.fakulteti = fakulteti;
        this.drejtimi = drejtimi;
        this.vitiAkademik = vitiAkademik;
        this.notaMesatare = notaMesatare;
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
    public String getDrejtimi(){
        return drejtimi;
    }
    public void setDrejtimi(String drejtimi){
        this.drejtimi= drejtimi;
    }
    public int getVitiAkademik(){
        return vitiAkademik;
    }
    public void setVitiAkademik(int vitiAkademik){
        this.vitiAkademik = vitiAkademik;
    }
    public double getNotaMesatare(){
        return notaMesatare;
    }
    public void setNotaMesatare(double notaMesatare){
        this.notaMesatare = notaMesatare;
    }

}
