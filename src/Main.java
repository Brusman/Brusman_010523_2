public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMetr = 1.87;
        int weightKg = 98;
        int index = service.calculate(heightMetr, weightKg);
        System.out.println("Индекс массы Вашего тела составляет: " + index);
    }
}