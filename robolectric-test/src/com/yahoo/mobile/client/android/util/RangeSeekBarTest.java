package com.yahoo.mobile.client.android.util;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@Config(emulateSdk = 18)
@RunWith(RobolectricTestRunner.class)
public class RangeSeekBarTest {

    @Test
    public void rsb_should_handle_long_values() {
        RangeSeekBar<Long> mSeekBar = new RangeSeekBar<Long>(Robolectric.application);
        // Set up the seek bar
        mSeekBar.setRangeValues(0L, 100L);
        long minValue = mSeekBar.getAbsoluteMinValue();
        Assert.assertEquals(0L, minValue);
        long maxValue = mSeekBar.getAbsoluteMaxValue();
        Assert.assertEquals(100L, maxValue);
    }
}