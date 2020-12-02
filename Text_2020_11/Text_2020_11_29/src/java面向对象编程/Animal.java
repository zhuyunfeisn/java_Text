package java面向对象编程;


public class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }
    public void eat(String food){
        System.out.println(this.name+"正在吃"+food);
    }
}

class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }
}
class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }
    public void fly(){
        System.out.println(this.name+"正在飞");
}

/*

class Cat{
    public String name;

    public Cat(String name) {
        this.name = name;
    }
public void food(String food){
    System.out.println(this.name+"正在吃"+food);
}

class Bird{
        public String name;

    public Bird(String name) {
        this.name = name;
    }
    public void food(String food){
        System.out.println(this.name+"正在吃"+food);
    }
    public void fly(){
        System.out.println(this.name+"正在飞");
    }
}

*/
}
