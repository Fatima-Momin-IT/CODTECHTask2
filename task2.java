import java.util.*;

public class task2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,total=0;
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Enter your roll no:");
        int roll=sc.nextInt();
        String array[] = {"ENGLISH","HINDI","MARATHI","HISTORY","SCIENCE","GEOGRAPHY","COMPUTER"};
        for(int i=0;i<=array.length-1;i++){
            System.out.println("Enter the marks for: "+array[i]);
            a = sc.nextInt();
            total=a+total;
        }
        System.out.println("The average marks of the student "+name+" is: "+total/array.length);
        int percentage=(total*100)/(array.length*100);
        System.out.println("The percentage of the student " +name + " is:"+percentage);
        System.out.println("The CGPA of the student " +name + " is:"+percentage/9.5);
        switch(percentage/10){
            case 0:
            case 1:
            case 2:
            case 3:
            System.out.println("The student "+name + " score "+ "D grade");
            break;
            case 4:
            case 5:
            System.out.println("The student "+name + " score "+ "C grade");
            break;
            case 6:
            case 7:
            System.out.println("The student " +name + " score "+ "B grade");
            break;
            case 8:
            case 9:
            System.out.println("The student " + name + " score "+ "A grade");
            break;
            case 10:
            System.out.println("The student "+ name + " score "+ "O grade");
            break;
            default:
            System.out.println("The student "+ name + " failed");
}
    if(percentage<35){
        System.out.println(name+" is failed");
    }
    else{
        System.out.println(name+" is pass");
    }


        



        


        



    }
}
