package controller;

import java.util.Scanner;

import model.Room;

public class Main {

	public static void main(String[] args) {
		
		Room[] arrayRooms = new Room[10];
		
		String name, email;
		int room;
		int found = 0; //flag
		boolean avalaible = true;
		
		Scanner scan = new Scanner(System.in);
		
		int quantity;
		
		System.out.println("How many students are going to rent a room?");
		quantity = scan.nextInt();
		scan.nextLine();
			
		
		for(int i = 0; i < quantity; i++) {
			
			if(i == 0) {
			
			System.out.println("Name: ");
			name = scan.nextLine();
			
			System.out.println("Email: ");
			email = scan.nextLine();
			
			System.out.println("Room: 0-9");
			room = scan.nextInt();
			
			scan.nextLine();
			
			arrayRooms[room] = new Room(name, email);
			arrayRooms[room].setAvalaible(true);
			}
			else {
				System.out.println("Name: ");
				name = scan.nextLine();
				
				System.out.println("Email: ");
				email = scan.nextLine();
				
				
				do {
					found = 0;
					System.out.println("Room: 0-9");
					room = scan.nextInt();
					
					scan.nextLine();
					
					if(arrayRooms[room] == null) {
						arrayRooms[room] = new Room(name, email);
						arrayRooms[room].setAvalaible(avalaible);
					}else {
						System.out.println("This room is not avalaible!");
						found = 1;
					}
				}while(found == 1);
		
				
			}
			
			
		}
		
		for(int i = 0; i < 10; i++) {
			
			if(arrayRooms[i] != null) {
				System.out.println("Room " + i);
				System.out.println("Student's name:" + arrayRooms[i].getName());
				System.out.println("Student's email:" + arrayRooms[i].getEmail());
			}
			else {
				System.out.println("The room " + i + " is empty");
			}
			
			
			
		}
		
		
		
	}

}
