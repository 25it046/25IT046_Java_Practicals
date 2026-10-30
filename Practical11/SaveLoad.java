import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String name;
    transient String password;

    Student(int id, String name, String password) {
        this.id = id; this.name = name; this.password = password;
    }

    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nPassword: " + password;
    }
}

public class SaveLoad {
    public static void main(String[] args) {
        Student[] students = {
            new Student(1, "shivangi", "abc123"),
            new Student(2, "ruhi", "pass789"),
            new Student(3, "Amit", "pass456")
        };

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("students.dat"))) {
            out.writeObject(students);
            System.out.println("Objects saved successfully.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("students.dat"))) {
            Student[] loaded = (Student[]) in.readObject();
            System.out.println("Loaded objects:");
            for (Student student : loaded) System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
