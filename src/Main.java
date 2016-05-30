class Cat {

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYears() {
		return age;
	}
	public void setYears(int years) {
		this.age = years;
	}
	private String name;
	private int age;
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Cat() {
		this("", 0);
	}
	public void say(){
		System.out.println("I am " + this.name + "!");
		System.out.println("I am " + this.age + " years old cat!");
	}

}
public class Main {

	public static void main(String[] args) {
	Cat cats []= new Cat[10];
//		cats [0] = new Cat("Lucky", 2);
//		cats [1] = new Cat("Chara", 5);
//		cats [2] = new Cat("Lisa", 1);
//		cats [3] = new Cat("Cherry", 3);
//		cats [4] = new Cat("Osama", 6);
//		cats [5] = new Cat("Zeus", 2);
//		cats [6] = new Cat("Tom", 4);		
//		cats [7] = new Cat("Garfild", 1);
//		cats [8] = new Cat("Eek", 3);
//		cats [9] = new Cat("Sox", 1);
		for (int i = 0; i<cats.length; i++) {
			cats[i]= new Cat ("Name "+ i, i);
		}
		for (Cat c: cats) {
			c.say();
		}
	}
}
