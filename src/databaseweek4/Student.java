/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseweek4;

/**
 *
 * @author carlo
 */
public class Student extends Person{
    
        private int studentNumber;
    private String id;
    private String password;
    private String phoneNum;
    private String email;
    private String programCode;
    private String programName;
    private double gpa;
    
    public Student(){
        super();
        this.id = "TBA";
        this.password = "TBA";
        this.phoneNum = "TBA";
        this.email = "TBA";
        this.programCode = "TBA";
        this.programName = "TBA";
        this.gpa = 0;
    }
    
    public Student(String firstName, String lastName, String id, String password, 
            String phoneNum, String email,
            String dateOfBirth, String address, String programCode, 
            String programName, double gpa){
        
        super(firstName, lastName, dateOfBirth, address);
        this.setId(id);
        this.setPassword(password);
        this.setProgramCode(programCode);
        this.setProgramName(programName);
        this.setEmail(email);
        this.setPhoneNum(phoneNum);
        this.setGpa(gpa);
  
    }
    
    public Student(int studentNumber, String firstName, String lastName, String address,
            String phoneNum, String email, double gpa){
        
        super(firstName, lastName, "TBA", address);
        this.setStudentNumber(studentNumber);
        this.setId("TBA");
        this.setPassword("TBA");
        this.setProgramCode("TBA");
        this.setProgramName("TBA");
        this.setEmail(email);
        this.setPhoneNum(phoneNum);
        this.setGpa(gpa);
  
    }
    
    public Student(int studentNumber, String firstName, String lastName, String address,
            double gpa){
        
        super(firstName, lastName, "TBA", address);
        this.setStudentNumber(studentNumber);
        this.setId("TBA");
        this.setPassword("TBA");
        this.setProgramCode("TBA");
        this.setProgramName("TBA");
        this.setEmail("TBA");
        this.setPhoneNum("TBA");
        this.setGpa(gpa);
  
    }
    
    
    public Student(String id, String password){
        super();
        this.setId(id);
        this.setPassword(password);
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }
    
    public String getProgramCode() {
        return programCode;
    }

    
    public void setProgramName(String programName) {
        this.programName = programName;
    }
    
    public String getProgramName() {
        return programName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String getPersonalInformation(){
        String info= "<html>";
        info+="<b>Date of Birth   :   </b>"  + this.getDateOfBirth()+"<br />";
        info+="<b>Address         :   </b>"   + this.getAddress()+"<br />";
        info+="<b>Phone Num.      :   </b>"  + this.getPhoneNum()+"<br />" ;
        info+="<b>E-mail          :   </b>"   + this.getEmail()+"<br />";
        info+= "</html>";
        
        return info;
 
   }
    
     @Override
    public boolean equals(Object anObject){
        
        boolean equals = false;
        if (anObject instanceof Student){
        
            Student std = (Student) anObject;
            if(this.id.equals(std.getId()) &&
                    this.password.equals(std.getPassword())){
            
                equals = true;
            }
        
        }
        return equals;
    }
    
    public boolean equalsByUsername(Object anObject){
        
        boolean equals = false;
        if (anObject instanceof Student){
        
            Student std = (Student) anObject;
            if(this.id.equals(std.getId())){
            
                equals = true;
            }
        
        }
        return equals;
    }
}
