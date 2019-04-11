public class User implements  EventListener {

    enum Gender {Male, Female}
    String name;
    String emailAddress;
    int age;
    String address;
    String city;
    String zipCode;
    Gender gender;

    public User(String name, String emailAddress, int age, String address, String city, String zipCode, Gender gender) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.age = age;
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
        this.gender = gender;
    }

    @Override
    public void notify(User user, Show show) {
        System.out.println(user.name + " has been subscribed to " + show.name);
    }

}
