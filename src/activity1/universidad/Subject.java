package activity1.universidad;

public class Subject implements SubjectMethods {
    static final String DEFAULT_NAME_PROFESSOR = "Mario Alfredo Sánchez";
    private String nameP ;
    private String professorP;
    private int subjectIdP;
    private final int classroomP;
    public Subject(
        String nameP,
        String professorP,
        int subjectIdP,
        int classroomP
    ){
        this.nameP = nameP;
        if(!professorP.isEmpty()) this.professorP = professorP; else this.professorP = DEFAULT_NAME_PROFESSOR;
        this.subjectIdP = subjectIdP;
        this.classroomP = classroomP;

        if (subjectIdP < 0 && classroomP < 0) {
            throw new IllegalArgumentException("La materia necesita el código de la materia y el salón de clases");
        }
    }

    @Override
    public String toString() {
        return "La asignatura "+ this.nameP +" con código "+ this.subjectIdP +
                " es dictada por el profesor \n"+ this.professorP +" en el salón "+ this.classroomP+".";
    }

    @Override
    public String getName() {
        return this.nameP;
    }

    @Override
    public void setName(String name) {
        this.nameP = name;
    }

    @Override
    public String getProfessor() {
        return this.professorP;
    }

    @Override
    public void setProfessor(String professor) {
        this.professorP = professor;
    }

    @Override
    public int getSubjectId() {
        return this.subjectIdP;
    }

    @Override
    public void setSubjectId(int subjectId) {
        this.subjectIdP = subjectId;
    }

    @Override
    public int getClassroom() {
        return this.classroomP;
    }
}
