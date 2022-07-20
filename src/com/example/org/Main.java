package com.example.org;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Set the name and age for the patient
        patient patient_1 = new patient("Tom", 25);
//        Display the name and age for the patient
        System.out.println("Name: " + patient_1.getName());
        System.out.println("Age: " + patient_1.getAge());


        Scanner scanner = new Scanner(System.in);
//        declare choose variable
        int choose;

//        Begin of the loop
//        A loop to display the list again to choose organ after finishing one
        do {
//            Display the list of organs to choose form
            System.out.println("Choose an organ:");
            System.out.println("\t1. Left Eye");
            System.out.println("\t2. Right Eye");
            System.out.println("\t3. Heart");
            System.out.println("\t4. Stomach");
            System.out.println("\t5. Skin");
            System.out.println("\t6. Quit");

//            Get choose number from the user
            choose = scanner.nextInt();

            if (choose == 1) {
//                Set the left eye
                organ left_eye = new organ("Left Eye", "Short Sighted", "Blue");
//                Display the name of organ
                System.out.println("Name: "+ left_eye.getname());
//                Display the Medical Condition for the organ
                System.out.println("Medical Condition: "+ left_eye.getMed_con());
//                Display the color of the eye
                System.out.println("Color: "+ left_eye.getcolor());
//                Ask to close the eye
                System.out.println("\t\t1. Close the Eye");
                int digest = scanner.nextInt();
                if (digest == 1)
                {
//                    Confirm that the eye is closed
                    System.out.println("Left Eye Closed");
                }
            } else if (choose == 2) {
//                Set the right eye
                organ right_eye = new organ("Right Eye", "Short Sighted", "Blue");
//                Display the name of organ
                System.out.println("Name: "+ right_eye.getname());
//                Display the Medical Condition for the organ
                System.out.println("Medical Condition: "+ right_eye.getMed_con());
//                Display the color of the eye
                System.out.println("Color: "+ right_eye.getcolor());
//                Ask to close the eye
                System.out.println("\t\t1. Close the Eye");
                int digest = scanner.nextInt();
                if (digest == 1)
                {
//                    Confirm that the eye is closed
                    System.out.println("Right Eye Closed");
                }
            } else if (choose == 3) {
//                Set the heart
                organ heart = new organ("Heart", "Normal", 65);
//                Display the name of organ
                System.out.println("Name: "+ heart.getname());
//                Display the Medical Condition for the organ
                System.out.println("Medical Condition: "+ heart.getMed_con());
//                Display Heart rate
                System.out.println("Heart rate: "+ heart.getrate());
//                Ask to change the Heart rate
                System.out.println("\t\t1. change the heart rate");
                int change_rate = scanner.nextInt();
                if (change_rate == 1){
//                change the Heart rate
                    System.out.println("Enter the new heart rate: ");
                    int get_rate = scanner.nextInt();
                    heart.setrate(get_rate);
//                Display the new Heart rate
                    System.out.println("Heart rate changed to: "+ heart.getrate());
                }
            } else if (choose == 4) {
//                Set the stomach
                organ stomach = new organ("Stomach", "PUD");
//                Display the name of organ
                System.out.println("Name: "+ stomach.getname());
//                Display the Medical Condition for the organ
                System.out.println("Medical Condition: "+ stomach.getMed_con());
                System.out.println("Need to be fed");
//                Ask to digest food
                System.out.println("\t\t1. Digest");
                int digest = scanner.nextInt();
                if (digest == 1)
                {
//                Display digesting food
                    System.out.println("Digesting begin...");
                }
            } else if (choose == 5) {
//                Set the skin
                organ skin = new organ("Skin", "Burned");
//                Display the name of organ
                System.out.println("Name: "+ skin.getname());
//                Display the Medical Condition for the organ
                System.out.println("Medical Condition: "+ skin.getMed_con());
            }
        }while (choose !=6);
//        end of the loop
    }
}