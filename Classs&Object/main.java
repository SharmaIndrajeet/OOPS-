class Student{
    String name; 
    int Roll; 
    String Branch; 
    float CGPA; 
}

public class main {
    public static void main(String[] args) {


        Student sana = new Student(); 
        sana.name = "Sana"; 
        sana.Roll = 3012; 
        sana.Branch= "C.S.E";
        sana.CGPA= 4; 
        
        

        System.out.println(sana.Branch);
        
    }
}
