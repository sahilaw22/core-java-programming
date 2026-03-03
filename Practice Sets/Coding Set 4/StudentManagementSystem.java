// Student Management System Using Collections

import java.util.*;
import java.io.*;

    static class Student {
        int id;
        String name;
        int age;
        double marks;


        Student(int id, String name,int age, double marks) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.marks = marks;
        }

        @Override
        public String toString() {
            return "ID: " + id + "\nName: " + name + "\nAge: " + age + "\nMarks: " + marks;
        }

        public double getMarks() {
            return marks;
        }
    }

    public static void main(String[] args) throws IOException {
        Map<Integer, Student> students = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Find Top Student");
            System.out.println("6. Exit");

            System.out.print("Enter your choice(1-6): ");
            int choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1: {
                    System.out.print("Enter ID: ");
                    int id = Integer.parseInt(br.readLine());
                    System.out.print("Enter Name: ");
                    String name = br.readLine();
                    System.out.print("Enter Age: ");
                    int age = Integer.parseInt(br.readLine());
                    System.out.print("Enter Marks: ");
                    double marks = Double.parseDouble(br.readLine());
                    if (id <= 0 || name == null || age <= 0 || marks < 0) {
                        System.out.println("Invalid input! Try again\n");
                        break;
                    } else {
                        System.out.println("Student added successfully\n");
                    }
                    Student s = new Student(id, name, age, marks);
                    students.put(id, s);
                    break;
                }
                case 2: {
                    int id = Integer.parseInt(br.readLine());
                    if (students.containsKey(id)) {
                        students.remove(id);
                    } else {
                        System.out.println("Student not found!\n");
                        break;
                    }
                    break;
                }
                case 3: {
                    int id = Integer.parseInt(br.readLine());
                    if (students.containsKey(id)) {
                        System.out.println("Student Found!\n" +students.get(id));
                    } else {
                        System.out.println("Student not found\n");
                        break;
                    }
                    break;
                }
                case 4: {
                    List<Student> list = new ArrayList<>(students.values());
                    Collections.sort(list, (a, b) -> Double.compare(b.getMarks(), a.getMarks()));
                    for (Student s : list) {
                        System.out.println("\n" + s);
                    }
                    break;
                }
                case 5: {
                    if (students.isEmpty()) {
                        System.out.println("No students available");
                        break;
                    }
                    Student top = Collections.max(students.values(), Comparator.comparing(Student::getMarks));
                    System.out.println("\nTop Student" + top);
                    break;
                }
                case 6: {
                    System.exit(0);
                }
            }
        }


    }
