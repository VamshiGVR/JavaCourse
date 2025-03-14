public class SetGet {
    private String name;
    private int age;

    //Constructor
    public SetGet(String name, int age){
        this.age = age;
        this.name = name;
    }

    //Setter
    public void setName(String newName) {
        this.name = newName;
    }

    //Getter
    public String getName(){
        return name;
    }
    
    //Setter
    public void setAge(int setAge){
        this.age = setAge;
    }

    //Getter
    public int getAge(){
        return age;
    }
}

