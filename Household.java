package q1;

import java.text.NumberFormat;

/**
 * <p>This class contains all the instance data and methods that
 * can be used to construct a household.</p>
 *
 * @author Wesley Sura, Set E
 * @version 1.0
 */
public class Household {
    /**
     * <p>Instance data for id.</p>
     */
    private int id;
    /**
     * <p>Instance data for income.</p>
     */
    private double income;
    /**
     * <p>Instance data for people.</p>
     */
    private int people;
    /**
     * <p>A variable made to format numbers as a currency.</p>
     */
    private NumberFormat numForm = NumberFormat.getCurrencyInstance();
    /**
     * <p>Household constructor.</p>
     * @param id the id
     * @param income the income
     * @param people the number of people
     */
    public Household(int id, double income, int people) {
        this.id = id;
        this.income = income;
        this.people = people;
    }
    /**
     * <p>Method used to return the info of each household.</p>
     * @return string
     */
    public String toString() {
        return "" + id + "\t\t\t\t" + numForm.format(income) 
                + "\t\t\t" + people;
    }
    /**
     * <p>Method used for getting each income.</p>
     * @return income
     */
    public double getIncome() {
        return income;
    }
    /**
     * <p>Method used for getting each ID.</p>
     * @return id
     */
    public int getId() {
        return id;
    }
    /**
     * <p>Method used for getting people in each household.</p>
     * @return people
     */
    public int getPeople() {
        return people;
    }
};
