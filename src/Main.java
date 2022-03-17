public class Main {
    public static void main(String[] args) {
        OneRub service = new OneRub();
        int initialData = 100;
        int replenishmentAmount = 1100;
        int total = service.calculate(replenishmentAmount, initialData);
        System.out.println(total);
    }
}
