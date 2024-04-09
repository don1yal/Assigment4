package Builders;

import Builders.Builder;
import Components.DietaryRestrictions;
import Components.FitnessGoal;
import Components.Macronutrient;
import Plan.NutritionPlan;

import java.util.List;
import java.util.stream.Collectors;

public class NutritionPlanBuilder implements Builder {
    private int caloric;
    private Macronutrient macronutrient;
    private List<String> mealPlan;
    private FitnessGoal fitnessGoal;
    private List<DietaryRestrictions> dietaryRestrictions;

    @Override
    public void setCaloric(int caloric) {
        this.caloric = caloric;
    }

    @Override
    public void setMacronutrientRatios(int carbohydrates, int proteins, int fats) {
         this.macronutrient = new Macronutrient(carbohydrates, proteins, fats);
    }

    @Override
    public void setMealPlans(List<String> mealPlan) {
        this.mealPlan = mealPlan;
    }

    @Override
    public void setFitnessGoal(String fitnessGoal) {
        this.fitnessGoal = FitnessGoal.valueOf(fitnessGoal);
    }

    @Override
    public void setDietaryRestrictions(List<String> dietaryRestrictions) {
        this.dietaryRestrictions = dietaryRestrictions.stream()
                .map(DietaryRestrictions::valueOf)
                .collect(Collectors.toList());
    }

    @Override
    public NutritionPlan build() {
        return new NutritionPlan(caloric, macronutrient, mealPlan, fitnessGoal,dietaryRestrictions);
    }
}
