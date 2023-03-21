
import Model.ListOfDogs;
import View.DogsView;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        ListOfDogs doglist = new ListOfDogs();
        DogsView dogsView = new DogsView();

        dogsView.printFinalList(doglist.getFinalList(doglist));

        dogsView.chooseFromMenu();

    }
}