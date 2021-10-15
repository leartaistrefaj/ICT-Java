package Inheritance_part1;

public class WalkingBird extends Bird {

    public WalkingBird(String color, String movement, String food) {
        super(color, movement, food);
        System.out.println(super.getMovement());
        System.out.println(getMovement());
        System.out.println("I am a walking bird specifically!");
    }

    @Override
    public String toString() {
        return "Walking " + super.toString();
    }
}
