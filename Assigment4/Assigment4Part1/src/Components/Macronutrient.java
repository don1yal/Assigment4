package Components;

public class Macronutrient {
    private int carbohydrates;
    private int proteins;
    private int fats;

    public Macronutrient(int carbohydrates, int proteins, int fats) {
        this.carbohydrates = carbohydrates;
        this.proteins = proteins;
        this.fats = fats;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(int carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public int getProteins() {
        return proteins;
    }

    public void setProteins(int proteins) {
        this.proteins = proteins;
    }

    public int getFats() {
        return fats;
    }

    public void setFats(int fats) {
        this.fats = fats;
    }

    @Override
    public String toString() {
        return "Macronutrient{" +
                "carbohydrates=" + carbohydrates + "g" +
                ", proteins=" + proteins + "g" +
                ", fats=" + fats + "g" +
                '}';
    }
}
