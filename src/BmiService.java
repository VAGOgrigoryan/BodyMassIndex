public class BmiService {
    public double calculate (double height, double weight){
        double BodyMassIndex = weight/(height*height);

        return BodyMassIndex;
    }
}
