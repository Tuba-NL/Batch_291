package d19stringbuilder_buffer_accessmodifier_static;

public class Student2Runner {
    public static void main(String[] args) {

        System.out.println(Student2.stdName); //Ali Can
        //static class member'lara ulasmak icin sadece class ismi yeterlidir

        Student2 ali = new Student2();
        System.out.println(ali.age); //18
        //age, non-static oldugu icin, ona ulasmak icin object olusturmak zorundayiz

        Student2.staticMethod(); //Ben static bir methodum
        ali.nonStaticMethod(); //Ben non-static bir methodum
    }
}
