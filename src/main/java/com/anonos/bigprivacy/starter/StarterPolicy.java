package com.anonos.bigprivacy.starter;

import com.anonos.bigprivacy.privacypolicyapi.DataType;
import com.anonos.bigprivacy.privacypolicyapi.Field;
import com.anonos.bigprivacy.privacypolicyapi.RuleExecutionException;
import com.anonos.bigprivacy.privacypolicyapi.PrivacyPolicy;
import com.anonos.bigprivacy.privacypolicyapi.PrivacyPolicyRule;

import java.util.List;
import java.util.Set;

public class StarterPolicy implements PrivacyPolicy {

    public String getId() {
        return null;
    }

    public String getName() {
        return null;
    }

    public String getDescription() {
        return null;
    }

    public Set<DataType> getInputTypes() {
        return null;
    }

    public List<PrivacyPolicyRule> getRules() {
        return null;
    }

    private static class StarterRule implements PrivacyPolicyRule {
        public String getName() {
            return null;
        }

        public String getResult(Object o, List<Field> list, List<Object> list1) throws RuleExecutionException {
            return null;
        }
    }
}
