public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("orhan","FZK","555");
        Teacher t2 = new Teacher("murat","TRH","4577");
        Teacher t3 = new Teacher("mehmet","BIO","8585");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t2);
        //tarih.printTeacherInfo();

        Course fizik = new Course("fizik","102","FZK");
        fizik.addTeacher(t1);

        Course biyo = new Course("Biyoloji","103","BIO");
        biyo.addTeacher(t3);


        Student s1 = new Student("İnek Şaban" , "123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,78,50,100,100,100);
        s1.isPass();

        Student s2 = new Student("necmi" , "124","4",tarih,fizik,biyo);
        s2.addBulkExamNote(100,75,60,100,100,100);
        s1.isPass();

    }
}