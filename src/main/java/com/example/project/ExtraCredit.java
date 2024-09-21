package com.example.project;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ExtraCredit {


    public static String calculateTip(int people, int percent, double cost, String items) {

         StringBuilder result = new StringBuilder();
// I don't like decimal format.
        String pattern = "##.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        double perPersonCostNoTip = (cost/people);
        double totalTip = (cost*((double)percent/100));
        double costWithTip = (cost+totalTip);
        double perPersonWithTip = (costWithTip/people);
        double tipPerPerson = (totalTip/people);
        
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $"+decimalFormat.format(cost)+"\n"); 
        result.append("Total percentage: "+decimalFormat.format(percent)+"%"+"\n");
        result.append("Total tip: $"+decimalFormat.format(totalTip)+"\n");
        result.append("Total Bill with tip: $"+decimalFormat.format(cost+totalTip)+"\n");
        result.append("Per person cost before tip: $"+decimalFormat.format(perPersonCostNoTip)+"\n");
        result.append("Tip per person: $"+decimalFormat.format(tipPerPerson)+"\n");
        result.append("Total cost per person: $"+decimalFormat.format(perPersonWithTip)+"\n");
        result.append("-------------------------------\n");

        
        result.append("Items ordered:\n");
        result.append(items);


        return result.toString();
    }
                                   
    public static void main(String[] args) {
        int people = 2;
        int percent = 5;
        double cost = 29.56;
        String items; 
        List<String> list = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        while(list.contains("-1") == false){
            System.out.println("Enter an item name or type -1 to finish:");
            list.add(scan.nextLine());
        }
        items = list.get(0)+" \n"+list.get(1)+" \n"+list.get(2)+" \n"+list.get(3)+" \n"+list.get(4);
        //Your scanner object and while loop should go here
                             
        System.out.println(calculateTip(people,percent,cost,items));
        scan.close();
    }
}
