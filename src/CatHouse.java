public class CatHouse
{
    private Cat cat1;
    private Cat cat2;
    private String owner;

    public CatHouse(Cat cat1, Cat cat2, String owner)
    {
        this.cat1 = cat1;
        this.cat2 = cat2;
        this.owner = owner;
    }

    // MODIFY this so that the OLDEST Cat always introduces
    // themselves first!  If they have the same age, have them
    // introduce themselves alphabetically; if they have the same name AND
    // same age, then have cat1 go first
    int cat1Age = cat1.getAge();
    int cat2Age = cat2.getAge();
    int nameOrder = cat1.getName().compareTo(cat2.getName());
    public void rollCall()
    {
        if (cat1Age > cat2Age)
        {
            cat1.introduce();
        }
        else if (cat2Age > cat1Age)
        {
            cat2.introduce();
        }
        else if (cat1Age == cat2Age)
        {

        }
    }

    // IMPLEMENT this method!
    // this method causes each cat to speak by printing
    // each Cat's returned "speak()" string to the console
    public void catNoise()
    {
        /* implement me! */
    }

    // MODIFY this so that it prints each Cat's age next to its name
    // e.g. Cat 1's Name: Petunia, Age: 3
    public String toString()
    {
        String str = "Welcome to " + owner + "'s Cat House!\n";
        str += "Cat 1's Name: " + cat1.getName() + "\n";
        str += "Cat 2's Name: " + cat2.getName();

        return str;
    }
}
