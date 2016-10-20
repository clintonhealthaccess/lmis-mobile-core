package org.openlmis.mobile.sanity;

/**
 * This is just a sanity check class to make sure the project set up is ok.
 */
public class Sanity {

    private int haha;

    /**
     * Constructor for project set up.
     *
     * @param someThing this is just for test coverage purposes.
     */
    public Sanity(final int someThing) {
        final int somethingElse = 2;
        if (someThing == somethingElse) {
            haha = 5;
        }
    }

    /**
     * Get haha.
     *
     * @return this is just for testing static check rules
     */
    public int getHaha() {
        return haha;
    }
}
