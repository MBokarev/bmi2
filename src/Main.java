public class Main {
    public static void main(String[] args) {
        BimService s = new BimService();
        double height = 1.72;
        int weight = 74;
        double result = s.calculate(height, weight);
        System.out.println("Индекс массы тела = " + result + " кг/м²");
    }
}