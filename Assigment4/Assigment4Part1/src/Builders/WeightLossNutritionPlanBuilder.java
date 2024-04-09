package Builders;

import java.util.List;

public class WeightLossNutritionPlanBuilder extends NutritionPlanBuilder{
    public WeightLossNutritionPlanBuilder() {
        setFitnessGoal("WEIGHT_LOSS");
        setCaloric(1500);
        setMacronutrientRatios(40, 30, 30);
        setMealPlans(List.of("Breakfast: Oatmeal", "Lunch: Salad", "Dinner: Grilled Fish"));
        setDietaryRestrictions(List.of("GLUTEN_FREE"));
    }
}
