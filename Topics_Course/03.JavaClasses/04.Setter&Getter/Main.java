public class Main {
    public static void main(String[] args) {
        SetGet getset = new SetGet();
        getset.setName("John");
        getset.setAge(50);
        System.out.println(getset.getName() + ", age is "+getset.getAge());
    }
}
