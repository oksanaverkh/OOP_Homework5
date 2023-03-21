package Controller;

import java.util.Comparator;

import Model.Dog;

public class NameComparator implements Comparator<Dog>{

    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.getName().compareTo(o2.getName());
    }
    
}
