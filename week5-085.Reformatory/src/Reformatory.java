
public class Reformatory {
private int i = 0;
    public int weight(Person person) {
        // return the weight of the person
        i++;
        return person.getWeight();
    }

    public void feed(Person person) {
        int n = (this.weight(person)) + 1;
        person.setWeight(n);
    }

    public int totalWeightsMeasured() {
        
        return i;
    }
}
