public class User {
    private String name;
    private Integer age;

    void setName (String name) {
        this.name = name;
    }

    public void setAge (Integer age) {
        this.age = age;
    }

    public String getName () {
        return name;
    }

    public Integer getAge () {
        return age;
    }

    public String toString() {
        return name + ", возраст " + age + " лет";
    }

    User(String name, Integer age) {
        this.setName(name);
        this.setAge(age);
    }


}
