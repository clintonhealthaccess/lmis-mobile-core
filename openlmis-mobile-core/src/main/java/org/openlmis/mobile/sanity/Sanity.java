package org.openlmis.mobile.sanity;

/**
 * This is just a sanity check class to make sure the project set up is ok.
 */
public class Sanity {

    private int abc;

    /**
     * Constructor for project set up.
     *
     * @param a this is just for test coverage purposes.
     */
    public Sanity(int a) {
        int b = 2;
        if (a == b) {
            a = 3;
        }
    }
}
