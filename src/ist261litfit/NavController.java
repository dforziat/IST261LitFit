/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist261litfit;
import java.util.*;
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
    private FoodLogList logList; // list of foodLogs
    private FoodLog searchLog; // log that was found in search
 
    
    public NavController(ProfileController proCont){
        this.profileController = proCont;
        this.view = new NavUI(this);
        this.view.setVisible(true);
        foodLogNumber = 1;
        foodLog = new FoodLog(foodLogNumber, "First Log");
        this.foodLog.setFoodLogID(foodLogNumber);
        this.view.addFoodLog("First Log", foodLogNumber);
        this.logList = new FoodLogList();
        this.logList.addLogToList(foodLog);
    }
    
    public void createFood(String foodName, int calories){
       Food foodObj = new Food(foodName, calories, this);
       this.foodLog.addFood(foodObj);
    }
    
    public void createNewLog(String Name){
        this.foodLog.getFoodLogName();
        this.view.addFoodLog(Name, foodLogNumber);
        this.foodLogNumber += 1;
        this.foodLog = new FoodLog(foodLogNumber, Name);
        this.logList.addLogToList(foodLog);
    }
    
    public void switchLogView(){
        this.view.setVisible(false);
        this.logUI = new LogListUI(this);
        this.logUI.setVisible(true);
        String tempTitle = this.view.getLogTitle();
        this.logUI.changeLogName(tempTitle);
        
        searchFoodLog(this.foodLog.getFoodLogID());
        System.out.println(searchLog.getFoodLogID());
        // add food to table in the log view
    }
    
    public void switchMainView(){
        this.logUI.setVisible(false);
        this.view.setVisible(true);
    }
  
    public void searchFoodLog(int id){
       // need a list of food logs, search logs by name and id number.  
      ArrayList<FoodLog> tempLogList = this.logList.getLogList();
      if(tempLogList.contains(foodLog)){
          for(int i = 0; i < tempLogList.size(); ++i){
              if(foodLog.getFoodLogID() == id){
                  this.searchLog = foodLog;
              }       
          }
      }
    } 
}
