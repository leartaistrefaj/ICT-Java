package Oop_class_and_object_1;

public class Car {

    private String brendi;
    private String tipi;
    private int vitiProdhimit;
    private String ngjyra;

    public Car(){}

    public Car(String brendi, String tipi, int vitiProdhimit, String ngjyra){
        this.brendi = brendi;
        this.tipi = tipi;
        this.vitiProdhimit = vitiProdhimit;
        this.ngjyra = ngjyra;
    }
    public String getBrendi(){
        return brendi;
    }
    public void setBrendi(String brendi){
        this.brendi = brendi;
    }
    public String getTipi(){
        return tipi;
    }
    public void setTipi(String tipi){
        this.tipi = tipi;
    }
    public int getVitiProdhimit(){
        return vitiProdhimit;
    }
    public void setVitiProdhimit(int vitiProdhimit){
        this.vitiProdhimit = vitiProdhimit;
    }
    public String getNgjyra(){
        return ngjyra;
    }
    public void setNgjyra(String ngjyra){
        this.ngjyra = ngjyra;
    }



}
