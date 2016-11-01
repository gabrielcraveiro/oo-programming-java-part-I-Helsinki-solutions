/**
 *
 * @author Gabriel
 */
public class Student {
    private String name;
    private String studentNumber;
    
    public Student(String nome, String numero){
        this.name = nome;
        this.studentNumber = numero;
    }

    public String getName() {
        return this.name;
    }

    public String getStudentNumber() {
        return this.studentNumber;
    }

    public String toString() {
    return this.name + " ("+this.studentNumber+")";
}
}
