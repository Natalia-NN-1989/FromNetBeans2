package lesson3_1;

class Study {

    private String course;

    Study(String course) {
        this.course = course;
    }

    public String printCourse() {
        return this.course;
    }
}

class JavaProgram {

    public static void main(String[] args) {
        Study study = new Study("�������� Java - ��� ������!�. ");

        System.out.println(study.printCourse());
    }
}
