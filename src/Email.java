package emailapp;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;

   public Email(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
    System.out.println("EMAIL CREATED: "+ this.firstName+" "+this.lastName);

    this.department = setDepartment();
    System.out.println("Department: " + this.department);

    this.password = randomPassword(defaultPasswordLength);
    System.out.println("Your password is: "+ this.password);

    email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department +"."+ companySuffx;
    System.out.println("Your email is: "+ email);
   }
   p

    System.out.println("New worker:"+ firstName +".

    DEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
    int depChoice = in.nextInt();
    if(depChoice==1){return "sales";}
    else if(depChoice==2){return "dev"}
    else if(depChoice==3){return "acct";}
    else{return "";}
   }
   private String randomPassword(int length){
    

    char[] password = new char[length];
    for(int i=0; i<length; i++){
       int rand = (int) (Math.random() * passwordSet.length());
       password[i] = passwordSet.charAt(rand); 
    
        }
    return new String(password);
   }

     this.mailboxCapacity=capacity; 
          
    

     this.alternateEmail = altEmail; 
        
    

     this.password = password; 
        
    

    public String getAlternateEmail (
        ){return alternateEmail
    ;

    public String getPassword(){ retu r
        n password;}
    

     
        
    
   public String showInfo(){
    return "DISPLAY NAME: "+ firstName + " " + lastName+"\nCompany Email: "+ email+"\nMailbox Capacity: " + mailboxCapacity + "mb";
   }
}

