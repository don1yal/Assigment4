package Plan;

import Components.DietaryRestrictions;
import Components.FitnessGoal;
import Components.Macronutrient;

import java.util.List;

public class NutritionPlan {
    private final int caloric;
    private final Macronutrient macronutrient;
    private final List<String> mealPlan;
    private final FitnessGoal fitnessGaol;
    private final List<DietaryRestrictions> dietaryRestrictions;

    public NutritionPlan(int caloric, Macronutrient macronutrient, List<String> mealPlan,
                         FitnessGoal fitnessGaol,List<DietaryRestrictions> dietaryRestrictions) {
     this.caloric = caloric;
     this.macronutrient = macronutrient;
     this.mealPlan = mealPlan;
     this.fitnessGaol = fitnessGaol;
     this.dietaryRestrictions = dietaryRestrictions;
    }

    public int getCaloric() {
        return caloric;
    }

    public Macronutrient getMacronutrient() {
        return macronutrient;
    }

    public List<String> getMealPlan() {
        return mealPlan;
    }

    public FitnessGoal getFitnessGaol() {
        return fitnessGaol;
    }

    public List<DietaryRestrictions> getDietaryRestrictions() {
        return dietaryRestrictions;
    }

    @Override
    public String toString() {
        return "NutritionPlan{" +
                "caloric=" + caloric +
                ", macronutrient=" + macronutrient +
                ", mealPlan=" + mealPlan +
                ", fitnessGaol=" + fitnessGaol +
                ", dietaryRestrictions=" + dietaryRestrictions +
                '}';
    }
}
