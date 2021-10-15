package Inheritance_part1;

public class BirdTest {
    public static void main(String[] args) {
        Bird bird1 = new Bird("white","walking","insect");
        System.out.println(bird1.toString());

        System.out.println("*********************************");

        WalkingBird walkingBird1 = new WalkingBird("blue","walking","insect");
        System.out.println(walkingBird1.toString());

        System.out.println("*********************************");

        Goose goose  = new Goose("white","walking","corn");
        System.out.println(goose);
        System.out.println(goose.getFood());


        Bird b1 = new Goose("white","walking","corn");
        WalkingBird b2 = new Goose("test","test","test");



        Bird wBird = new WalkingBird("Test","Test","Test");
        System.out.println(wBird.toString());

    }
}
