package test;

import domain.Sloth;

public class TestAnimal {

    public static void main(String[] args) {
        Sloth sloth = new Sloth("Sid");
        System.out.println(sloth);
        sloth.climb();
        sloth.hang();
        sloth.eat();
        sloth.speak();
        sloth.sleep();
    }
}
