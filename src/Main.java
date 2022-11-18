public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicboxString = new MagicBox<String>(2);
        magicboxString.add("Denis");
        magicboxString.add("Pety");
        magicboxString.pick();
        MagicBox<Integer> magicboxInt = new MagicBox<Integer>(3);
        magicboxInt.add(5);
        magicboxInt.add(8);
        magicboxInt.pick();
    }
}



