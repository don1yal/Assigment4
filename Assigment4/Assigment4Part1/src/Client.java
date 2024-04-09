import Builders.MaintenanceNutritionPlanBuilder;
import Builders.WeightGainNutritionPlanBuilder;
import Builders.WeightLossNutritionPlanBuilder;
import Director.NutritionPlanDirector;
import Plan.NutritionPlan;

public class Client {
    public static void main(String[] args) {
        NutritionPlanDirector director = new NutritionPlanDirector();

        WeightLossNutritionPlanBuilder weightLossBuilder = new WeightLossNutritionPlanBuilder();
        director.setBuilder(weightLossBuilder);
        director.createNutritionPLan();
        NutritionPlan weightLossPlan = weightLossBuilder.build();
        System.out.println("Weight Loss Plan: " + weightLossPlan);

        WeightGainNutritionPlanBuilder weightGainBuilder = new WeightGainNutritionPlanBuilder();
        director.setBuilder(weightGainBuilder);
        director.createNutritionPLan();
        NutritionPlan weightGainPlan = weightGainBuilder.build();
        System.out.println("Weight Gain Plan: " + weightGainPlan);

        MaintenanceNutritionPlanBuilder maintenanceBuilder = new MaintenanceNutritionPlanBuilder();
        director.setBuilder(maintenanceBuilder);
        director.createNutritionPLan();
        NutritionPlan maintenancePlan = maintenanceBuilder.build();
        System.out.println("Maintenance Plan: " + maintenancePlan);
    }
}
