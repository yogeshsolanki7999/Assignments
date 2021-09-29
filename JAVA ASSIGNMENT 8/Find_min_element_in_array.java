package com.GeekstersAssignments;



public class Find_min_element_in_array {
//METHOD TO FIND THE MINIMUM ELEMENT IN THE GIVEN ARRAY
    public int minimum(int arr[]) {
        int min=arr[1];

        for ( int i=0;i<=arr.length-1;i++)
        {
            if (arr[i]<min){
                min=arr[i];
            }
        }return min;

    }

    public static void main(String[] args) {
        //INITIALIZING THE ARRAY
        int []ar={2,6,4,6,9,8};
        //CREATING AN PBJECT OF CLASS TO CALL NON STATIC METHOD
        Find_min_element_in_array obj=new Find_min_element_in_array();
      int minimum=  obj.minimum(ar);
        System.out.println("THE MINIMUM ELEMENT OF ARRAY IS=="+minimum);
    }
}
