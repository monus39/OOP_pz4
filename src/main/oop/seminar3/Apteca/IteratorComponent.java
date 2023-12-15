package src.main.oop.seminar3.Apteca;

import java.util.Iterator;
import java.util.List;

public class IteratorComponent implements Iterator<PharmancyComponent> {

    private List<PharmancyComponent> components;
    private int index;

    private Pharmancy pharmancy;

    // вынесенный класс
    public IteratorComponent(Pharmancy pharmancy) {
        this.pharmancy = pharmancy;
        components = pharmancy.getComponent();
        index = pharmancy.getIndex();
    }

    // анонимный класс
//    public Iterator iterator(){
//        return new Iterator() {
//            @Override
//            public boolean hasNext() {
//                return index < components.size();
//            }
//
//            @Override
//            public Object next() {
//                return components.get(index++);
//            }
//        };
//    }

    @Override
    public boolean hasNext() {
       //return pharmancy.getIndex() > pharmancy.getComponent().size();
        return index<components.size();
    }

    @Override
    public PharmancyComponent next() {
//        return pharmancy.getComponent().get(index++);
        return components.get(index++);

    }
}
