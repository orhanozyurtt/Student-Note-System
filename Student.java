public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;


    Student(String name , String stuNo , String classes,Course c1,Course c2 , Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1 ;
        this.c2 = c2 ;
        this.c3 = c3 ;
        this.avarage = 0.0;
        this.isPass = false;

    }

    void addBulkExamNote(int note1,int note2 , int note3,int per1,int per2,int per3){
        if(note1 >= 0 && note1 <=100 && per1 >=0 && per1<=100){
            //this.c1.note = note1;
            this.c1.note = (note1 * 0.80) + (per1 * 0.20);

        }
        if(note2 >= 0 && note2 <=100  && per2 >=0 && per2<=100){
//            this.c2.note = note2;
            this.c2.note = (note2 * 0.80) + (per2 * 0.20);
        }
        if(note3 >= 0 && note3<=100  && per3 >=0 && per3<=100){
            //this.c3.note = note3;
            this.c3.note = (note3 * 0.80) + (per3 * 0.20);
        }

    }
   /* void addBulkPerformNote(int per1,int per2 , int per3){
        if(per1 >=0 && per1 <=100){
            this.c1.note
        }
        if(per2 >=0 && per2 <=100){

        }
        if(per3 >=0 && per3 <=100){

        }
    }*/

    void isPass(){
        this.avarage = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        System.out.println("==========================================");
        if(this.avarage > 55){
            System.out.println("Başarılı. Geçtiniz");
            this.isPass = true;
        }else {
            System.out.println("Başarısız. Kaldınız");
            this.isPass = false;
        }

        printNote();
    }
    void printNote(){
        System.out.println(this.c1.name + "Notu\t" + this.c1.note);
        System.out.println(this.c2.name + "Notu\t" + this.c2.note);
        System.out.println(this.c3.name + "Notu\t" + this.c3.note);
        System.out.println("Ortalamanız : " + this.avarage);

    }
}
