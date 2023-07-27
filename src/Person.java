public class Person {
    String firstName;
    String lastName;
    int age;
    String email;
    String phoneNum;
    int kg;
    public Person(String firstName, String lastName, int age) {
        this.firstName= firstName;
        this.lastName= lastName;
        this.age=age;
    }

    public Person(String firstName, String lastName, int age, String email, String phoneNum, int kg) {
        this(firstName, lastName, age);
        this.email=email;
        this.phoneNum=phoneNum;
        this.kg=kg;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }

}

