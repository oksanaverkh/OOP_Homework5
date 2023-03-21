package Controller;

import java.util.List;

import Model.Dog;
import Model.ListOfDogs;

public interface DogService {

    List<Dog> compareAllDogs(ListOfDogs doglist);

    Dog compare2Dogs(ListOfDogs doglist, int num1, int num2);
}
