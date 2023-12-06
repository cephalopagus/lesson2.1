public final class ParentName extends Parents{
    private String name;
    private int age;
    private String profession;
    private Action action;

    public ParentName(String name, int age, String profession, Action action) {
        super(name, age, profession, action);
        this.name = name;
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


    @Override
    public void PrintSmt() {
        System.out.println(name+ " поспал, но очень мало!");
    }

    @Override
    public void PrintText() {
        super.PrintText();
    }
}
