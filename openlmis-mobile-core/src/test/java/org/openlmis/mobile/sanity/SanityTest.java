package org.openlmis.mobile.sanity;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class SanityTest {
    @Test
    public void oneShouldBeOne() throws Exception {
        Sanity sanity = new Sanity(2);
        Sanity sanity1 = new Sanity(3);

        assertNotNull(sanity);
        assertNotNull(sanity1);

        assertThat(1, is(1));
    }

    @Test
    public void anotherTest() throws Exception {
        Sanity sanity = new Sanity(2);

        assertThat(sanity.getHaha(), is(5));
        assertThat(2, is(2));
    }
}
