package java_oops;

//keeping classes in separate files within same package
public class Student{
    String name;
// private -> is used to restrict access within the class
//  private int rollNo;

    int rollNo;

    double percentage;

// static make sure that separate 'number of students' containers are not create for each
// child but same containers is accessed by all of them
// isliye now on adding a child  we get no of students increased by 1
    static int numberOfStudents;

//    It cannot be changed in other children of this class
//    cannot be reassigned, cannot do getter , setter
    final String schoolName = "St.pauls";

//    example of getter function to access it somewhere else because earlier
//    it was private in that class , getter is written in that class itself
//    public int getRollNo(){
//        return rollNo;
//    }

//    using setters able to set values into private class
//    public void setRollNo(int roll) {
//        rollNo = roll;
//    }

//    "this" keyword used to tell compiler that it belongs to the attribute of class
//    in case we want to use the same name for both the places
//    public void setRollNo(int rollNo) {
//    this.rollNo = rollNo;
//}


//   constructor building is building a function with same name as class
//    first it will take values at 3 places and pass it to original student class
    public Student(String name, int rollNo, double percentage){
        this.name = name;
        this.rollNo = rollNo;
        this.percentage = percentage;
        numberOfStudents++;
    }

//    if we run without passing attributes default constructor is activated
//    default constructor
    public Student(){

    }

//  "static"
}
