import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Theatre {
    static ArrayList<Ticket> ticketList = new ArrayList<>();

    public static void main(String[] args) {
        int[] row1 = new int[12];
       int[] row2 = new int[16];
       int[] row3 = new int[20];



        //ArrayList<Ticket> ticketList = new ArrayList<>();

        boolean menuRepeat = true;
        String ch = "-";
        Scanner input = new Scanner(System.in);

        //Main program
        System.out.println("\nWelcome to the New Theatre\n");

        while (menuRepeat) {

            //Main menu
            System.out.println(ch.repeat(50));
            System.out.println("Please select an option:\n1) Buy a ticket\n2) Print seating area\n3) Cancel ticket\n4) List available seats\n5) Save to file\n6) Load from file\n7) Print ticket information and total price\n8) Sort tickets by price\n   0) Quit");
            System.out.println(ch.repeat(50));

            //asking for the option
            System.out.println("Enter option:");
            String option = input.next();
            switch (option) {
                case "1":
                    buy_ticket(row1, row2, row3);
                    break;

                case "2":
                    print_seating_area(row1, row2, row3);
                    break;

                case "3":
                    cancel_ticket(row1, row2, row3);

                    break;
                case "4":
                    show_tickets(row1, row2, row3);

                    break;
                case "5":
                    save(row1, row2, row3);

                    break;
                case "6":
                    load();

                    break;
                case "7":

                    break;
                case "8":

                    break;
                case "0":
                    System.out.println("Quiting..!");
                    menuRepeat = false;
                    break;
                default:
                    System.out.println("Incorrect value\nTry Again!");
                    continue;
            }
        }
    }

    public static void buy_ticket(int[] row1, int[] row2, int[] row3) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the row number: ");
            String rowNumber = input.next();
            System.out.println("Enter a seat Number: ");
            String seatNumber = input.next();
            try {
                int rowNum = Integer.parseInt(rowNumber);
                int seatNum1 = Integer.parseInt(seatNumber);
                int seatNum = seatNum1 - 1;
                switch (rowNum) {
                    case 1:
                        if (row1[seatNum] == 0) {

                            Ticket ticket = new Ticket();
                            System.out.println("Enter your name: ");
                            String name = input.next();
                            ticket.setName(name);
                            System.out.println(ticket.getName());
                            System.out.println("Enter your surname: ");
                            String sur_name = input.next();
                            System.out.println("Enter your e-mail address: ");
                            String eMail = input.next();
                            ticketList.add(ticket);

                            System.out.println("Seat booked Successfully!");
                            row1[seatNum] = 1;
                            break;
                        }
                        else {
                            System.out.println("Seat occupied!");
                            continue;
                        }
                    case 2:
                        if (row2[seatNum] == 0) {
                            System.out.println("Seat booked Successfully!");
                            row2[seatNum] = 1;
                            break;
                        }
                        else {
                            System.out.println("Seat occupied!");
                            continue;
                        }
                    case 3:
                        if (row3[seatNum] == 0) {
                            System.out.println("Seat booked Successfully!");
                            row3[seatNum] = 1;
                            break;
                        }
                        else {
                            System.out.println("Seat occupied!");
                            continue;
                        }
                    default:
                        System.out.println("invalid row Number..!");
                        continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Enter a Valid Number..!");
                continue;
            }
        }

    }

    public static void print_seating_area(int[] row1, int[] row2, int[] row3) {

        int x;
        int y;
        int z;
        for (x=0; x<row1.length; x++){
            if (row1[x] == 1){
                System.out.print('X');
            }
            else{
                System.out.print('O');
            }
        }
        System.out.println();
        for (y=0; y< row2.length;y++){
            if (row2[y] == 1){
                System.out.print('X');
            }
            else{
                System.out.print('O');
            }
        }
        System.out.println();
        for (z=0;z< row3.length;z++){
            if (row3[z] == 1){
                System.out.print('X');
            }
            else{
                System.out.print('O');
            }
        }
        System.out.println();
    }
    public static void cancel_ticket(int[] row1, int[] row2, int[] row3){

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the row number: ");
            String rowNumber = input.next();
            System.out.println("Enter a seat Number: ");
            String seatNumber = input.next();
            try {
                int rowNum = Integer.parseInt(rowNumber);
                int seatNum1 = Integer.parseInt(seatNumber);
                int seatNum = seatNum1 - 1;
                switch (rowNum) {
                    case 1:
                        if (row1[seatNum] == 1) {
                            System.out.println("Seat cancelled Successfully!");
                            row1[seatNum] = 0;
                            break;
                        } else {
                            System.out.println("Seat already Available");
                            continue;
                        }
                    case 2:
                        if (row2[seatNum] == 1) {
                            System.out.println("Seat cancelled Successfully!");
                            row2[seatNum] = 0;
                            break;
                        } else {
                            System.out.println("Seat already Available");
                            continue;
                        }
                    case 3:
                        if (row3[seatNum] == 1) {
                            System.out.println("Seat cancelled Successfully!");
                            row3[seatNum] = 0;
                            break;
                        } else {
                            System.out.println("Seat already Available");
                            continue;
                        }
                    default:
                        System.out.println("invalid row Number..!");
                        continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Enter a Valid Number..!");
                continue;
            }
        }

    }
    public static void show_tickets(int[] row1, int[] row2, int[] row3){
        int x;
        int y;
        int z;

        System.out.print("Seats available in row 1: ");
        for (x=0; x< row1.length; x++){
            if (row1[x] == 1){
                System.out.print((x+1) + " ");
            }
        }
        System.out.println("\nSeats available in row 2: ");
        for (y=0; y< row2.length; y++){
            if (row2[y] == 1){
                System.out.print((y+1) + " ");
            }
        }
        System.out.println("\nSeats available in row 3: ");
        for (z=0; z< row3.length; z++){
            if (row3[z] == 1){
                System.out.print((z+1) + " ");
            }
        }
        System.out.println();
    }
    public static void save(int[] row1, int[] row2, int[] row3){
        try{
            FileWriter fw = new FileWriter("output.txt");
            int x;
            int y;
            int z;
            String stVal;

            for(x=0; x< row1.length; x++){
                stVal = Integer.toString(row1[x]);
                fw.write(stVal);
            }
            fw.write("\n");
            for(y=0; y< row2.length; y++){
                stVal = Integer.toString(row2[y]);
                fw.write(stVal);
            }
            fw.write("\n");
            for(z=0; z<row3.length; z++) {
                stVal = Integer.toString(row3[z]);
                fw.write(stVal);
            }
            fw.close();
            System.out.println("Successfully wrote to the file");
        }
        catch (IOException e){
            System.out.println("An error occurred!");

        }
    }
    public static void load(){
        try{
            File file = new File("output.txt");
            Scanner fr = new Scanner(file);
            while(fr.hasNextLine()){
                String text = fr.nextLine();
                System.out.println(text);
            }
            fr.close();
        }
        catch (IOException e){
            System.out.println("Error occurred while reading");
        }

    }
    public static void print_ticket(){

    }

}
