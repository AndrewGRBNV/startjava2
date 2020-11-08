package src.startjava.lesson_2_3.robot;
public class JaegerTest {
    public static void main(String[] args) {
        //сделано с помощью геттеров
        Jaeger StrikerEureka = new Jaeger();
        Jaeger ChernoAlfa = new Jaeger();

        StrikerEureka.setModelName("Striker Eureka");
        StrikerEureka.setMark("Mark-5");
        StrikerEureka.setOrigin("Australia");
        StrikerEureka.setHeight(76.2f);
        StrikerEureka.setWeight(1.850f);
        StrikerEureka.setSpeed(10);
        StrikerEureka.setStrength(10);
        StrikerEureka.setArmor(9);

        ChernoAlfa.setModelName("ChernoAlfa");
        ChernoAlfa.setMark("Mark-1");
        ChernoAlfa.setOrigin("Russia");
        ChernoAlfa.setHeight(85.34f);
        ChernoAlfa.setWeight(24.12f);
        ChernoAlfa.setSpeed(3);
        ChernoAlfa.setStrength(10);
        ChernoAlfa.setArmor(10);

        //сделано с помощью конструктора
//        Jaeger StrikerEureka = new Jaeger("Striker Eureka", "Mark-5", "Australia", 76.2f, 1.850f, 10,10,9 );
//        Jaeger ChernoAlfa = new Jaeger("ChernoAlfa", "Mark-1", "Russia", 85.34f,24.12f,3,10,10 );



    }
}
