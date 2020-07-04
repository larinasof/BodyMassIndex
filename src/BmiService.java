public class BmiService {
    public float calculate (int weightInKilos, float heightInMetres) {
        float bodyMassIndex = weightInKilos / (heightInMetres * heightInMetres);
        return bodyMassIndex;
    }
}
