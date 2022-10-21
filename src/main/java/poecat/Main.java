package poecat;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        StudentsListService studentsListService = new StudentsListService();
        List<Student> students = studentsListService.getStudentList();

        for(Student student : students)
            System.out.println(student);

        Student student = students.stream()
                .filter(s -> "Zuzia".equals(s.getFirstName()))
                .findAny()
                .orElse(null);

        assert student != null;
        System.out.println(student.getMajor());
    }
}
