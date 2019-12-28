/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signup;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author lenovo
 */
public class user {

    public static Vector name=new Vector<>();
    public static Vector email=new Vector<>();
    public static Vector  pass=new Vector<>();
    public static Vector  name_f=new Vector<>();
    public static Vector  name_p=new Vector<>();
    String gender ;
    String datefbirth;
    //String input;

    public user() {
        this.name = new Vector<>();
        this.email = new Vector<>();
        this.pass = new Vector<>();

    }

    public static void main(String[] args) {
        // TODO code application logic here
        String e = null;
        user s=new user();
        int num = 0;
        int choose = 0;

        Scanner input=new Scanner(System.in);
        System.out.println("enter num of registeration");
        num=input.nextInt();
        for(int j=0;j<num;j++){

            s.registeration();}

        boolean is = friend();


    }
    public  boolean registeration(){
        String n,p,e;
        int num;
        Scanner input=new Scanner(System.in);


        System.out.println("enter name");

        n=input.next();

        System.out.println("enter email");
        e=input.next();
        System.out.println("enter pass");
        p=input.next();
        CashedUser check=new CashedUser();
        check.getUser(n,p);
        name.add(n);
        email.add(e);
        pass.add(p);
        System.out.println("enter gender");
        this.gender=input.next();
        System.out.println("enter date of birth");
        this.datefbirth=input.next();
        System.out.println("registered successfully");
        System.out.println(user.name);

        return true;


    }
    public void login(){
        String e,p;
        Scanner input=new Scanner(System.in);
        System.out.println("******* LOGIN *******");
        System.out.println("enter email");
        e=input.next();

        System.out.println("enter pass");
        p=input.next();
        if (email.contains(e)&& pass.contains(p)){
            System.out.println("....login succefully.... ");

            System.out.println(this.name);
        }
        else {
            System.out.println("........this account not exist...... ");
            registeration();

        }}

    public static boolean friend(){
        String e,p;
        System.out.println("*******Send friend request*******");
        Scanner input=new Scanner(System.in);
        System.out.println("enter your email");
        e=input.next();

        System.out.println("enter pass");
        p=input.next();

        if (email.contains(e)&& pass.contains(p)){

            String na;
            System.out.println("enter name of friend");
            na=input.next();
            for(int i=0;i<name.size();i++)
                if(name.contains(na)) {

                    System.out.println("friend request sent");
                    name_f.addElement(e);
                    break;
                }

                else{
                    System.out.println("error");
                }
            System.out.println("*******Accept friend request*******");
            System.out.println("Hi!"+" " + na);
            if(name_f.contains(e)) {
                System.out.println( e+"  "+ "sent you a friend request");
                System.out.println( "Do you want to accept the friend request? -> 1)confirm , 2)Delete");
                int u;
                System.out.println("enter your choice");
                u=input.nextInt();
                switch (u) {
                    case 1:
                        System.out.println("Accept friend request");
                        break;
                    case 2:
                        name_f.remove(e);
                        System.out.println(e+"  "+"deleted from friend request");
                }
            }
            else{
                System.out.println("error");
            }

        }
        else{
            System.out.println("acount not exist");
        }

        System.out.println("*******Do you want to be upgraded to a premuim user? -> 1)yes , 2)No*******");
        String t,g;
        int s,ss;
        //System.out.println("enter your choice");
        s=input.nextInt();
        switch (s) {
            case 1:
                System.out.println("enter user email");
                t=input.next();
                System.out.println("enter pass");
                g=input.next();
                if (email.contains(t)&& pass.contains(g)){

                    System.out.println("you have to pay 99$ for a year -> 1)agree , 2)Not agree");
                    // System.out.println("enter your choice");
                    ss=input.nextInt();
                    switch (ss) {
                        case 1:
                            System.out.println("you can pay credit or paypal");
                            name_p.addElement(t);
                            if(name_p.contains(t)){
                                System.out.println(t+" "+ "is now a premuim user");
                            }
                            else{
                                System.out.println("you didn't pay");
                            }
                            break;
                        case 2:
                            break;
                    }
                }
                else{
                    System.out.println("acount not exist");
                }
            case 2:
                break;
        }


        return false;



    }


}

