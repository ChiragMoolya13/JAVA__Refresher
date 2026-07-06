public class FinalKeyword {
    public static void main(String[] args) {
        Random r1 = new Random();
        System.err.println(r1.PI);
    }
}

class Random{
    final double PI;

    public Random() {
        this.PI = 3.14;
    }

}
