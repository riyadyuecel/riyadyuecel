
public class Main {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "123456");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "012345");
        Teacher t3 = new Teacher("Külyutmaz","MAT","112233");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102","FZK");
        fizik.addTeacher(t2);

        Course matematik = new Course("Matematik", "103","MAT");
        matematik.addTeacher(t3);

        Student s1 = new Student("Rio", "333","4",tarih, fizik,matematik);
        s1.addBulkExamNote(100,70,50,50,70,40);
        //s1.printNote();
        s1.isPass();

        Student s2 = new Student("Kapo","777","4", tarih,fizik,matematik);
        s2.addBulkExamNote(40,30,70,80,90,80);
        //s2.printNote();
        s2.isPass();
    }
}
