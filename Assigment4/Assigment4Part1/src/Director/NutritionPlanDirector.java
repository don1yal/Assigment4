package Director;

import Builders.NutritionPlanBuilder;
import Plan.NutritionPlan;

import java.util.List;

public class NutritionPlanDirector implements Director {
    private NutritionPlanBuilder nutritionPlanBuilder;

    @Override
    public void setBuilder(NutritionPlanBuilder nutritionPlanBuilder) {
        this.nutritionPlanBuilder = nutritionPlanBuilder;
    }

    @Override
    public NutritionPlan createNutritionPLan() {
        return nutritionPlanBuilder.build();
    }
}
