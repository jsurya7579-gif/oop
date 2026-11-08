class Students{
    private String name;
    private int rollNo;
    private int marks;

    public Students(String name, int rollNo, int marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public String getName(){
        return name;
    }
    public int getRollNo(){
        return rollNo;
    }
    public int getMarks(){
        return marks;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public void setMarks(int marks){
        this.marks = marks;
    }

    public void gradeCalculation(){
        System.out.println("grade calculation");
    }
}
class Result extends Students{
    public Result(String name, int rollNo, int marks){
        super(name, rollNo, marks);
    }
    @Override 
    public void gradeCalculation(){
        int marks = getMarks();
        if(marks >= 90){
            System.out.println("grade : A");
        }else if(marks >= 75){
            System.out.println("grade : B");
        }else if(marks >= 60){
            System.out.println("grade : C");
        }else if(marks >= 50){
            System.out.println("grade : D");
        }else{
            System.out.println("grade : F");
        }

    }
}
public class Student{
    public static void main(String[] args){
        Result s = new Result("surya" , 1, 90);
        System.out.println("Name :" + s.getName());
        System.out.println("Roll No :" + s.getRollNo());
        System.out.println("Marks :" + s.getMarks());
        s.gradeCalculation();
    }

}