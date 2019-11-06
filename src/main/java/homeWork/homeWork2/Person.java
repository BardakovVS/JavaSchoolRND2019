package homeWork.homeWork2;

public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    /**
     * This method checks gender of persons. If genders are not equal - tries to marry.
     * If one of them has another spouse - execute divorce(sets spouse = null for husband and wife. Example: if both persons have spouses - then divorce will set 4 spouse to null) and then executes marry().
     *
     * @param person - new husband/wife for this person.
     * @return - returns true if this person has another gender than passed person and they are not husband and wife, false otherwise
     */
    public boolean marry(Person person) {
        if (this.man != person.man) {
            if (this.spouse != null && person.spouse != null && this.spouse == person){
                System.out.println(String.format("%s и %s и так состоят в браке...", this.name, this.spouse.name));
                return true;
            } else {
                this.divorce();
                person.divorce();
                this.spouse = person;
                person.spouse = this;
                System.out.println(String.format("Граждане %s и %s вступили в законный брак...", this.name, this.spouse.name));
                return true;
            }
        } else {
            System.out.println(String.format("%s и %s однополые браки запрещены в РФ!!!", this.name, person.name));
            return false;
        }
    }

    /**
     * Sets spouse = null if spouse is not null
     *
     * @return true - if person status has been changed
     */
    public boolean divorce() {
        if (this.spouse != null) {
            System.out.println(String.format("%s развелся с %s", this.name, this.spouse.name));
            this.spouse.spouse = null;
            this.spouse = null;
            return true;
        } else {
            System.out.println(String.format("%s - не состоит в браке%n", this.name));
            return false;
        }
    }

    public Person getSpouse() {
        return spouse;
    }
}
