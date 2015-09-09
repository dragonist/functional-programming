package next.race;

import java.util.Random;

public class Car {
	final int pos;
	
	public Car() {
		this.pos = 0;
	}

	public Car(int pos) {
		this.pos = pos;
	}

	public Car move() {
		Car car;
		if(canGo()){
			car = new Car(pos+1);
		}else{
			car = new Car(pos);
		}
		car.show();
		return car;
	}
	public boolean canGo() {
//		System.out.println("if can go");
		Random r = new Random();
		return (r.nextInt(10) > 4);
	}
	
	public void show() {
//		System.out.print("car");
		String path= com.google.common.base.Strings.repeat("-",pos);
		System.out.println(path);
	}

}
