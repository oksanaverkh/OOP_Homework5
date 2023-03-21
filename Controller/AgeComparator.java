package Controller;

import java.util.Comparator;

import Model.Dog;

public class AgeComparator implements Comparator<Dog>{

    @Override
    public int compare(Dog o1, Dog o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
    
}
