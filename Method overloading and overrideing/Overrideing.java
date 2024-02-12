public class Overrideing
{
	public static void main(String[] args) {
	 Dog d= new Dog();
	 d.sound();
	 Cat c=new Cat();
	 c.sound();
}
}
class Dog {
    void sound(){
        System.out.println("bow bow");
    }
}
class Cat extends Dog {
    void sound(){
        System.out.println("meow meow");
    }
}
