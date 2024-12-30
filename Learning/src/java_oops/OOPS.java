package java_oops;

public class OOPS {
//    classes sare blueprints
//    objects are real world entities
//    creating a new data type -> java_oops.Student
//    class has multiple attributes(properties)

//    public static int fun(java_oops.Student s){
//        System.out.println(s.percentage);

////        updating attributes of object within this function
////        classes are passed by reference
////        user defined datatype use pass by reference

////        s.rollNo = 24;
//        return 0;
//    }
    public static void main(String[] args) {

//        objects of student class
//        declaration
//        java_oops.Student x = new java_oops.Student();

//        initialisation
//        x.name = "Aditya Kumar";
//        x.rollNo = 05;
//        x.percentage = 92.45;
//        System.out.println(x.percentage+20);


//        another object of student class
//        java_oops.Student y = new java_oops.Student();
//        y.name = "Aditi";
//        y.percentage = 94.22;
//        y.rollNo = 70;
//        System.out.println(y.name);
//        fun(y);


//        passing a setting value for roll no to be set using setters
//        after making it private
//        y.setRollNo(76);


//        getter function can also be accessed through dot operator
//        System.out.println(y.getRollNo());


//        constructor is kind of function that removes use of
//        declaring value for each attribute separately
//        java_oops.Student z = new java_oops.Student("Raghav",78,98.99);
//        System.out.println(z.name);
//
//        java_oops.Student m = new java_oops.Student("Abhinav",2,99);
//        m.name = "Myname";
//        System.out.println(m.name);

////  In this case default wala is activated
//        java_oops.Student m = new java_oops.Student();
//        m.name = "Myname";
//        System.out.println(m.name);
//        System.out.println(m.schoolName);

//        used to explain static variable
//        java_oops.Student m = new java_oops.Student("Abhinav",2,99);
//        System.out.println(m.numberOfStudents);
//
//        java_oops.Student s1 = new java_oops.Student("raghav",3,99);
//        System.out.println(s1.numberOfStudents);

//        static functions

        System.out.println(Student.numberOfStudents);
        Student.numberOfStudents = 250;
        Student m = new Student("Abhinav",2,99);
        System.out.println(m.numberOfStudents);
        Student s1 = new Student("raghav",3,99);
        System.out.println(s1.numberOfStudents);

    }
}
