package d19stringbuilder_buffer_accessmodifier_static;

public class StudentRunner {
    public static void main(String[] args) {

        //Student class'tan instance olusturalim
        Student ali = new Student();

        System.out.println("ali.stdName = " + ali.stdName); //Ali Can
        System.out.println("ali.email = " + ali.email); //ali.email = alican@gmail.com
        System.out.println("ali.adress = " + ali.adress); //Istanbul
        System.out.println(ali);
    }
}
