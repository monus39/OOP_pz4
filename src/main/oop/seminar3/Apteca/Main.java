package src.main.oop.seminar3.Apteca;

import java.util.*;

import static java.util.Collections.*;

public class Main {
    public static void main(String[] args) {
        PharmancyComponent azitroment = new Azitronit("Azitronit", "10 Mg", 50);
        PharmancyComponent pinicilin = new Pinicilin("Pinicilin", "10 Mg", 100);
        PharmancyComponent water = new Water("Water", "10 Mg", 20);



        List<PharmancyComponent> pharmancyComponents = new ArrayList<>();
        pharmancyComponents.add(azitroment);
        pharmancyComponents.add(pinicilin);
        pharmancyComponents.add(water);
        System.out.println(pharmancyComponents);
        Collections.sort(pharmancyComponents);
        System.out.println("/////////////////////////////////////////////////////////////////");
        System.out.println(pharmancyComponents);

        Pharmancy pharmancyA1 = new Pharmancy(azitroment, water);
        Pharmancy pharmancyA2 = new Pharmancy(azitroment, water);
        Pharmancy pharmancyB1 = new Pharmancy(pinicilin, water);
        Pharmancy pharmancyB2 = new Pharmancy(pinicilin, water);
        Pharmancy horrer1 = new Pharmancy(pinicilin, azitroment);



        Set<Pharmancy> pharmancies = new HashSet<>();
        pharmancies.add(pharmancyA1);
        pharmancies.add(pharmancyA1);
        pharmancies.add(pharmancyA1);
        pharmancies.add(pharmancyA2);
        pharmancies.add(pharmancyA2);
        pharmancies.add(pharmancyB1);
        pharmancies.add(pharmancyB1);
        pharmancies.add(pharmancyB2);
        pharmancies.add(pharmancyB2);
        pharmancies.add(pharmancyB2);
        pharmancies.add(horrer1);
        pharmancies.add(horrer1);

        System.out.println("#################################################################");
        System.out.println(pharmancies.size()); // 10 компонентов из них 4 уникальные

        List<Pharmancy> pharm = new ArrayList<>();
        pharm.add(pharmancyA1);
        pharm.add(pharmancyA2);
        pharm.add(pharmancyB1);
        pharm.add(pharmancyB2);
        pharm.add(horrer1);

        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println(pharm);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        Collections.sort(pharm);
        System.out.println(pharm);


    }


}
