package src.main.oop.seminar3.Apteca;

import javax.print.attribute.standard.PresentationDirection;
import java.util.*;


// лекарство
public class Pharmancy implements Iterable<PharmancyComponent>, Comparable<Pharmancy>{
    private List <PharmancyComponent> components = new ArrayList<>();
    PharmancyComponent element1;
    PharmancyComponent element2;

    private int index = 0;

    PharmancyComponent pharmancyComponent;


    public Pharmancy(PharmancyComponent element1, PharmancyComponent element2){
        this.element1 = element1;
        this.element2 = element2;
    }





    public Pharmancy addComponent(PharmancyComponent component){
        components.add(component);
        return this; // обновляет List
    }



    public List<PharmancyComponent> getComponent() {
        return components;
    }


    public void setComponent(List<PharmancyComponent> component) {
        this.components = component;
    }


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public Iterator<PharmancyComponent> iterator() {
        return new IteratorComponent(this);
    }

    @Override
    public int compareTo(Pharmancy o ) {
       int result = element1.getPower() + element2.getPower();
        if (result < (o.element1.getPower() + o.element2.getPower())){
            return 1;
        } else if (result > (o.element1.getPower() + o.element2.getPower())) {
            return -1;
        }else {return 0;}
        }

        @Override
    public String toString() {
        int sum = element1.getPower() + element2.getPower();
        return "Pharmancy{" +
                "components=" + components +
                "el1= " + element1 +
                "el2= " + element2 +
                "power" + sum +
                '}' + "\n";
    }


//    @Override
//    public boolean hasNext() {
//        return index < components.size();
//    }
//
//    @Override
//    public PharmancyComponent next() {
//        return components.get(index++);
//    }


//    @Override
//    public Iterator<PharmancyComponent> iterator() {
//        return new Iterator<PharmancyComponent>() {
//            @Override
//            public boolean hasNext() {
//                return index < components.size();
//            }
//
//            @Override
//            public PharmancyComponent next() {
//                return components.get(index++);
//            }
//        };
//    }


}
