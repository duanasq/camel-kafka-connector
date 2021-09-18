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
package org.apache.camel.kafkaconnector.awskinesissink;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAwskinesissinkSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_AWSKINESISSINK_KAMELET_STREAM_CONF = "camel.kamelet.aws-kinesis-sink.stream";
    public static final String CAMEL_SINK_AWSKINESISSINK_KAMELET_STREAM_DOC = "The Kinesis stream that you want to access (needs to be created in advance)";
    public static final String CAMEL_SINK_AWSKINESISSINK_KAMELET_STREAM_DEFAULT = null;
    public static final String CAMEL_SINK_AWSKINESISSINK_KAMELET_ACCESS_KEY_CONF = "camel.kamelet.aws-kinesis-sink.accessKey";
    public static final String CAMEL_SINK_AWSKINESISSINK_KAMELET_ACCESS_KEY_DOC = "The access key obtained from AWS";
    public static final String CAMEL_SINK_AWSKINESISSINK_KAMELET_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AWSKINESISSINK_KAMELET_SECRET_KEY_CONF = "camel.kamelet.aws-kinesis-sink.secretKey";
    public static final String CAMEL_SINK_AWSKINESISSINK_KAMELET_SECRET_KEY_DOC = "The secret key obtained from AWS";
    public static final String CAMEL_SINK_AWSKINESISSINK_KAMELET_SECRET_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AWSKINESISSINK_KAMELET_REGION_CONF = "camel.kamelet.aws-kinesis-sink.region";
    public static final String CAMEL_SINK_AWSKINESISSINK_KAMELET_REGION_DOC = "The AWS region to connect to Example: eu-west-1";
    public static final String CAMEL_SINK_AWSKINESISSINK_KAMELET_REGION_DEFAULT = null;

    public CamelAwskinesissinkSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAwskinesissinkSinkConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_AWSKINESISSINK_KAMELET_STREAM_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSKINESISSINK_KAMELET_STREAM_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_AWSKINESISSINK_KAMELET_STREAM_DOC);
        conf.define(CAMEL_SINK_AWSKINESISSINK_KAMELET_ACCESS_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_AWSKINESISSINK_KAMELET_ACCESS_KEY_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_AWSKINESISSINK_KAMELET_ACCESS_KEY_DOC);
        conf.define(CAMEL_SINK_AWSKINESISSINK_KAMELET_SECRET_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_AWSKINESISSINK_KAMELET_SECRET_KEY_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_AWSKINESISSINK_KAMELET_SECRET_KEY_DOC);
        conf.define(CAMEL_SINK_AWSKINESISSINK_KAMELET_REGION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSKINESISSINK_KAMELET_REGION_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_AWSKINESISSINK_KAMELET_REGION_DOC);
        return conf;
    }
}