package Oop_class_and_object_1;

public class Trainer {

    private String emri;
    private String mbiemri;
    private String vendbanimi;
    private String ekipi;
    private int id;
    private int mosha;
    private double pesha;
    private double gjatesia;

    public Trainer(){}

    public Trainer(int id, String emri, String mbiemri, String vendbanimi, String ekipi, int mosha, double pesha, double gjatesia){
        this.id = id;
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.vendbanimi = vendbanimi;
        this.ekipi = ekipi;
        this.mosha = mosha;
        this.pesha = pesha;
        this.gjatesia = gjatesia;
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
    public String getEkipi(){
        return ekipi;
    }
    public void setEkipi(String ekipi){
        this.ekipi = ekipi;
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
    public double getPesha(){
        return pesha;
    }
    public void setPesha(double pesha){
        this.pesha = pesha;
    }
    public double getGjatesia(){
        return gjatesia;
    }
    public void setGjatesia(double gjatesia){
        this.gjatesia = gjatesia;
    }




}
