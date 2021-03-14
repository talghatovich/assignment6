//runner
package com.company.Builder.house;

import java.util.Scanner;

public class BuildHouseRunner {
    public static void main(String[] args) {
        //declaring some instances
        Scanner scanner = new Scanner(System.in);
        Director director = new Director();
        //application part that asks for type of house
        System.out.println("Which house you want to build?");
        System.out.println("1. Vremyanka");
        System.out.println("2. One Stage House");
        System.out.println("3. Kottedj");
        System.out.println("Choose option(1-3): ");
        int choose = scanner.nextInt();

        //defining type of house and creating it
        switch (choose){
            case 1 -> {
                director.setBuilder(new VremyankaHouseBuilder());
                House house = director.buildHouse();
                System.out.println(house);
                break;
            }
            case 2 ->{
                director.setBuilder(new OneStageHouseBuilder());
                House house = director.buildHouse();
                System.out.println(house);
                break;
            }
            case 3 ->{
                director.setBuilder(new KottedjHouseBuilder());
                House house = director.buildHouse();
                System.out.println(house);
                break;
            }
            default -> {//if input is not correct
                throw new RuntimeException(choose +" is unknown option");
            }
        }




    }
}
