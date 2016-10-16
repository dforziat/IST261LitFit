/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist261litfit;
import java.util.*;
/**
 *
 * @author drf5180
 */
public class FoodLog {
    private ArrayList<Food> foodLog;
    
    public FoodLog(){
        foodLog = new ArrayList<Food>();
        System.out.println("log was created");
    }

    /**
     * @return the foodLog
     */
    public ArrayList<Food> getFoodLog() {
        return foodLog;
    }

    /**
     * @param foodLog the foodLog to set
     */
    public void setFoodLog(ArrayList<Food> foodLog) {
        this.foodLog = foodLog;
    }
    
    public void addFood(Food food){
        foodLog.add(food);
        System.out.println("Food was added to the list");
    }
    
}
