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
 
    
    public NavController(ProfileController proCont){
        this.profileController = proCont;
        this.view = new NavUI(this);
        this.view.setVisible(true);
        foodLog = new FoodLog();
    }
    
    public void createFood(String foodName, int calories){
       Food foodObj = new Food(foodName, calories, this);
       this.foodLog.addFood(foodObj);
    }
    
    public void createNewLog(){
        this.foodLog = new FoodLog();
    }
}
