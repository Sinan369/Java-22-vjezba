package vehicle;

public class Cars {
    private String carName;

    public void setCarName(String auto){
        carName = auto;
        switch (auto){
            case "BMW", "Mercedes", "Audi":
                System.out.println("Auto koji ste unijeli je: " + auto + " i on je Njemačke proizvodnje");
                break;
            case "Pezo", "Renault":
                System.out.println("Auto koji ste unijeli je: " + auto + " i on je Francuske proizvodnje");
                break;
            case "Škoda":
                System.out.println("Auto koji ste unijeli je: " + auto + " i on je Češke proizvodnje");
                break;
        }
    }
}
