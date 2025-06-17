package corejava.opps.concepts;

public class StudentConsturctorUse {
    String name;
    double marks;
    int rollNum;

    StudentConsturctorUse(String sname,double smarks,int srollNum){
        name = sname;
        marks = smarks;
        rollNum = srollNum;
    }
    void display(){
        System.out.println (name);
        System.out.println(marks);
        System.out.println (rollNum);
    }

    public static void main(String[] args) {
        StudentConsturctorUse S1= new StudentConsturctorUse ("jay",78,1);
        S1.display();
    }

}
