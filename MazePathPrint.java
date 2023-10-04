package com.LeetCodeRecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePathPrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        int r= sc.nextInt();
        System.out.println("Enter the number of Columns");
        int c= sc.nextInt();
        System.out.println("All the Possible Ways are");
        System.out.println(mazePrintPathInListAlsoDiagnolly("",r,c));
        ArrayList<String> nayeem=mazePrintPathInListAlsoDiagnolly("",r,c);
        System.out.println("The total number of Possible ways are -->>");
        System.out.println(nayeem.size());

    }
    public static void mazePrintPath(String empty,int row,int column){
        if(row==1 && column==1){
            System.out.println(empty);
            return;
        }

       if(row>1){
           mazePrintPath(empty+'D',row-1,column);
       }

        if(column>1){
            mazePrintPath(empty+'R',row,column-1);
        }
    }
    public static ArrayList<String> mazePrintPathInList(String empty,int row,int column){
        if(row==1 && column==1){
           ArrayList<String > list=new ArrayList<>();
           list.add(empty);
           return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(row>1){
            list.addAll(mazePrintPathInList(empty+'D',row-1,column));
        }

        if(column>1){
           list.addAll( mazePrintPathInList(empty+'R',row,column-1));
        }
        return list;
    }
    public static ArrayList<String> mazePrintPathInListAlsoDiagnolly(String empty,int row,int column){
        if(row==1 && column==1 ){
            ArrayList<String > list=new ArrayList<>();
            list.add(empty);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();


        if(row>1){
            list.addAll(mazePrintPathInListAlsoDiagnolly(empty+"Down->",row-1,column));
        }

        if(column>1){
            list.addAll( mazePrintPathInListAlsoDiagnolly(empty+"Right->",row,column-1));
        }
        if(row>1 && column>1){
            list.addAll( mazePrintPathInListAlsoDiagnolly(empty+"Diagnol->",row-1,column-1));
        }

        return list;
    }



}
