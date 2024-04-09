package Builders;

import Plan.NutritionPlan;

import java.util.List;

public interface Builder {
    void setCaloric(int caloric);
    void setMacronutrientRatios(int carbohydrates, int proteins, int fats);
    void setMealPlans(List<String> mealPlans);
    void setFitnessGoal(String fitnessGoal);
    void setDietaryRestrictions(List<String> dietaryRestrictions);
    NutritionPlan build();



}
