public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double yourWeightKg = 60;
        double yourHightM = 1.65;
        double yourBMI = service.calculate(yourWeightKg, yourHightM);
        System.out.printf("%.2f", yourBMI);
    }
}