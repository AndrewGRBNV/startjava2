package src.startjava.lesson_2_3.robot;
public class Jaeger {
//сделано с помощью геттеров
        public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    boolean drift() {
        return true;
    }

    void  move() {}

    String scanKaiju() {
        return "Yes";
    }

    void useVortexCannon() {}

    //сделано с помощью конструктора
//    public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, int strength, int armor) {
//        this.modelName = modelName;
//        this.mark = mark;
//        this.origin = origin;
//        this.height = height;
//        this.weight = weight;
//        this.speed = speed;
//        this.strength = strength;
//        this.armor = armor;
//    }

}