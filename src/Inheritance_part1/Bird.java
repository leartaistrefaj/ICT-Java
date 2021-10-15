package Inheritance_part1;

public class Bird extends Object {
    private String color;
    private String movement;
    protected String food;

    public Bird(String color, String movement, String food) {
        super();
        this.color = color;
        this.movement = movement;
        this.food = food;
        System.out.println("I am a Bird!");
    }



    public String getColor() {
        return color;
    }


    public String getMovement() {
        return movement;
    }


    public String getFood() {
        return food;
    }



    @Override
    public String toString() {
        return String.format("Bird with color %s, with movement %s, eats %s"
                ,color,movement,food);
    }


}
