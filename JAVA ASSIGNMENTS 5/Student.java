package com.GeekstersAssignments;

public class Student {
    private String firstName;
    private String lastName;
    private String rollNo;
    private String adress;
    private String mobileNo;
    private String groupName;
    private int classs;


    //SETTER METHODS
    public void setFirstName( String fname)
    {
        this.firstName=fname;
    }
    public void setLastName( String lname)
    {
        this.lastName=lname;
    }
    public void setRollNo( String roll){
        this.rollNo=roll;
    }
    public void setAdress( String adress){
        this.adress=adress;
    }

    public void setMobileNo( String mobile){
        this.mobileNo=mobile;
    }
    public void setGroupName( String group){
        this.groupName=group;
    }
    public void setClassName( int classname){
        this.classs=classname;
    }

    //GETTER METHODS

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;

    }
    public String getRollNo(){
        return lastName;

    } public String getAdress(){
        return adress;

    }
    public String getMobileNo(){
        return mobileNo;

    }
    public String getGroupName(){
        return groupName;

    }
    public int getClassName(){
        return classs;

    }
}
