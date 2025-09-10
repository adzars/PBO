package tugascar;

import interfaces.ivehicle;

public class car implements ivehicle {
	String color;
    String noPlate;
    int width;
    int height;
    String brand;
    
    public car(String color, String noPlate, int width, int height, String brand) {
        this.color = color;
        this.noPlate = noPlate;
        this.width = width;
        this.height = height;
        this.brand = brand;
    }
    
    public void startEngine() {
        System.out.println("Mesin mobil dinyalakan...");
    }
    
    public void throttle() {
        System.out.println("mobil berakselerasi...");
    }
    
    public void brake() {
        System.out.println("Mobil mengerem...");
    }
    
    public void turnOnHeadLamp() {
        System.out.println("Lampu depan dinyalakan...");
    }
    
    public void turnOffHeadLamp() {
        System.out.println("Lampu depan dimatikan...");
    }
	
    public void showInfo() {
        System.out.println("Merk     : " + brand);
        System.out.println("Warna    : " + color);
        System.out.println("Plat No  : " + noPlate);
        System.out.println("Lebar    : " + width + " cm");
        System.out.println("Tinggi   : " + height + " cm");

    }
}
