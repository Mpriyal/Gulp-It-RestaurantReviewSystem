package com.jpa;

import java.sql.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.dao.DrinksDao;
import com.jpa.dao.FoodDao;
//import com.jpa.dao.FoodDao;
import com.jpa.dao.MenuDao;
import com.jpa.dao.RestaurantDao;
import com.jpa.dao.RestaurantOwnerDao;
import com.jpa.models.Drinks;
import com.jpa.models.Food;
import com.jpa.models.Menu;
import com.jpa.models.Restaurant;
import com.jpa.models.RestaurantOwner;

@SpringBootApplication
public class Cs5200GulpItApplication {

	public static void main(String[] args) {
		SpringApplication.run(Cs5200GulpItApplication.class, args);
//		Restaurant rest = new Restaurant("Chutneys","Indian food ","xyz",20,1);
//		Restaurant rest = new Restaurant("Qudoba","mexican food ","abc",20,1);
//		RestaurantDao restDao = RestaurantDao.getInstance();
//		restDao.addRestaurantForOwner(rest, 2);
//		System.out.println(restDao.findAllRestaurantByName("Chut"));
//		Menu menu = new Menu("Paneer Makhani",20,"cheese");
//		MenuDao menuDao = MenuDao.getInstance();
//		System.out.println(menuDao.addMenuForRestaurant(menu, 1));
//		Food food = new Food(true , "rajma" ,2, "tasty");
//		DrinksDao fooddao = DrinksDao.getInstance();
//		fooddao.addFoodForRestaurant(food, 1);
//				boolean vegetarian, int menu ,String name, Float price, String description)
//		fooddao.deleteFoodForRestaurant(1);
//		Boolean liquor, String name ,int price, String description
//		Drinks drinks = new Drinks(true,"Mojito",23,"Sasti sharab");
//	fooddao.addDrinksForRestaurant(drinks, 1);
//	System.out.println(fooddao.findDrinksByNameForRestaurant("Mojito", 1));
//		System.out.println(fooddao.findFoodByNameForRestaurant("rajma", 1));
		
//		String firstName, String lastName, String username, String password, String email, Date dob, String ownerKey
		
//		
//		RestaurantOwner rachna = new RestaurantOwner(455,"Rachna","Tondare","rachna","tondare","r@gml",null,"asd");
//		
//		RestaurantOwnerDao dao = RestaurantOwnerDao.getInstance();
////		dao.createRestaurantOwner(rachna);
//		System.out.println(rachna.getId());
//		System.out.println(dao.findRestaurantOwnerById(455));
	}
}
