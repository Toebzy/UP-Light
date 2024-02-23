package model.entities;

public class User {
    private String name;
    private String password;
    private String mail;
    private int height;
    private int weight;
    private int age;
    private String goal;
    private String gender;
    private int activity;

    public User(String name, String password, String mail, int height, int weight, int age, String gender, int activity) {
        this.name = name;
        this.password = password;
        this.mail = mail;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.gender=gender;
        this.activity=activity;
    }

    public void setGoal(String goal){
        this.goal= goal;
    }

    public String getGoal(){
        return goal;
    }

    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", mail='" + mail + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                ", gender=" + gender +
                ", activity=" + activity +
                '}';
    }

    public String getGender() {
        return gender;
    }

    public int getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public int getActivity() {
        return activity;
    }
    public String getMail() {
        return mail;
    }
}