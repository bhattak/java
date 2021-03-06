package hello;

public class Constructor {
	int age;
	Constructor() {
		age=20;
	}
	Constructor(int x){
		this();
		age=age+x;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		Constructor c1=new Constructor(2);
		System.out.println(c1.getAge());
	}

}
