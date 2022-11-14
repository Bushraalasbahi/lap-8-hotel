import java.util.Objects;
public abstract class Person {
private int id;
private String name;
private int age;
private int phon;

    public Person(int id, String name, int age, int phon) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phon = phon;
    }
    public abstract double calculatevalue();
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public int getPhon() {return phon;}
    public void setPhon(int phon) {this.phon = phon;}

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phon=" + phon +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        if (id != person.id) return false;
        if (name != person.name) return false;
        if (age != person.age) return false;
        if (phon != person.phon) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + phon;
        return result;
    }
}
