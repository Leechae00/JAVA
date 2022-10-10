package javapractice1.wk5_1;

public class Car {
	private int speed;
	private boolean stop;
	
	public Car() {}
	
	public int getSpeed(){
		return speed;
	}
	
	public boolean isStop(){
		return stop;
	}
	
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
			return ;
		}
		else {
			this.speed = speed;
		}
}
	public void setStop(boolean Stop) {
		this.stop = Stop;
		if(Stop) {
			this.speed = 0;
		}
	}
}



