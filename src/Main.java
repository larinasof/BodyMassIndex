public class Main {
    public static void main (String [] args){
        BmiService service = new BmiService();
        int weightInKilos = 50;
        float heightInMetres = 1.52F;
        float bodyMassIndex = service.calculate(weightInKilos,heightInMetres);
        System.out.printf("Результат: %.2f\n", bodyMassIndex);
    }
}
