package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Dog;
import Model.ListOfDogs;

public class DogServiceImpl implements DogService {

    @Override
    public List<Dog> compareAllDogs(ListOfDogs doglist) {
        List<Dog> sortedList = new ArrayList<>();
        for (Dog dog : doglist) {
            sortedList.add(dog);
        }
        sortedList.sort(new NameComparator().thenComparing(new AgeComparator()));

        return sortedList;
    }

    @Override
    public Dog compare2Dogs(ListOfDogs doglist, int num1, int num2) {

        if (doglist.getDogList().get(num1).compareTo(doglist.getDogList().get(num2)) == 1) {
            return doglist.getDogByNum(num1);
        } else if (doglist.getDogList().get(num1).compareTo(doglist.getDogList().get(num2)) == -1) {
            return doglist.getDogByNum(num2);
        } else
            return new Dog("Dogs are equal", 0, "");

    }

}
