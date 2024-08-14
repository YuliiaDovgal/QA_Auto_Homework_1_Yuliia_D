public class CircusPerformer {
    String name;
    String act;
    int experience;

    public CircusPerformer(String name, String act, int experience) throws InvalidExperienceException {
        if (experience < 0 || experience > 50) {
            throw new InvalidExperienceException("Experience must be between 0 and 50 years.");
        }
        this.name = name;
        this.act = act;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) throws InvalidExperienceException {
        if (experience < 0 || experience > 50) {
            throw new InvalidExperienceException("Experience must be between 0 and 50 years.");
        }
        this.experience = experience;
    }

    @RunImmediately(times = 1)
    public void printPerformerInfo() {
        System.out.println("Name: " + name + ", Act: " + act + ", Experience: " + experience + " years");
    }
}