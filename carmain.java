package tugascar;

public class carmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car myCar = new car("Hitam", "AD 2 KI", 180, 140, "Lexus");
		myCar.showInfo();
        myCar.startEngine();
        myCar.throttle();
        myCar.brake();
        myCar.turnOnHeadLamp();
        myCar.turnOffHeadLamp();
    }

	

}
