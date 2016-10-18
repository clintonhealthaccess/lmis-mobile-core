package org.openlmis.mobile.sanity;

import org.junit.Test;
import org.openlmis.mobile.sanity.Sanity;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SanityTest {
    @Test
    public void oneShouldBeOne() throws Exception {
        new Sanity(2);
        new Sanity(3);
        assertThat(1, is(1));
    }
}