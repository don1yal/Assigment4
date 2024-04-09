package Director;

import Builders.NutritionPlanBuilder;
import Plan.NutritionPlan;

public interface Director {
    void setBuilder(NutritionPlanBuilder nutritionPlanBuilder);
    NutritionPlan createNutritionPLan();
}
