/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist261litfit;

/**
 *
 * @author drf5180
 */
public class Food {
    private String foodName;
    private int foodCalories;
    private NavController controller;
    
    
    public Food(String food, int cal, NavController controller){
        this.foodName = food;
        this.foodCalories = cal;
        this.controller = controller;
        System.out.println(foodName + " " + foodCalories);
    }

    /**
     * @return the foodName
     */
    public String getFoodName() {
        return foodName;
    }

    /**
     * @param foodName the foodName to set
     */
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    /**
     * @return the foodCalories
     */
    public int getFoodCalories() {
        return foodCalories;
    }

    /**
     * @param foodCalories the foodCalories to set
     */
    public void setFoodCalories(int foodCalories) {
        this.foodCalories = foodCalories;
    }
}
