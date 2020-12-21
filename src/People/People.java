package People;


public class People {
    private String name;
    private People father;
    private People mother;
   

    public People(String name){
        this.name = name;

    }
    public People(String name, People father, People mother){
        this.name = name;
        this.father = father;
        this.mother = mother;
    }


    @Override
    public String toString() {
        String result = "Person name: " + name + ", ";
        result += "Father: " +( this.father != null ? this.father.name : " none" )+ ", ";
        result += "Mother: " + (this.mother != null ? this.mother.name : "none") ;
        return result;

    }
}
