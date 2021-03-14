package com.company.singleton;

public class Singleton {
    private static Singleton instance;
    public String value;

    /*
    *The constructor below is just an example of work that takes a long time
    * */
    private Singleton(String value){
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.getMessage();
        }
        this.value = value;
    }

    /*
    * Method below creates instance of singleton if it does not exist, and returns existing one otherwise
    * */
    public static Singleton getInstance(String value){
        if(instance == null){
            instance = new Singleton(value);
        }
        return instance;
    }
}
