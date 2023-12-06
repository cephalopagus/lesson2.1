public class Parents extends Relatives{
    private String name;
    private int age;
    private String profession;
    private Action action;

    public Parents(String name, int age, String profession, Action action) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }

    public Action getAction() {
        return action;
    }

    public void PrintSmt() {
        System.out.println(name+ " поспал!");
    }

    public final void PrintSmt(String str, int count) {
        System.out.println(name+ " сделал "+ str + " за " + count + " минут!");
    }
    public void PrintText(){
        System.out.println(name+"   "+age+"    "+profession+"   "+action);
    }
}
