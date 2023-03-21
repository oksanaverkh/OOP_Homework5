package Model;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListOfDogs implements Iterable<Dog> {
    private List<Dog> doglist;

    public List<Dog> getDogList() {
        return doglist;
    }

    public List<Dog> add(Dog dog) {
        doglist.add(dog);
        return doglist;
    }

    public int sizeDogList() {
        return doglist.size();

    }

    public void setDogList(List<Dog> doglist) {
        this.doglist = doglist;
    }

    @Override
    public Iterator<Dog> iterator() {
        return new ListOfDogsIterator(doglist);
    }

    public Dog getDog(String name) {
        for (Dog dog : doglist) {
            if (dog.getName().equalsIgnoreCase(name))
                return dog;
        }
        return new Dog("NO such dog", 0, "-");
    }

    public Dog getDogByNum(int number) {
        for (int i = 0; i < doglist.size(); i++) {
            if (i == number) {
                return doglist.get(i);
            }
        }
        return new Dog("NO such dog", 0, "-");
    }

    public ListOfDogs getFinalList(ListOfDogs doglist) {
        doglist.setDogList(Arrays.asList(new Dog("Sharik", 2, "Shepherd"),
                new Dog("Pashtet", 3, "Pomeranian"),
                new Dog("Pashtet", 1, "Pit bull"),
                new Dog("Polkan", 4, "Dachshund"),
                new Dog("Persik", 2, "Shi-tsu"),
                new Dog("Businka", 3, "Collie"),
                new Dog("Snezhok", 1, "Pit bull")));

        return doglist;
    }

}
