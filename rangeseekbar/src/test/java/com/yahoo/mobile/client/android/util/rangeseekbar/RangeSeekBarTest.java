package com.yahoo.mobile.client.android.util.rangeseekbar;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class RangeSeekBarTest {

    @Test
    public void rsb_should_handle_long_values() {
        RangeSeekBar<Long> mSeekBar = new RangeSeekBar<>(RuntimeEnvironment.application);
        // Set up the seek bar
        mSeekBar.setRangeValues(0L, 100L);
        long minValue = mSeekBar.getAbsoluteMinValue();
        Assert.assertEquals(0L, minValue);
        long maxValue = mSeekBar.getAbsoluteMaxValue();
        Assert.assertEquals(100L, maxValue);
    }

}