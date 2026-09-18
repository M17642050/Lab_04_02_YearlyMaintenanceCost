public class Main {
    public static void main (String[] args) {
        double springCost = 553.5;
        double summerCost = 777.0;
        double fallCost = 450.21;
        double winterCost = 307.68;
        double yearlyCost = springCost + summerCost + fallCost + winterCost;
        System.out.println("The seasonal home maintenance costs for Spring: " + springCost);
        System.out.println("The seasonal home maintenance costs for Summer: " + summerCost);
        System.out.println("The seasonal home maintenance costs for Fall: " + fallCost);
        System.out.println("The seasonal home maintenance costs for Winter: " + winterCost);
        System.out.println("The total yearly home maintenance costs: " + yearlyCost);
    }
}