package games;

public class Player {
/**** instances for player class ***/
	private final String name;
	private final Height height;
	private final int age;
	public Player(String name, Height height, int age) {
		this.name = name;
		this.height = height;
		this.age = age;
	}
	// getters for name
	public String getName() {
		return name;
	}
	//getters for height
	public Height getHeight() {
		return height;
	}
	//getters for age
	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		

	}

	@Override
	public String toString() {
		//string which you can auto generate from eclipse or formatting yourself
		return "Player [name=" + name + ", height=" + height + ", age=" + age + "]";
	}
	

}
