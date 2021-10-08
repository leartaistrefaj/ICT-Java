package Oop_class_and_object_1;

public class Pokemon {

    private String ngjyra;
    private double gjatesia;
    private double gjeresia;

    public Pokemon(){}

    public Pokemon(String ngjyra, double gjatesia, double gjeresia){
        this.ngjyra = ngjyra;
        this.gjatesia = gjatesia;
        this.gjeresia = gjeresia;
    }
    public String getNgjyra(){
        return ngjyra;
    }
    public void setNgjyra(String ngjyra){
        this.ngjyra = ngjyra;
    }
    public double getGjatesia(){
        return gjatesia;
    }
    public void setGjatesia(double gjatesia){
        this.gjatesia = gjatesia;
    }
    public double getGjeresia(){
        return gjeresia;
    }
    public void setGjeresia(double gjeresia){
        this.gjeresia = gjeresia;
    }

}

