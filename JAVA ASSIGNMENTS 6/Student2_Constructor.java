package com.GeekstersAssignments;

public class Student2_Constructor {

        private String firstName;
        private String lastName;
        private String rollNo;
        private String adress;
        private String mobileNo;
        private String groupName;
        private int classs;


  public Student2_Constructor(String firstName, String lastName, String rollNo, String adress, String mobileNo, String groupName, int classs){
      this.firstName=firstName;
      this.lastName=lastName;
      this.rollNo=rollNo;
      this.adress=adress;
      this.mobileNo=mobileNo;
      this.groupName=groupName;
      this.classs=classs;

  }
  public Student2_Constructor(){
      this.firstName="SHIKHA";
      this.lastName="SOLANKI";
      this.rollNo="CS56";
      this.adress="78";
      this.mobileNo="7389647031";
      this.groupName="BLUE";
      this.classs=10;
  }


  public void show(){
      System.out.println(this.firstName);
      System.out.println(this.lastName);
      System.out.println(this.rollNo);
      System.out.println(this.adress);
      System.out.println(this.mobileNo);
      System.out.println(this.groupName);
      System.out.println(this.classs);
  }
}
