package src.main.oop.seminar3.Apteca;

public class PharmancyComponent implements Comparable<PharmancyComponent>{
    private String name;
    private String wiegth;
    private int power;


    public PharmancyComponent(String name, String wiegth, int power) {
        this.name = name;
        this.wiegth = wiegth;
        this.power = power;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWiegth() {
        return wiegth;
    }

    public void setWiegth(String wiegth) {
        this.wiegth = wiegth;
    }

    public int getPower() {
        return power;
    }
    public int getPower( int power) {
        return power;
    }


    public void setPower(int power) {
        this.power = power;
    }


    @Override
    public String toString() {
        return "PharmancyComponent{" +
                "name='" + name + '\'' +
                ", wiegth='" + wiegth + '\'' +
                ", power=" + power +
                '}';
    }

    @Override
    public int compareTo(PharmancyComponent o) {
        if (this.power > o.power) {
            return 1;
        } else if (this.power < o.power) {
            return -1;
        } else {
            return 0;
        }
    }
}
