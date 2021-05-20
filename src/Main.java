public class Main {
    public static void main(String[] args){

        BmiService service = new BmiService();
        double BodyMassIndex = service.calculate(1.77,65);
        System.out.printf("Индекс массы тела %.2f",BodyMassIndex);
    }
}