public class Main {
    public static void main(String[] args) {
        MollardDuck duck = new MollardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("Turkey says: ");
        turkey.gobble();
        turkey.fly();
        System.out.println("Duck says: ");
        testDuck(duck);

        System.out.println("TurkeyAdapter Says: ");
        testDuck(turkeyAdapter);
    }
    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}