package edu.fju.exam;

import java.util.Scanner;

public class VendingMachine {


public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("**********************");
    System.out.println("******販賣機******");
    System.out.println("**********************\n");
    VendingMachine v = new VendingMachine();
    v.setObj("a10元",10,"b15元",15,"c10元",10,);
    System.out.print("請輸入投幣金額:");
    int n=s.nextInt();
    v.inPutMoney(n);
    System.out.print("\n======請輸入購買品項例如買第一個品項就輸入1)");
    int n1 = s.nextInt();
    v.moneyCount(v.chooseObj(n1));
    v.outPutMoney();
    
}
}