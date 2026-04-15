package kadai_015;

public class Car_Chapter15 {

	
	private static int gear = 1;
	private static int speed =10;
	
	public static void changeGear(int afterGear) {
		speed = switch(afterGear) {
		
			case 1 -> 10;
			case 2 -> 20;
			case 3 -> 30;
			case 4 -> 40;
			case 5 -> 50;
			default -> 10;
			
		};
		
		System.out.println("ギア"+gear+"から"+afterGear+"に切り替えました");
		
	}
	
	public static void run() {
		System.out.println("速度は時速"+speed+"kmです");
	}

}
