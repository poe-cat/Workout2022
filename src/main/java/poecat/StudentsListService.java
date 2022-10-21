package poecat;

import java.util.*;

public class StudentsListService {

    private List<Student> studentList = getStudentList();
    private List<Student> filteredList = new ArrayList<>();

    private int studentsCount = 0;

    public List<Student> getAllFemaleStudents() {

        for (Student student : studentList) {
            if (student.getGender().equals("F"))
                filteredList.add(student);
        }
        return filteredList;
    }

    public List<Student> getAllFemaleStudentsOnBiologyMajor() {

        for(Student student : studentList) {
            if (student.getGender().equals("F") && student.getMajor().equals("biologia"))
                filteredList.add(student);
        }
        return filteredList;
    }

    public List<Student> getAllMaleStudentsOnEconomyMajor() {

        for(Student student : studentList) {
            if(student.getGender().equals("M") && student.getMajor().equals("ekonomia"))
                filteredList.add(student);
        }
        return filteredList;
    }

    public List<Student> getAllStudentsWithLastNameBeginningOnT() {

        for(Student student : studentList) {
            if(student.getLastName().charAt(0) == 'T') {
                filteredList.add(student);
            }
        }
        return filteredList;
    }

    public Integer getNumberOfFemaleStudents() {

        for(Student student : studentList) {
            if(student.getGender().equals("F"))
                studentsCount++;
        }
        return studentsCount;
    }

    public Integer getNumberOfAllEconomyStudents() {

        for(Student student : studentList) {
            if(student.getMajor().equals("ekonomia"))
                studentsCount++;
        }
        return studentsCount;
    }

    public List<Student> getStudentList() {

        Student student = new Student(1, "Błażej", "Szewiel", "informatyka", "M");
        Student student2 = new Student(2, "Zuzia", "Szewiel", "biologia", "F");
        Student student3 = new Student(3, "Oriana", "Vampire", "chemia", "F");
        Student student4 = new Student(4, "Alina", "Kowalczyk", "polonistyka", "F");
        Student student5 = new Student(5, "Tomasz", "Ziółek", "ekonomia", "M");
        Student student6 = new Student(6, "Wiktor", "Zborowski", "ekonomia", "M");
        Student student7 = new Student(7, "Izydor", "Irakowski", "informatyka", "M");
        Student student8 = new Student(8, "Donald", "Tusk", "ekonomia", "M");
        Student student9 = new Student(9, "Maria", "Tomasik", "chemia", "F");
        Student student10 = new Student(10, "Łucja", "Tarczyńska", "biologia", "F");

        studentList = Arrays.asList(student, student2, student3, student4, student5, student6, student7,
                student8, student9, student10);

        return studentList;
    }
}

