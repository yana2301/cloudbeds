/**
 * Autogenerated by Avro
 * <p>
 * DO NOT EDIT DIRECTLY
 */
package com.cloudbeds.assignment.api.model;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@org.apache.avro.specific.AvroGenerated
public class Address extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    private static final long serialVersionUID = -2104633094887330830L;


    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Address\",\"namespace\":\"com.cloudbeds.assignment.grpc.model\",\"fields\":[{\"name\":\"addressLine1\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"addressLine2\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"city\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"state\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"zipcode\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"country\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    private static final SpecificData MODEL$ = new SpecificData();

    private static final BinaryMessageEncoder<Address> ENCODER =
            new BinaryMessageEncoder<Address>(MODEL$, SCHEMA$);

    private static final BinaryMessageDecoder<Address> DECODER =
            new BinaryMessageDecoder<Address>(MODEL$, SCHEMA$);

    /**
     * Return the BinaryMessageEncoder instance used by this class.
     * @return the message encoder used by this class
     */
    public static BinaryMessageEncoder<Address> getEncoder() {
        return ENCODER;
    }

    /**
     * Return the BinaryMessageDecoder instance used by this class.
     * @return the message decoder used by this class
     */
    public static BinaryMessageDecoder<Address> getDecoder() {
        return DECODER;
    }

    /**
     * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
     * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
     * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
     */
    public static BinaryMessageDecoder<Address> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder<Address>(MODEL$, SCHEMA$, resolver);
    }

    /**
     * Serializes this Address to a ByteBuffer.
     * @return a buffer holding the serialized data for this instance
     * @throws java.io.IOException if this instance could not be serialized
     */
    public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
        return ENCODER.encode(this);
    }

    /**
     * Deserializes a Address from a ByteBuffer.
     * @param b a byte buffer holding serialized data for an instance of this class
     * @return a Address instance decoded from the given buffer
     * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
     */
    public static Address fromByteBuffer(
            java.nio.ByteBuffer b) throws java.io.IOException {
        return DECODER.decode(b);
    }

    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zipcode;
    private String country;

    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public Address() {
    }

    /**
     * All-args constructor.
     * @param addressLine1 The new value for addressLine1
     * @param addressLine2 The new value for addressLine2
     * @param city The new value for city
     * @param state The new value for state
     * @param zipcode The new value for zipcode
     * @param country The new value for country
     */
    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode, String country) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
    }

    public SpecificData getSpecificData() {
        return MODEL$;
    }

    public org.apache.avro.Schema getSchema() {
        return SCHEMA$;
    }

    // Used by DatumWriter.  Applications should not call.
    public Object get(int field$) {
        switch (field$) {
            case 0:
                return addressLine1;
            case 1:
                return addressLine2;
            case 2:
                return city;
            case 3:
                return state;
            case 4:
                return zipcode;
            case 5:
                return country;
            default:
                throw new IndexOutOfBoundsException("Invalid index: " + field$);
        }
    }

    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value = "unchecked")
    public void put(int field$, Object value$) {
        switch (field$) {
            case 0:
                addressLine1 = value$ != null ? value$.toString() : null;
                break;
            case 1:
                addressLine2 = value$ != null ? value$.toString() : null;
                break;
            case 2:
                city = value$ != null ? value$.toString() : null;
                break;
            case 3:
                state = value$ != null ? value$.toString() : null;
                break;
            case 4:
                zipcode = value$ != null ? value$.toString() : null;
                break;
            case 5:
                country = value$ != null ? value$.toString() : null;
                break;
            default:
                throw new IndexOutOfBoundsException("Invalid index: " + field$);
        }
    }

    /**
     * Gets the value of the 'addressLine1' field.
     * @return The value of the 'addressLine1' field.
     */
    public String getAddressLine1() {
        return addressLine1;
    }


    /**
     * Sets the value of the 'addressLine1' field.
     * @param value the value to set.
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the 'addressLine2' field.
     * @return The value of the 'addressLine2' field.
     */
    public String getAddressLine2() {
        return addressLine2;
    }


    /**
     * Sets the value of the 'addressLine2' field.
     * @param value the value to set.
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the 'city' field.
     * @return The value of the 'city' field.
     */
    public String getCity() {
        return city;
    }


    /**
     * Sets the value of the 'city' field.
     * @param value the value to set.
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the 'state' field.
     * @return The value of the 'state' field.
     */
    public String getState() {
        return state;
    }


    /**
     * Sets the value of the 'state' field.
     * @param value the value to set.
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the 'zipcode' field.
     * @return The value of the 'zipcode' field.
     */
    public String getZipcode() {
        return zipcode;
    }


    /**
     * Sets the value of the 'zipcode' field.
     * @param value the value to set.
     */
    public void setZipcode(String value) {
        this.zipcode = value;
    }

    /**
     * Gets the value of the 'country' field.
     * @return The value of the 'country' field.
     */
    public String getCountry() {
        return country;
    }


    /**
     * Sets the value of the 'country' field.
     * @param value the value to set.
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Creates a new Address RecordBuilder.
     * @return A new Address RecordBuilder
     */
    public static Address.Builder newBuilder() {
        return new Address.Builder();
    }

    /**
     * Creates a new Address RecordBuilder by copying an existing Builder.
     * @param other The existing builder to copy.
     * @return A new Address RecordBuilder
     */
    public static Address.Builder newBuilder(Address.Builder other) {
        if (other == null) {
            return new Address.Builder();
        } else {
            return new Address.Builder(other);
        }
    }

    /**
     * Creates a new Address RecordBuilder by copying an existing Address instance.
     * @param other The existing instance to copy.
     * @return A new Address RecordBuilder
     */
    public static Address.Builder newBuilder(Address other) {
        if (other == null) {
            return new Address.Builder();
        } else {
            return new Address.Builder(other);
        }
    }

    /**
     * RecordBuilder for Address instances.
     */
    @org.apache.avro.specific.AvroGenerated
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Address>
            implements org.apache.avro.data.RecordBuilder<Address> {

        private String addressLine1;
        private String addressLine2;
        private String city;
        private String state;
        private String zipcode;
        private String country;

        /** Creates a new Builder */
        private Builder() {
            super(SCHEMA$, MODEL$);
        }

        /**
         * Creates a Builder by copying an existing Builder.
         * @param other The existing Builder to copy.
         */
        private Builder(Address.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.addressLine1)) {
                this.addressLine1 = data().deepCopy(fields()[0].schema(), other.addressLine1);
                fieldSetFlags()[0] = other.fieldSetFlags()[0];
            }
            if (isValidValue(fields()[1], other.addressLine2)) {
                this.addressLine2 = data().deepCopy(fields()[1].schema(), other.addressLine2);
                fieldSetFlags()[1] = other.fieldSetFlags()[1];
            }
            if (isValidValue(fields()[2], other.city)) {
                this.city = data().deepCopy(fields()[2].schema(), other.city);
                fieldSetFlags()[2] = other.fieldSetFlags()[2];
            }
            if (isValidValue(fields()[3], other.state)) {
                this.state = data().deepCopy(fields()[3].schema(), other.state);
                fieldSetFlags()[3] = other.fieldSetFlags()[3];
            }
            if (isValidValue(fields()[4], other.zipcode)) {
                this.zipcode = data().deepCopy(fields()[4].schema(), other.zipcode);
                fieldSetFlags()[4] = other.fieldSetFlags()[4];
            }
            if (isValidValue(fields()[5], other.country)) {
                this.country = data().deepCopy(fields()[5].schema(), other.country);
                fieldSetFlags()[5] = other.fieldSetFlags()[5];
            }
        }

        /**
         * Creates a Builder by copying an existing Address instance
         * @param other The existing instance to copy.
         */
        private Builder(Address other) {
            super(SCHEMA$, MODEL$);
            if (isValidValue(fields()[0], other.addressLine1)) {
                this.addressLine1 = data().deepCopy(fields()[0].schema(), other.addressLine1);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.addressLine2)) {
                this.addressLine2 = data().deepCopy(fields()[1].schema(), other.addressLine2);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.city)) {
                this.city = data().deepCopy(fields()[2].schema(), other.city);
                fieldSetFlags()[2] = true;
            }
            if (isValidValue(fields()[3], other.state)) {
                this.state = data().deepCopy(fields()[3].schema(), other.state);
                fieldSetFlags()[3] = true;
            }
            if (isValidValue(fields()[4], other.zipcode)) {
                this.zipcode = data().deepCopy(fields()[4].schema(), other.zipcode);
                fieldSetFlags()[4] = true;
            }
            if (isValidValue(fields()[5], other.country)) {
                this.country = data().deepCopy(fields()[5].schema(), other.country);
                fieldSetFlags()[5] = true;
            }
        }

        /**
         * Gets the value of the 'addressLine1' field.
         * @return The value.
         */
        public String getAddressLine1() {
            return addressLine1;
        }


        /**
         * Sets the value of the 'addressLine1' field.
         * @param value The value of 'addressLine1'.
         * @return This builder.
         */
        public Address.Builder setAddressLine1(String value) {
            validate(fields()[0], value);
            this.addressLine1 = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
         * Checks whether the 'addressLine1' field has been set.
         * @return True if the 'addressLine1' field has been set, false otherwise.
         */
        public boolean hasAddressLine1() {
            return fieldSetFlags()[0];
        }


        /**
         * Clears the value of the 'addressLine1' field.
         * @return This builder.
         */
        public Address.Builder clearAddressLine1() {
            addressLine1 = null;
            fieldSetFlags()[0] = false;
            return this;
        }

        /**
         * Gets the value of the 'addressLine2' field.
         * @return The value.
         */
        public String getAddressLine2() {
            return addressLine2;
        }


        /**
         * Sets the value of the 'addressLine2' field.
         * @param value The value of 'addressLine2'.
         * @return This builder.
         */
        public Address.Builder setAddressLine2(String value) {
            validate(fields()[1], value);
            this.addressLine2 = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /**
         * Checks whether the 'addressLine2' field has been set.
         * @return True if the 'addressLine2' field has been set, false otherwise.
         */
        public boolean hasAddressLine2() {
            return fieldSetFlags()[1];
        }


        /**
         * Clears the value of the 'addressLine2' field.
         * @return This builder.
         */
        public Address.Builder clearAddressLine2() {
            addressLine2 = null;
            fieldSetFlags()[1] = false;
            return this;
        }

        /**
         * Gets the value of the 'city' field.
         * @return The value.
         */
        public String getCity() {
            return city;
        }


        /**
         * Sets the value of the 'city' field.
         * @param value The value of 'city'.
         * @return This builder.
         */
        public Address.Builder setCity(String value) {
            validate(fields()[2], value);
            this.city = value;
            fieldSetFlags()[2] = true;
            return this;
        }

        /**
         * Checks whether the 'city' field has been set.
         * @return True if the 'city' field has been set, false otherwise.
         */
        public boolean hasCity() {
            return fieldSetFlags()[2];
        }


        /**
         * Clears the value of the 'city' field.
         * @return This builder.
         */
        public Address.Builder clearCity() {
            city = null;
            fieldSetFlags()[2] = false;
            return this;
        }

        /**
         * Gets the value of the 'state' field.
         * @return The value.
         */
        public String getState() {
            return state;
        }


        /**
         * Sets the value of the 'state' field.
         * @param value The value of 'state'.
         * @return This builder.
         */
        public Address.Builder setState(String value) {
            validate(fields()[3], value);
            this.state = value;
            fieldSetFlags()[3] = true;
            return this;
        }

        /**
         * Checks whether the 'state' field has been set.
         * @return True if the 'state' field has been set, false otherwise.
         */
        public boolean hasState() {
            return fieldSetFlags()[3];
        }


        /**
         * Clears the value of the 'state' field.
         * @return This builder.
         */
        public Address.Builder clearState() {
            state = null;
            fieldSetFlags()[3] = false;
            return this;
        }

        /**
         * Gets the value of the 'zipcode' field.
         * @return The value.
         */
        public String getZipcode() {
            return zipcode;
        }


        /**
         * Sets the value of the 'zipcode' field.
         * @param value The value of 'zipcode'.
         * @return This builder.
         */
        public Address.Builder setZipcode(String value) {
            validate(fields()[4], value);
            this.zipcode = value;
            fieldSetFlags()[4] = true;
            return this;
        }

        /**
         * Checks whether the 'zipcode' field has been set.
         * @return True if the 'zipcode' field has been set, false otherwise.
         */
        public boolean hasZipcode() {
            return fieldSetFlags()[4];
        }


        /**
         * Clears the value of the 'zipcode' field.
         * @return This builder.
         */
        public Address.Builder clearZipcode() {
            zipcode = null;
            fieldSetFlags()[4] = false;
            return this;
        }

        /**
         * Gets the value of the 'country' field.
         * @return The value.
         */
        public String getCountry() {
            return country;
        }


        /**
         * Sets the value of the 'country' field.
         * @param value The value of 'country'.
         * @return This builder.
         */
        public Address.Builder setCountry(String value) {
            validate(fields()[5], value);
            this.country = value;
            fieldSetFlags()[5] = true;
            return this;
        }

        /**
         * Checks whether the 'country' field has been set.
         * @return True if the 'country' field has been set, false otherwise.
         */
        public boolean hasCountry() {
            return fieldSetFlags()[5];
        }


        /**
         * Clears the value of the 'country' field.
         * @return This builder.
         */
        public Address.Builder clearCountry() {
            country = null;
            fieldSetFlags()[5] = false;
            return this;
        }

        @Override
        @SuppressWarnings("unchecked")
        public Address build() {
            try {
                Address record = new Address();
                record.addressLine1 = fieldSetFlags()[0] ? this.addressLine1 : (String) defaultValue(fields()[0]);
                record.addressLine2 = fieldSetFlags()[1] ? this.addressLine2 : (String) defaultValue(fields()[1]);
                record.city = fieldSetFlags()[2] ? this.city : (String) defaultValue(fields()[2]);
                record.state = fieldSetFlags()[3] ? this.state : (String) defaultValue(fields()[3]);
                record.zipcode = fieldSetFlags()[4] ? this.zipcode : (String) defaultValue(fields()[4]);
                record.country = fieldSetFlags()[5] ? this.country : (String) defaultValue(fields()[5]);
                return record;
            } catch (org.apache.avro.AvroMissingFieldException e) {
                throw e;
            } catch (Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumWriter<Address>
            WRITER$ = (org.apache.avro.io.DatumWriter<Address>) MODEL$.createDatumWriter(SCHEMA$);

    @Override
    public void writeExternal(java.io.ObjectOutput out)
            throws java.io.IOException {
        WRITER$.write(this, SpecificData.getEncoder(out));
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumReader<Address>
            READER$ = (org.apache.avro.io.DatumReader<Address>) MODEL$.createDatumReader(SCHEMA$);

    @Override
    public void readExternal(java.io.ObjectInput in)
            throws java.io.IOException {
        READER$.read(this, SpecificData.getDecoder(in));
    }

    @Override
    protected boolean hasCustomCoders() {
        return true;
    }

    @Override
    public void customEncode(org.apache.avro.io.Encoder out)
            throws java.io.IOException {
        out.writeString(this.addressLine1);

        out.writeString(this.addressLine2);

        out.writeString(this.city);

        out.writeString(this.state);

        out.writeString(this.zipcode);

        out.writeString(this.country);

    }

    @Override
    public void customDecode(org.apache.avro.io.ResolvingDecoder in)
            throws java.io.IOException {
        org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
        if (fieldOrder == null) {
            this.addressLine1 = in.readString();

            this.addressLine2 = in.readString();

            this.city = in.readString();

            this.state = in.readString();

            this.zipcode = in.readString();

            this.country = in.readString();

        } else {
            for (int i = 0; i < 6; i++) {
                switch (fieldOrder[i].pos()) {
                    case 0:
                        this.addressLine1 = in.readString();
                        break;

                    case 1:
                        this.addressLine2 = in.readString();
                        break;

                    case 2:
                        this.city = in.readString();
                        break;

                    case 3:
                        this.state = in.readString();
                        break;

                    case 4:
                        this.zipcode = in.readString();
                        break;

                    case 5:
                        this.country = in.readString();
                        break;

                    default:
                        throw new java.io.IOException("Corrupt ResolvingDecoder.");
                }
            }
        }
    }
}









