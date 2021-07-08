package com.sharif.food;

public class FoodModel {
    String foodname;
    String foodDes;
    int foodimg;

    public FoodModel(String foodname, String foodDes, int foodimg) {
        this.foodname = foodname;
        this.foodDes = foodDes;
        this.foodimg = foodimg;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getFoodDes() {
        return foodDes;
    }

    public void setFoodDes(String foodDes) {
        this.foodDes = foodDes;
    }

    public int getFoodimg() {
        return foodimg;
    }

    public void setFoodimg(int foodimg) {
        this.foodimg = foodimg;
    }
}
