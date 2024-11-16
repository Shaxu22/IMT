public class Main {
    public static void main(String[] args) {

        BmiService data = new BmiService();
        double imt = data.calculate(77, 1.70);
        System.out.println(imt);

    }
}