package java_oops;

public class Inheritance {
    static class Toppers extends Student {
        int rank;
        Toppers(int rank,int rollNo,String name,double percentage){
            this.rank = rank;
            this.rollNo = rollNo;
            this.percentage = percentage;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Toppers t1 = new Toppers(1,23,"Aditya",99.9);
        System.out.println(t1.schoolName);
        System.out.println(t1.rank);
        System.out.println(t1.rollNo);
        System.out.println(t1.name);
        System.out.println(t1.percentage);
    }
}
