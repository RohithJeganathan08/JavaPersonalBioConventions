import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    String yesno;
    String name;
    String birthday;
    String grade;
    String school;
    String oneclass;
    String twoclass;
    String threeclass;
    String fourclass;
    String fiveclass;
    String sixclass;
    String sevenclass;
    String eightclass;
    String onehobbie;
    String twohobbie;
    String threehobbie;
    
    System.out.println("");
    
    System.out.println("This Java code outputs your name, birthday, grade, classes, and hobbies after taking inputs for each parameter.");

    System.out.println("");
    
    System.out.println("Would you like to start? (Yes/No)");
      yesno = myObj.nextLine();
      if (yesno == "Yes") {
        System.out.println("We shall start");
      } else {
        System.out.println("We are still going to start");
      }

    System.out.println("");
    
    System.out.println("Enter name"); 
      name = myObj.nextLine();   
    System.out.println("Enter birthday"); 
      birthday = myObj.nextLine(); 
    System.out.println("Enter grade"); 
      grade = myObj.nextLine(); 
    System.out.println("Enter school"); 
      school = myObj.nextLine();
    
    System.out.println("");
    
    System.out.println("List first period class"); 
      oneclass = myObj.nextLine(); 
    System.out.println("List second period class"); 
      twoclass = myObj.nextLine(); 
    System.out.println("List third period class"); 
      threeclass = myObj.nextLine(); 
    System.out.println("List fourth period class"); 
      fourclass = myObj.nextLine(); 
    System.out.println("List fifth period class"); 
      fiveclass = myObj.nextLine(); 
    System.out.println("List sixth period class"); 
      sixclass = myObj.nextLine(); 
    System.out.println("List seventh period class"); 
      sevenclass = myObj.nextLine(); 
    System.out.println("List eight period class"); 
      eightclass = myObj.nextLine(); 
    
    System.out.println("");

    System.out.println("List first hobbie"); 
      onehobbie = myObj.nextLine(); 
    System.out.println("List second hobbie"); 
      twohobbie = myObj.nextLine(); 
    System.out.println("List third hobbie"); 
      threehobbie = myObj.nextLine();

    System.out.println("");

    System.out.println(name + " was born on " + birthday + " and is in grade " + grade + " at " + school);

    System.out.println("");
    
    System.out.println(name + " takes " + oneclass + ", " + twoclass + ", " + threeclass + ", " + fourclass + ", " + fiveclass  + ", " + sixclass + ", " + sevenclass + ", and " + eightclass);    

    System.out.println("");

    System.out.println(name + "'s hobbies include " + onehobbie + ", " + twohobbie + ", and " + threehobbie);

  }
}