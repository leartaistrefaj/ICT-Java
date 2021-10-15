package Inheritance_part1;

public class Ostrich extends WalkingBird{
    public Ostrich(String color, String movement, String food) {
        super(color, movement, food);
        System.out.println("I am a ostrich!");
        this.food="insect";
    }

}
