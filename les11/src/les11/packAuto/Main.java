package les11.packAuto;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num1 = (int)(Math.random()*20 +1);
		int num2 = (int)(Math.random()*20 +1);
		Auto[][] arrOfAuto = new Auto[num1][num2];
		
		int horsePower;
		int yearOfProduction;
		int numberOfCylinders;
		int diameter;
		int material;
		String[] materials = {"Skin", "Alcantara"};
		
		for (int i = 0; i < arrOfAuto.length; i++) {
			for (int j = 0; j < arrOfAuto[i].length; j++) {
				horsePower = (int)(Math.random()*300+50);
				yearOfProduction = (int)(Math.random() * 70 + 1950);
				numberOfCylinders = (int)(Math.random()*12+1);
				diameter = (int)(Math.random()*30+40);
				material = (int)(Math.random()*2);
				arrOfAuto[i][j] = new Auto(horsePower, yearOfProduction,
						new Engine(numberOfCylinders), new SteeringWheel(diameter, materials[material]));
			}
		}
		
		Scanner in = new Scanner(System.in);
		String str;
		boolean flag = false;
		while (!flag) {
			System.out.println("Choose: ");
			System.out.println("a) - Output toString() data of aray elements to the console ");
			System.out.println("b) - For all objects of the given array set the same object of class Auto");
			str = in.nextLine();
			switch (str) {
			case "A":
			case "a":
				System.out.println(Arrays.deepToString(arrOfAuto));
				break;
			case "B":
			case "b":
				for (int i = 0; i < arrOfAuto.length; i++)
					Arrays.fill(arrOfAuto[i], new Auto(86, 2007, new Engine(4),
							new SteeringWheel(50, "Skin")));
				break;
			default:
				System.out.println("Incorrect  value of String(str)!");
			}
		}
	}

}
