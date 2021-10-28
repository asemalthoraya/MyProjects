package com.MyProject;

import java.util.Scanner;

public class Project {
    public static void printBreakfast (){
        System.out.println("""
                                                BreakFast   \s
                                Choose your Order from the List:\s
                                1. Beans with bread with tea .
                                2. liver sheep with bread with tea .
                                3. Beans with Eggs with bread with tea .
                                """);
    }
    public static void printLunch (){
        System.out.println("""
                                                Lunch   \s
                                Choose your Order from the List:\s
                                1. Shawarma with soda .
                                2. Kabasaoh with rice .
                                3. Mandy with rice with soup .
                                """);

    }
    public static void printDinner (){
        System.out.println("""
                                                Dinner   \s
                                Choose your Order from the List:\s
                                1. Chicken Burger with soda .
                                2. Borst with Due soda .
                                3. Falafel with lemon juice .
                                """);

    }

    public static void printFastFood (){
        System.out.println("""
                                                Juice and Fast Food   \s
                                Choose your Order from the List:\s
                                1. cheese Sandwich .
                                2. hot Fahita .
                                3. Pizza .
                                """);
    }
    public static void printJuice (){
        System.out.println("""
                                                Juice    \s
                                Choose your Order from the List:\s
                                1. Avocado .
                                2. Mango with milk .
                                3. Max fruits .
                                """);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int meal,breakfast,lunch,dinner,fastFood,juice ;
        double total =0.0;
        float price = 0;
        double discount ;
        boolean exit = true;

        while (exit) {

                System.out.println("""
                        
                        Surprise if you buy over 5000 you'll get a discount 10% 😍 \s
                         
                                        Menu   \s
                        
                        Choose the meal from the List:\s
                        1. Breakfast .
                        2. Lunch .
                        3. Dinner .
                        4. Fast food.
                        5. juice
                        6. Exit.
                        """);
                meal = in.nextInt();
                switch (meal) {
                    case 1 -> {
//                      printBreakfast قائمة الافطار في دالة
                        printBreakfast();
                        breakfast = in.nextInt();
                        if (breakfast == 1) {
                            price = 1000;
                            System.out.println("the total price will be = " + price + " R.Y");
                            total+=price;
                        } else if (breakfast == 2) {
                            price = 3000;
                            System.out.println("the total price will be = " + price + " R.Y");
                            total+=price;
                        } else if (breakfast == 3) {
                            price = 1500;
                            System.out.println("the total price will be = " + price + " R.Y");
                            total+=price;
                        } else
                            System.out.println("Sorry your Order not in our meal .. Please Enter from the list !!");
                    }
                    case 2 -> {
//                      printLunch قائمة الغداء في دالة
                        printLunch();
                        lunch = in.nextInt();
                        if (lunch == 1) {
                            price = 2000;
                            System.out.println("the total price will be = " + price + " R.Y");
                            total+=price;
                        } else if (lunch == 2) {
                            price = 3000;
                            System.out.println("the total price will be = " + price + " R.Y");
                            total+=price;
                        } else if (lunch == 3) {
                            price = 6000;
                            System.out.println("the total price will be = " + price + " R.Y");
                            total+=price;
                        } else
                            System.out.println("Sorry your Order not in our meal .. Please Enter from the list !!");
                    }
                    case 3 -> {
//                     printDinner  قائمة العشاء في دالة
                       printDinner();
                        dinner = in.nextInt();
                        if (dinner == 1) {
                            price = 1500;
                            System.out.println("the total price will be = " + price + " R.Y");
                            total+=price;
                        } else if (dinner == 2) {
                            price = 1300;
                            System.out.println("the total price will be = " + price + " R.Y");
                            total+=price;
                        } else if (dinner == 3) {
                            price = 500;
                            System.out.println("the total price will be = " + price + " R.Y");
                            total+=price;
                        } else
                            System.out.println("Sorry your Order not in our meal .. Please Enter from the list !!");
                    }
                    case 4 -> {
//                      printFastFood قائمة الوجبات السريعة في دالة
                        printFastFood();
                        fastFood = in.nextInt();
                        if (fastFood == 1) {
                            price = 500;
                            System.out.println("the total price will be = " + price + " R.Y");
                            total+=price;
                        } else if (fastFood == 2) {
                            price = 1000;
                            System.out.println("the total price will be = " + price + " R.Y");
                            total+=price;
                        } else if (fastFood == 3) {
                            price = 1200;
                            System.out.println("the total price will be = " + price + " R.Y");
                            total+=price;
                        } else
                            System.out.println("Sorry your Order not in our meal .. Please Enter from the list !!");

                    }
                    case 5 -> {
//                      printJuice قائمة الوجبات السريعة في دالة
                        printJuice();
                        juice = in.nextInt();
                        if (juice == 1) {
                            price = 1000;
                            System.out.println("the total price will be = " + price + " R.Y");
                            total+=price;
                        } else if (juice == 2) {
                            price = 700;
                            System.out.println("the total price will be = " + price + " R.Y");
                            total+=price;
                        } else if (juice == 3) {
                            price = 1200;
                            System.out.println("the total price will be = " + price + " R.Y");
                            total+=price;
                        } else
                            System.out.println("Sorry your Order not in our meal .. Please Enter from the list ");

                    }
                    case 6 -> {
//                        قائمة الخروج
                        System.out.println("The total will be : " + total);
                        if (total >= 5000){
                           discount = total * 0.10;
                            System.out.println("Your discount is : " + discount +"\n" +
                                               "Your total price with discount is : " + (total - discount));
                            exit = false;
                        }

                            System.out.println("Come visit us again ❤😍");
                            exit = false;

                    }
                    default -> System.out.println("Pleas enter from the list  !!");
                }
        }

    }
}
