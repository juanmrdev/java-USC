package activity2.listaClase;

public record Student(
    int code,
    String name,
    float score
) {
    @Override
    public String toString(){
        return "ID: "+ code +" Name: "+ name +" Score: "+ score +"\n";
    }
}
