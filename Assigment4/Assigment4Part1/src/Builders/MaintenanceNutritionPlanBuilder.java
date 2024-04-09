package Builders;

import java.util.List;

public class MaintenanceNutritionPlanBuilder extends NutritionPlanBuilder{
    public MaintenanceNutritionPlanBuilder() {
        setFitnessGoal("MAINTENANCE");
        setCaloric(2000);
        setMacronutrientRatios(40, 40, 20);
        setMealPlans(List.of("Breakfast: Greek yogurt", "Lunch: Turkey wrap", "Dinner: Salmon"));
        setDietaryRestrictions(List.of("VEGAN"));
    }
}
