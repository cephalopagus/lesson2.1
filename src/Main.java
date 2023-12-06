
public class Main {
    public static void main(String[] args) {

        Parents parents = new Parents("Aina", 90, "Housekeeper", Action.SLEEP);

        ParentName father = new ParentName("Jholdosh", 63,"Policeman", Action.EAT);

        ParentName mother = new ParentName("Jhipara", 63,"Doctor", Action.DRINK);


        parents.PrintText();
        father.PrintText();
        mother.PrintText();

        parents.PrintSmt();
        father.PrintSmt();
        mother.PrintSmt("Дз", 50);

    }
}