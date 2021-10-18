package CommunityMember;

public class CommunityMemberTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(5,"Adnan","Rr.Nenen Tereza-Peje");
        CommunityMember cm1 = new CommunityMember(15,"Diellza","Rr.Haxhi Zeka-Prishtine");
        Alumnus a1 = new Alumnus(123,"Agon","Ortakoll-Prizren","Krasniqi","Mashkull",33);
        Student s1 = new Student(155,"Learta","Istrefaj",21,"Femer",
                "Rr.Bajram Hatzic - Peje","Shki",8.5,1819);
        Faculty f1 = new Faculty(111,"UBT","Kalabria-Prishtine","Shki");
        Staff sf1 = new Staff(154,"Naim","Prishtine","Sylejmani","Mashkull",29);
        Administrator ad1 = new Administrator(158,"Harea","Mbreteresha Teute - Peje","Shki","Begolli","Femer",25,12,900);
        Teacher t1 = new Teacher(144,"Edmond","Mulla Jakupi-Shkup","Shki", "Jajaga","Mashkull",38,"Dizajn Softueri",1300);

        System.out.println(e1);
        System.out.println("------------------------------------");
        System.out.println(cm1);
        System.out.println("------------------------------------");
        System.out.println(a1);
        System.out.println("------------------------------------");
        System.out.println(s1);
        System.out.println("------------------------------------");
        System.out.println(f1);
        System.out.println("------------------------------------");
        System.out.println(sf1);
        System.out.println("------------------------------------");
        System.out.println(ad1);
        System.out.println("------------------------------------");
        System.out.println(t1);



    }
}
