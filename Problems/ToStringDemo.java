package Problems;

public class ToStringDemo {
    int rollno;
    String name;

    ToStringDemo(int roll,String name1)//to get obj into string
    {
        this.rollno=roll;
        this.name=name1;

    }
    public String toString(){//internally calling 
        return (rollno  + " " + name);
    }
    

    
    public static void main(String[] args) {
        ToStringDemo obj = new ToStringDemo(1, "avi");
        ToStringDemo obj1 = new ToStringDemo(2, "Avanthi");
        System.out.println(obj);
        System.out.println(obj1);
        
    }
    
}
