package universidad;

public class University {

    public static void main(String[] args){
        Subject subject = new Subject(
        "APO", "Luis Álvarez", 323, 2020
        );
        subject.setProfessor("Juan Carlos");

        System.out.println(subject);
    }

}