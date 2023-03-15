public class StringiDemo {
    public static void main(String[] args) {
        String name = "Kalasanty";

        int dlugosc;
        dlugosc = name.length();

        char inicjal = name.charAt(3);

        String duze, male;

        male = name.toLowerCase();
        duze = name.toUpperCase();

        System.out.println( duze+" " +name);
    }
}
