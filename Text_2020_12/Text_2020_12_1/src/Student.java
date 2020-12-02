import java.sql.SQLType;

public class Student {
    public String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object student) {
        if(this==student){
            return true;
        }
        if(student==null){
            return false;
        }
        if(this.getClass()!=student.getClass()){
            return false;
        }
        Student student1=(Student)student;
        return this.name.equals(student1.name);
    }
}
