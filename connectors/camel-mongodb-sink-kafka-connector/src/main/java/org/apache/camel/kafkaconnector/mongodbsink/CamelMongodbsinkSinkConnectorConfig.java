/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.mongodbsink;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelMongodbsinkSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_MONGODBSINK_KAMELET_HOSTS_CONF = "camel.kamelet.mongodb-sink.hosts";
    public static final String CAMEL_SINK_MONGODBSINK_KAMELET_HOSTS_DOC = "Comma separated list of MongoDB Host Addresses in host:port format.";
    public static final String CAMEL_SINK_MONGODBSINK_KAMELET_HOSTS_DEFAULT = null;
    public static final String CAMEL_SINK_MONGODBSINK_KAMELET_COLLECTION_CONF = "camel.kamelet.mongodb-sink.collection";
    public static final String CAMEL_SINK_MONGODBSINK_KAMELET_COLLECTION_DOC = "Sets the name of the MongoDB collection to bind to this endpoint.";
    public static final String CAMEL_SINK_MONGODBSINK_KAMELET_COLLECTION_DEFAULT = null;
    public static final String CAMEL_SINK_MONGODBSINK_KAMELET_PASSWORD_CONF = "camel.kamelet.mongodb-sink.password";
    public static final String CAMEL_SINK_MONGODBSINK_KAMELET_PASSWORD_DOC = "User password for accessing MongoDB.";
    public static final String CAMEL_SINK_MONGODBSINK_KAMELET_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_MONGODBSINK_KAMELET_USERNAME_CONF = "camel.kamelet.mongodb-sink.username";
    public static final String CAMEL_SINK_MONGODBSINK_KAMELET_USERNAME_DOC = "Username for accessing MongoDB.";
    public static final String CAMEL_SINK_MONGODBSINK_KAMELET_USERNAME_DEFAULT = null;
    public static final String CAMEL_SINK_MONGODBSINK_KAMELET_DATABASE_CONF = "camel.kamelet.mongodb-sink.database";
    public static final String CAMEL_SINK_MONGODBSINK_KAMELET_DATABASE_DOC = "Sets the name of the MongoDB database to target.";
    public static final String CAMEL_SINK_MONGODBSINK_KAMELET_DATABASE_DEFAULT = null;
    public static final String CAMEL_SINK_MONGODBSINK_KAMELET_WRITE_CONCERN_CONF = "camel.kamelet.mongodb-sink.writeConcern";
    public static final String CAMEL_SINK_MONGODBSINK_KAMELET_WRITE_CONCERN_DOC = "Configure the level of acknowledgment requested from MongoDB for write operations, possible values are ACKNOWLEDGED, W1, W2, W3, UNACKNOWLEDGED, JOURNALED, MAJORITY.";
    public static final String CAMEL_SINK_MONGODBSINK_KAMELET_WRITE_CONCERN_DEFAULT = null;
    public static final String CAMEL_SINK_MONGODBSINK_KAMELET_CREATE_COLLECTION_CONF = "camel.kamelet.mongodb-sink.createCollection";
    public static final String CAMEL_SINK_MONGODBSINK_KAMELET_CREATE_COLLECTION_DOC = "Create collection during initialisation if it doesn't exist.";
    public static final Boolean CAMEL_SINK_MONGODBSINK_KAMELET_CREATE_COLLECTION_DEFAULT = false;

    public CamelMongodbsinkSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelMongodbsinkSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_MONGODBSINK_KAMELET_HOSTS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MONGODBSINK_KAMELET_HOSTS_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_MONGODBSINK_KAMELET_HOSTS_DOC);
        conf.define(CAMEL_SINK_MONGODBSINK_KAMELET_COLLECTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MONGODBSINK_KAMELET_COLLECTION_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_MONGODBSINK_KAMELET_COLLECTION_DOC);
        conf.define(CAMEL_SINK_MONGODBSINK_KAMELET_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_MONGODBSINK_KAMELET_PASSWORD_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_MONGODBSINK_KAMELET_PASSWORD_DOC);
        conf.define(CAMEL_SINK_MONGODBSINK_KAMELET_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MONGODBSINK_KAMELET_USERNAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_MONGODBSINK_KAMELET_USERNAME_DOC);
        conf.define(CAMEL_SINK_MONGODBSINK_KAMELET_DATABASE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MONGODBSINK_KAMELET_DATABASE_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_MONGODBSINK_KAMELET_DATABASE_DOC);
        conf.define(CAMEL_SINK_MONGODBSINK_KAMELET_WRITE_CONCERN_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MONGODBSINK_KAMELET_WRITE_CONCERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MONGODBSINK_KAMELET_WRITE_CONCERN_DOC);
        conf.define(CAMEL_SINK_MONGODBSINK_KAMELET_CREATE_COLLECTION_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MONGODBSINK_KAMELET_CREATE_COLLECTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MONGODBSINK_KAMELET_CREATE_COLLECTION_DOC);
        return conf;
    }
}