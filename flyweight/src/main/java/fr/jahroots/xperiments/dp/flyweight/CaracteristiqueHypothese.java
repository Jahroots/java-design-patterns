package fr.jahroots.xperiments.dp.flyweight;

/**
 * CaracteristiqueHypothese
 * Created by ruddy on 20/03/2016.
 */
public class CaracteristiqueHypothese implements OIH {
    private String name;
    private OihType type;
    private Double numberValue;
    private String stringValue;
    private Boolean booleanValue;


    @Override
    public Object getValue() {
        Object value = null;
        if (type == OihType.NUMBER) {
            value = type.getValue(numberValue);
        } else if (type == OihType.STRING) {
            value = type.getValue(stringValue);
        } else if (type == OihType.BOOLEAN) {
            value = type.getValue(booleanValue);
        }
        return value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getNumberValue() {
        return numberValue;
    }

    public void setNumberValue(Double numberValue) {
        this.numberValue = numberValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public Boolean getBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public OihType getType() {
        return type;
    }

    public void setType(OihType type) {
        this.type = type;
    }
}
