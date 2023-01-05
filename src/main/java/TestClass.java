public class TestClass {
    public static void main(String[] args) {
        Operation operation1 = new Operation();
        boolean isEven = operation1.isEven(2);
        System.out.println("Czy liczba jest parzysta?: " + isEven);
        boolean isOdd = operation1.isOdd(1);
        System.out.println("Czy liczba jest nieparzysta?: " + isOdd);
        double field = operation1.circleField(1);
        System.out.println("Pole koła o wskazanym promieniu to: " + field);
        int square = operation1.power(4);
        System.out.println("Kwadrat wskazanej liczby to: " + square);
    }
}
