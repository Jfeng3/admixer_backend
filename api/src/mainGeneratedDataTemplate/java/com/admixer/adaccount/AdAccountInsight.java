
package com.admixer.adaccount;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from api/src/main/pegasus/com/admixer/adaccount/AdAccountInsight.pdl.")
public class AdAccountInsight
    extends RecordTemplate
{

    private final static AdAccountInsight.Fields _fields = new AdAccountInsight.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.admixer.adaccount,record AdAccountInsight{adAccountId:long,impressionCount:long}", SchemaFormatType.PDL));
    private Long _adAccountIdField = null;
    private Long _impressionCountField = null;
    private AdAccountInsight.ChangeListener __changeListener = new AdAccountInsight.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_AdAccountId = SCHEMA.getField("adAccountId");
    private final static RecordDataSchema.Field FIELD_ImpressionCount = SCHEMA.getField("impressionCount");

    public AdAccountInsight() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public AdAccountInsight(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static AdAccountInsight.Fields fields() {
        return _fields;
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for adAccountId
     * 
     * @see AdAccountInsight.Fields#adAccountId
     */
    public boolean hasAdAccountId() {
        if (_adAccountIdField!= null) {
            return true;
        }
        return super._map.containsKey("adAccountId");
    }

    /**
     * Remover for adAccountId
     * 
     * @see AdAccountInsight.Fields#adAccountId
     */
    public void removeAdAccountId() {
        super._map.remove("adAccountId");
    }

    /**
     * Getter for adAccountId
     * 
     * @see AdAccountInsight.Fields#adAccountId
     */
    public Long getAdAccountId(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAdAccountId();
            case DEFAULT:
            case NULL:
                if (_adAccountIdField!= null) {
                    return _adAccountIdField;
                } else {
                    Object __rawValue = super._map.get("adAccountId");
                    _adAccountIdField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _adAccountIdField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for adAccountId
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AdAccountInsight.Fields#adAccountId
     */
    @Nonnull
    public Long getAdAccountId() {
        if (_adAccountIdField!= null) {
            return _adAccountIdField;
        } else {
            Object __rawValue = super._map.get("adAccountId");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("adAccountId");
            }
            _adAccountIdField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _adAccountIdField;
        }
    }

    /**
     * Setter for adAccountId
     * 
     * @see AdAccountInsight.Fields#adAccountId
     */
    public AdAccountInsight setAdAccountId(Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAdAccountId(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field adAccountId of com.admixer.adaccount.AdAccountInsight");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "adAccountId", DataTemplateUtil.coerceLongInput(value));
                    _adAccountIdField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAdAccountId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "adAccountId", DataTemplateUtil.coerceLongInput(value));
                    _adAccountIdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "adAccountId", DataTemplateUtil.coerceLongInput(value));
                    _adAccountIdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for adAccountId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AdAccountInsight.Fields#adAccountId
     */
    public AdAccountInsight setAdAccountId(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field adAccountId of com.admixer.adaccount.AdAccountInsight to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "adAccountId", DataTemplateUtil.coerceLongInput(value));
            _adAccountIdField = value;
        }
        return this;
    }

    /**
     * Setter for adAccountId
     * 
     * @see AdAccountInsight.Fields#adAccountId
     */
    public AdAccountInsight setAdAccountId(long value) {
        CheckedUtil.putWithoutChecking(super._map, "adAccountId", DataTemplateUtil.coerceLongInput(value));
        _adAccountIdField = value;
        return this;
    }

    /**
     * Existence checker for impressionCount
     * 
     * @see AdAccountInsight.Fields#impressionCount
     */
    public boolean hasImpressionCount() {
        if (_impressionCountField!= null) {
            return true;
        }
        return super._map.containsKey("impressionCount");
    }

    /**
     * Remover for impressionCount
     * 
     * @see AdAccountInsight.Fields#impressionCount
     */
    public void removeImpressionCount() {
        super._map.remove("impressionCount");
    }

    /**
     * Getter for impressionCount
     * 
     * @see AdAccountInsight.Fields#impressionCount
     */
    public Long getImpressionCount(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getImpressionCount();
            case DEFAULT:
            case NULL:
                if (_impressionCountField!= null) {
                    return _impressionCountField;
                } else {
                    Object __rawValue = super._map.get("impressionCount");
                    _impressionCountField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _impressionCountField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for impressionCount
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AdAccountInsight.Fields#impressionCount
     */
    @Nonnull
    public Long getImpressionCount() {
        if (_impressionCountField!= null) {
            return _impressionCountField;
        } else {
            Object __rawValue = super._map.get("impressionCount");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("impressionCount");
            }
            _impressionCountField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _impressionCountField;
        }
    }

    /**
     * Setter for impressionCount
     * 
     * @see AdAccountInsight.Fields#impressionCount
     */
    public AdAccountInsight setImpressionCount(Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setImpressionCount(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field impressionCount of com.admixer.adaccount.AdAccountInsight");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "impressionCount", DataTemplateUtil.coerceLongInput(value));
                    _impressionCountField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeImpressionCount();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "impressionCount", DataTemplateUtil.coerceLongInput(value));
                    _impressionCountField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "impressionCount", DataTemplateUtil.coerceLongInput(value));
                    _impressionCountField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for impressionCount
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AdAccountInsight.Fields#impressionCount
     */
    public AdAccountInsight setImpressionCount(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field impressionCount of com.admixer.adaccount.AdAccountInsight to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "impressionCount", DataTemplateUtil.coerceLongInput(value));
            _impressionCountField = value;
        }
        return this;
    }

    /**
     * Setter for impressionCount
     * 
     * @see AdAccountInsight.Fields#impressionCount
     */
    public AdAccountInsight setImpressionCount(long value) {
        CheckedUtil.putWithoutChecking(super._map, "impressionCount", DataTemplateUtil.coerceLongInput(value));
        _impressionCountField = value;
        return this;
    }

    @Override
    public AdAccountInsight clone()
        throws CloneNotSupportedException
    {
        AdAccountInsight __clone = ((AdAccountInsight) super.clone());
        __clone.__changeListener = new AdAccountInsight.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public AdAccountInsight copy()
        throws CloneNotSupportedException
    {
        AdAccountInsight __copy = ((AdAccountInsight) super.copy());
        __copy._adAccountIdField = null;
        __copy._impressionCountField = null;
        __copy.__changeListener = new AdAccountInsight.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final AdAccountInsight __objectRef;

        private ChangeListener(AdAccountInsight reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "adAccountId":
                    __objectRef._adAccountIdField = null;
                    break;
                case "impressionCount":
                    __objectRef._impressionCountField = null;
                    break;
            }
        }

    }

    public static class Fields
        extends PathSpec
    {


        public Fields(List<String> path, String name) {
            super(path, name);
        }

        public Fields() {
            super();
        }

        public PathSpec adAccountId() {
            return new PathSpec(getPathComponents(), "adAccountId");
        }

        public PathSpec impressionCount() {
            return new PathSpec(getPathComponents(), "impressionCount");
        }

    }

}
