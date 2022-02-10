/**
 * Autogenerated by Avro
 * <p>
 * DO NOT EDIT DIRECTLY
 */
package com.cloudbeds.assignment.api.grpc;

@org.apache.avro.specific.AvroGenerated
public interface DataProtocol {
    public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"DataProtocol\",\"namespace\":\"com.cloudbeds.assignment.grpc\",\"types\":[{\"type\":\"record\",\"name\":\"Address\",\"namespace\":\"com.cloudbeds.assignment.grpc.model\",\"fields\":[{\"name\":\"addressLine1\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"addressLine2\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"city\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"state\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"zipcode\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"country\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"com.cloudbeds.assignment.grpc.model\",\"fields\":[{\"name\":\"firstName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"lastName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"email\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"password\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"addresses\",\"type\":{\"type\":\"array\",\"items\":\"Address\"}}]}],\"messages\":{\"getUser\":{\"request\":[{\"name\":\"id\",\"type\":\"long\"}],\"response\":\"com.cloudbeds.assignment.grpc.model.User\"},\"createUser\":{\"request\":[{\"name\":\"user\",\"type\":\"com.cloudbeds.assignment.grpc.model.User\"}],\"response\":\"long\"},\"updateUser\":{\"request\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"user\",\"type\":\"com.cloudbeds.assignment.grpc.model.User\"}],\"response\":\"null\"},\"deleteUser\":{\"request\":[{\"name\":\"id\",\"type\":\"long\"}],\"response\":\"null\"},\"findUsers\":{\"request\":[{\"name\":\"country\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"response\":{\"type\":\"array\",\"items\":\"com.cloudbeds.assignment.grpc.model.User\"}}}}");

    /**
     */
    com.cloudbeds.assignment.grpc.model.User getUser(long id);

    /**
     */
    long createUser(com.cloudbeds.assignment.grpc.model.User user);

    /**
     */
    void updateUser(long id, com.cloudbeds.assignment.grpc.model.User user);

    /**
     */
    void deleteUser(long id);

    /**
     */
    java.util.List<com.cloudbeds.assignment.grpc.model.User> findUsers(String country);

    @org.apache.avro.specific.AvroGenerated
    public interface Callback extends DataProtocol {
        public static final org.apache.avro.Protocol PROTOCOL = DataProtocol.PROTOCOL;

        /**
         * @throws java.io.IOException The async call could not be completed.
         */
        void getUser(long id, org.apache.avro.ipc.Callback<com.cloudbeds.assignment.grpc.model.User> callback) throws java.io.IOException;

        /**
         * @throws java.io.IOException The async call could not be completed.
         */
        void createUser(com.cloudbeds.assignment.grpc.model.User user, org.apache.avro.ipc.Callback<Long> callback) throws java.io.IOException;

        /**
         * @throws java.io.IOException The async call could not be completed.
         */
        void updateUser(long id, com.cloudbeds.assignment.grpc.model.User user, org.apache.avro.ipc.Callback<Void> callback) throws java.io.IOException;

        /**
         * @throws java.io.IOException The async call could not be completed.
         */
        void deleteUser(long id, org.apache.avro.ipc.Callback<Void> callback) throws java.io.IOException;

        /**
         * @throws java.io.IOException The async call could not be completed.
         */
        void findUsers(String country, org.apache.avro.ipc.Callback<java.util.List<com.cloudbeds.assignment.grpc.model.User>> callback) throws java.io.IOException;
    }
}