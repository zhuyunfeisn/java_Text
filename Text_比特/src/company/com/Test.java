package company.com;
public class Test {

    public static void main10(String[] args) {

        Person p = new Child();

       //System.out.println(p.name);
    }
}
    class Person{
        private String name = "Person";

        int age=0;

    }

     class Child extends Person{

        public String grade;

        }



