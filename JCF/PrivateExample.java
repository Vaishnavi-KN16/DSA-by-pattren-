class Student {

    private int marks = 90;

    void showMarks() {
        // We are inside Student, so this works
        System.out.println(marks);
    }
}

public class PrivateExample {

    public static void main(String[] args) {

        Student s = new Student();

        s.showMarks();       // ✅ works

        // System.out.println(s.marks); // ❌ ERROR
    }
}