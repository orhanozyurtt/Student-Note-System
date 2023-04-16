public class Course {
    Teacher teacher; // sınıflar birbrilerinin nitelikleri olabilir (Teacher sınıfından referans alıyor)
    String name;
    String code;
    String prefix;
    double note;

    Course(String name,String code , String prefix ){
        this.name = name;
        this.code = code;
        this.prefix= prefix;

        double note = 0; //hata olabilir
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){

            this.teacher = teacher;

        }else {
            System.out.println("öğretmen branşı bu kurs için geçerli değil");
        }

    }

    void printTeacherInfo(){

        if (this.teacher != null){
            this.teacher.print();
        }else {
            System.out.println("kayıt yok");
        }

    }
}
