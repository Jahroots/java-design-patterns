package fr.jahroots.xperiments.dp.flyweight;

import java.util.Objects;

/**
 * OihType
 * Created by ruddy on 20/03/2016.
 */
public enum OihType {
    NUMBER {
        @Override
        public Double getValue(final Object pValue) {
            Double value = null;
            if (Objects.nonNull(pValue) && pValue instanceof Number) {
                value = (Double) pValue;
            }
            return value;
        }
    }, STRING {
        @Override
        public String getValue(final Object pValue) {
            String value = null;
            if (Objects.nonNull(pValue) && pValue instanceof String) {
                value = (String) pValue;
            }
            return value;
        }
    }, BOOLEAN {
        @Override
        public Boolean getValue(final Object pValue) {
            Boolean value = null;
            if (Objects.nonNull(pValue) && pValue instanceof Boolean) {
                value = (Boolean) pValue;
            }
            return value;
        }
    };

    public abstract <T> T getValue(Object value);
}
