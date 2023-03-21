package View;

import java.util.List;
import java.util.Scanner;

import Controller.DogService;
import Controller.DogServiceImpl;
import Model.Dog;
import Model.ListOfDogs;

public class DogsView {
    private ListOfDogs doglist = new ListOfDogs();
    private int number;
    private int choice;
    private DogService dogService = new DogServiceImpl();
    Scanner scan = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);

    public void chooseFromMenu() {
        System.out
                .println("Enter a number of operation: 1 - sort all dogs by name and age, 2 - compare 2 dogs by age.");
        choice = scan.nextInt();

        if (choice == 1) {
            printResultAllDogs(dogService.compareAllDogs(doglist.getFinalList(doglist)));

        } else if (choice == 2) {
            System.out.printf("Enter numbers of dogs out of %d you want to compare:",
                    doglist.getFinalList(doglist).sizeDogList());
            printResult2Dogs(
                    dogService.compare2Dogs(doglist.getFinalList(doglist), getDogNumber() - 1, getDogNumber() - 1));
        } else
            System.err.println("Wrong number, try again");
        scan.close();
    }

    public int getDogNumber() {
        System.out.println("\nEnter a number of dog: ");
        number = scan.nextInt();
        return number;
    }

    public void printResultAllDogs(List<Dog> list) {
        System.out.printf("\nDogs sorted by name and age:\n");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void printResult2Dogs(Dog dog) {
        if (dog.getName().equals("Dogs are equal")) {
            System.out.println("Dogs are equal");
        } else {
            System.out.println("Greater dog:\n" + dog.toString());
        }

    }

    public void printFinalList(ListOfDogs doglist) {
        int i = 1;
        System.out.println("List of available dogs:\n");
        for (Dog dog : doglist) {
            System.out.print(i + " ");
            System.out.println(dog);
            i++;
        }
        System.out.println();
    }

}
