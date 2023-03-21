package Model;

import java.util.Iterator;
import java.util.List;

public class ListOfDogsIterator implements Iterator<Dog>{
    private List<Dog> listOfDogsIterable;
    private int counter;

    public ListOfDogsIterator(List<Dog> listOfDogsIterable) {
        this.listOfDogsIterable = listOfDogsIterable;
    }

    @Override
    public boolean hasNext() {
        return counter < listOfDogsIterable.size();
    }

    @Override
    public Dog next() {
        if (!hasNext()) {
            return null;
        }
        counter++;
        return listOfDogsIterable.get(counter - 1);

    }
}
