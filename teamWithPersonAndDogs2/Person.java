package w3d1.teamWithPersonAndDogs2;

public class Person {

    private String fname;
    private String lname;
    private int age;
    private static int numberOfPersonsCreated;
    private Dog dog;

    public Person() {
        numberOfPersonsCreated++;
    }

    public Person(Dog d, String fname, String lname, int age) {
        this.dog = d;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    public Person(String fname, String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    public static int getNumberOfPersonsCreated(){
        return numberOfPersonsCreated;
    }
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        String details;
        if(dog == null){
            details = "Person fname: " + fname 
                + ", lname: " + lname 
                + ", age:" + age;
        }else{
            details = "Person fname: " + fname 
                + ", lname: " + lname 
                + ", age:" + age
                + " with dog " + dog ;
        }
        
        return details;
    }

}
