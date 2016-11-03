package com.anonos.bigprivacy.starter;

import com.anonos.bigprivacy.privacypolicyapi.DataType;
import com.anonos.bigprivacy.privacypolicyapi.PrivacyPolicy;
import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

public class StarterPolicyTest {

    /**
     * A simple test to ensure that the policy can accept at least one data type.
     */
    @Test
    public void testDataTypes() {
        final PrivacyPolicy policy = new StarterPolicy();
        final Set<DataType> dataTypes = policy.getInputTypes();
        Assert.assertNotNull("Data types set is not null", dataTypes);
        Assert.assertFalse("Data types set contains at least one element", dataTypes.isEmpty());
    }
}
