public class Main {
    public static void main(String[] args) {

        bmiService service = new bmiService();
        double bodyMassIndex = service.calculate(1.77, 65);
        System.out.printf("Индекс массы тела %.2f", bodyMassIndex);
    }
}