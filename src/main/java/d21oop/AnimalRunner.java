package d21oop;

public class AnimalRunner {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.feedWithMilk(); //Mammals feed their babies with milk,,,,
        d.drink(); //Animals drink....
        d.eat(); //Dogs eat....

        Bird b = new Bird();
        b.eat(); //Animals eat....
        b.tweet(); //Birds tweet...

        Cat c = new Cat();
        c.feedWithMilk();//Cats feed their babies with milk,,,,
    }
}
