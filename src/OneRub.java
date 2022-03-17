public class OneRub {
    public int calculate(int replenishmentAmount, int initialData) {
        int total;
        if
        (replenishmentAmount >= 1000) {
            total = (int) ((replenishmentAmount * 0.01) + replenishmentAmount + initialData);
        } else {
            total = (replenishmentAmount + initialData);
        }
        return total;
    }

}
