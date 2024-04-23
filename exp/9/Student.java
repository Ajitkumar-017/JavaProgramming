import java.io.Serializable;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private int age;
    private double weight;
    private double height;
    private String city;
    private String phone;

    public Student(int age, double weight, double height, String city, String phone) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.city = city;
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Age: " + age + ", Weight: " + weight + " kg, Height: " + height + " cm, City: " + city + ", Phone: " + phone;
    }
}
