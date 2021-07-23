package model;

public class Stundent {

    String name;
    int age;
    String branch;

    // Parameterized construction


    public Stundent (String name, int age, String branch) {
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    // Getter and setter


    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getBranch () {
        return branch;
    }

    public void setBranch (String branch) {
        this.branch = branch;
    }
}
