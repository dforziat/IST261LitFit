/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist261litfit;

/**
 *
 * @author Dan
 */
public class NavController {
    private NavUI view;
    private ProfileController profileController;
    private FoodLog foodLog;
    private int foodLogNumber; // tracks food log numbers. For FoodLog.java foodLogId
    private LogListUI logUI;
 
    
    public NavController(ProfileController proCont){
        this.profileController = proCont;
        this.view = new NavUI(this);
        this.view.setVisible(true);
        foodLogNumber = 1;
        foodLog = new FoodLog(foodLogNumber, "First Log");
        this.foodLog.setFoodLogID(foodLogNumber);
    }
    
    public void createFood(String foodName, int calories){
       Food foodObj = new Food(foodName, calories, this);
       this.foodLog.addFood(foodObj);
       
       
    }
    
    public void createNewLog(String Name){
        this.foodLog.getFoodLogName();
        this.view.addFoodLog(Name);
        this.foodLogNumber += 1;
        this.foodLog = new FoodLog(foodLogNumber, Name);
    }
    
    public void switchLogView(){
        this.view.setVisible(false);
        this.logUI = new LogListUI();
        this.logUI.setVisible(true);
    }
    
}
