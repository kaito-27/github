package quiz;

import java.util.ArrayList;

public class Java55 {
	public static void main(String[] args) {
		ArrayList<Human55> human = new ArrayList<>();
		human.add(new Human55("福田 魁斗", 21));

		for(int i = 0; i < human.size(); i++) {
			System.out.println(i + "番目に格納された人の名前は" + human.get(i).getName() + "です");
		}
	}
}

class Human55{
	private String name;
	private int age;

    public void setName(String name){
    	this.name = name;
	}

    public String getName(){
    	return name;
	}

    public void setAge(int age){
    	this.age = age;
	}

    public int getAge(){
    	return age;
    }

    public Human55(String name, int age) {
		this.name = name;
		this.age = age;
    }

}