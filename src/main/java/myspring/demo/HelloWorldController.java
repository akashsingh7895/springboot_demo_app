package myspring.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Akash!";
    }

    @GetMapping("/how")
    public String Hello() {
        return "Hello, Vikash!";
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "John Doe", "1234567890"));
        students.add(new Student(2, "Jane Smith", "9876543210"));
        students.add(new Student(3, "Akash Kumar", "1122334455"));

        return students;
    }

    // Inner class representing a Student
    static class Student {
        private int rollNumber;
        private String name;
        private String contact;

        // Constructor
        public Student(int rollNumber, String name, String contact) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.contact = contact;
        }

        // Getters
        public int getRollNumber() {
            return rollNumber;
        }

        public String getName() {
            return name;
        }

        public String getContact() {
            return contact;
        }

        // Setters (optional, if needed)
        public void setRollNumber(int rollNumber) {
            this.rollNumber = rollNumber;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setContact(String contact) {
            this.contact = contact;
        }
    }
}
