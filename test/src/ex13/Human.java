package ex13;

// 사람 클래스(Ver.2)
public class Human {
	
	// 필드
	private String name;
	private int height;
	private int weight;
	
	// 생성자
	public Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	// 메소드
	
	public String getname() {return name;}
	public int getHeight() {return height;}
	public int getWeight() {return weight;}
	
	void gianWeight(int w) {weight += w;}
	void reduseWeight(int w) {weight -= w;}
	
}
