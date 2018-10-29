package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add(0, "hello");
        myArrayList.add(1, "abcc");
        myArrayList.add(0, "ga");
        myArrayList.add(2, "cui");
        myArrayList.add(4, "ga");
        myArrayList.remove(1);
        System.out.println(myArrayList.size());
        if(myArrayList.contains("ga")){
            System.out.println("nice");
        }
        System.out.println(myArrayList.get(2));
        if(myArrayList.add("ga")){
            System.out.println("can");
        }else{
            System.out.println("not");
        }
        System.out.println(myArrayList.indexOf("ga"));
        myArrayList.ensureCapacity(2);
        System.out.println();
    }
}
