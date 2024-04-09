package Builders;

import java.util.List;

public class WeightGainNutritionPlanBuilder extends NutritionPlanBuilder{
    public WeightGainNutritionPlanBuilder() {
        setFitnessGoal("WEIGHT_GAIN");
        setCaloric(2500);
        setMacronutrientRatios(50, 25, 25);
        setMealPlans(List.of("Breakfast: Whole eggs", "Lunch: Chicken breast", "Dinner: Steak"));
        setDietaryRestrictions(List.of("LACTOSE_FREE"));
    }
}
