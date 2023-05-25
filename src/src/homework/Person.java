package homework;

public class Person {


    String firstName,lastName;
    int age;
    public String getFirstName() {
        if (firstName.isEmpty() == true){
            return firstName;
        }
        return firstName;
    }
    public String getLastName() {
        if (lastName.isEmpty() == true){
            return lastName;
        }
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getFullName(){
        return firstName + lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        if(age >= 0 && age <= 100){
            this.age = age;
        }
        else{
            this.age = 0;
        }
    }
    public boolean isTeen(){
        if(age >= 12 && age <= 20){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName= "+person.getFullName());
        System.out.println("teen= "+person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName= "+person.getFullName());
        System.out.println("teen= "+person.isTeen());
        person.setLastName("Smith");
        System.out.println("fullName= "+person.getFullName());
    }
}