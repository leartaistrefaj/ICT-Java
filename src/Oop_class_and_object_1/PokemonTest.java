package Oop_class_and_object_1;

public class PokemonTest {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon();
        p1.setNgjyra("E Bardhe");
        p1.setGjatesia(1.8);
        p1.setGjeresia(0.50);

        Pokemon p2 = new Pokemon();
        p2.setNgjyra("E Kaltert");
        p2.setGjatesia(1.5);
        p2.setGjeresia(0.55);

        Pokemon p3 = new Pokemon();
        p3.setNgjyra("E zeze");
        p3.setGjatesia(1.4);
        p3.setGjeresia(0.58);

        System.out.println("Pokemoni nje ka ngjyren " + p1.getNgjyra() );

    }
}
