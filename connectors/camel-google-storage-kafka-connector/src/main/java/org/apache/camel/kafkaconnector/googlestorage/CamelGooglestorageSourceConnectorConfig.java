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
package org.apache.camel.kafkaconnector.googlestorage;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelGooglestorageSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_GOOGLESTORAGE_PATH_BUCKET_NAME_CONF = "camel.source.path.bucketName";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_PATH_BUCKET_NAME_DOC = "Bucket name or ARN";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_PATH_BUCKET_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_AUTO_CREATE_BUCKET_CONF = "camel.source.endpoint.autoCreateBucket";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_AUTO_CREATE_BUCKET_DOC = "Setting the autocreation of the bucket bucketName.";
    public static final Boolean CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_AUTO_CREATE_BUCKET_DEFAULT = true;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SERVICE_ACCOUNT_KEY_CONF = "camel.source.endpoint.serviceAccountKey";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SERVICE_ACCOUNT_KEY_DOC = "Service account key to authenticate an application as a service account";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SERVICE_ACCOUNT_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_STORAGE_CLASS_CONF = "camel.source.endpoint.storageClass";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_STORAGE_CLASS_DOC = "The Cloud Storage class to use when creating the new buckets";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_STORAGE_CLASS_DEFAULT = "STANDARD";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_STORAGE_CLIENT_CONF = "camel.source.endpoint.storageClient";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_STORAGE_CLIENT_DOC = "The storage client";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_STORAGE_CLIENT_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_STORAGE_LOCATION_CONF = "camel.source.endpoint.storageLocation";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_STORAGE_LOCATION_DOC = "The Cloud Storage location to use when creating the new buckets";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_STORAGE_LOCATION_DEFAULT = "US-EAST1";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_DELETE_AFTER_READ_CONF = "camel.source.endpoint.deleteAfterRead";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_DELETE_AFTER_READ_DOC = "Delete objects from the bucket after they have been retrieved. The delete is only performed if the Exchange is committed. If a rollback occurs, the object is not deleted. If this option is false, then the same objects will be retrieve over and over again on the polls.";
    public static final Boolean CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_DELETE_AFTER_READ_DEFAULT = true;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_DESTINATION_BUCKET_CONF = "camel.source.endpoint.destinationBucket";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_DESTINATION_BUCKET_DOC = "Define the destination bucket where an object must be moved when moveAfterRead is set to true.";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_DESTINATION_BUCKET_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_INCLUDE_BODY_CONF = "camel.source.endpoint.includeBody";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_INCLUDE_BODY_DOC = "If it is true, the Object exchange will be consumed and put into the body. If false the Object stream will be put raw into the body and the headers will be set with the object metadata.";
    public static final Boolean CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_INCLUDE_BODY_DEFAULT = true;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_INCLUDE_FOLDERS_CONF = "camel.source.endpoint.includeFolders";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_INCLUDE_FOLDERS_DOC = "If it is true, the folders/directories will be consumed. If it is false, they will be ignored, and Exchanges will not be created for those";
    public static final Boolean CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_INCLUDE_FOLDERS_DEFAULT = true;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_MOVE_AFTER_READ_CONF = "camel.source.endpoint.moveAfterRead";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_MOVE_AFTER_READ_DOC = "Move objects from the origin bucket to a different bucket after they have been retrieved. To accomplish the operation the destinationBucket option must be set. The copy bucket operation is only performed if the Exchange is committed. If a rollback occurs, the object is not moved.";
    public static final Boolean CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_MOVE_AFTER_READ_DEFAULT = false;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_CONF = "camel.source.endpoint.sendEmptyMessageWhenIdle";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DOC = "If the polling consumer did not poll any files, you can enable this option to send an empty message (no body) instead.";
    public static final Boolean CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DEFAULT = false;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_POLL_STRATEGY_CONF = "camel.source.endpoint.pollStrategy";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_POLL_STRATEGY_DOC = "A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing you to provide your custom implementation to control error handling usually occurred during the poll operation before an Exchange have been created and being routed in Camel.";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_POLL_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_BACKOFF_ERROR_THRESHOLD_CONF = "camel.source.endpoint.backoffErrorThreshold";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DOC = "The number of subsequent error polls (failed due some error) that should happen before the backoffMultipler should kick-in.";
    public static final Integer CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_BACKOFF_IDLE_THRESHOLD_CONF = "camel.source.endpoint.backoffIdleThreshold";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DOC = "The number of subsequent idle polls that should happen before the backoffMultipler should kick-in.";
    public static final Integer CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_BACKOFF_MULTIPLIER_CONF = "camel.source.endpoint.backoffMultiplier";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_BACKOFF_MULTIPLIER_DOC = "To let the scheduled polling consumer backoff if there has been a number of subsequent idles/errors in a row. The multiplier is then the number of polls that will be skipped before the next actual attempt is happening again. When this option is in use then backoffIdleThreshold and/or backoffErrorThreshold must also be configured.";
    public static final Integer CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_BACKOFF_MULTIPLIER_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_DELAY_CONF = "camel.source.endpoint.delay";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_DELAY_DOC = "Milliseconds before the next poll.";
    public static final Long CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_DELAY_DEFAULT = 500L;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_GREEDY_CONF = "camel.source.endpoint.greedy";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_GREEDY_DOC = "If greedy is enabled, then the ScheduledPollConsumer will run immediately again, if the previous run polled 1 or more messages.";
    public static final Boolean CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_GREEDY_DEFAULT = false;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_INITIAL_DELAY_CONF = "camel.source.endpoint.initialDelay";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_INITIAL_DELAY_DOC = "Milliseconds before the first poll starts.";
    public static final Long CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_INITIAL_DELAY_DEFAULT = 1000L;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_REPEAT_COUNT_CONF = "camel.source.endpoint.repeatCount";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_REPEAT_COUNT_DOC = "Specifies a maximum limit of number of fires. So if you set it to 1, the scheduler will only fire once. If you set it to 5, it will only fire five times. A value of zero or negative means fire forever.";
    public static final Long CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_REPEAT_COUNT_DEFAULT = 0L;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_RUN_LOGGING_LEVEL_CONF = "camel.source.endpoint.runLoggingLevel";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_RUN_LOGGING_LEVEL_DOC = "The consumer logs a start/complete log line when it polls. This option allows you to configure the logging level for that. One of: [TRACE] [DEBUG] [INFO] [WARN] [ERROR] [OFF]";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_RUN_LOGGING_LEVEL_DEFAULT = "TRACE";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_CONF = "camel.source.endpoint.scheduledExecutorService";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DOC = "Allows for configuring a custom/shared thread pool to use for the consumer. By default each consumer has its own single threaded thread pool.";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SCHEDULER_CONF = "camel.source.endpoint.scheduler";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SCHEDULER_DOC = "To use a cron scheduler from either camel-spring or camel-quartz component. Use value spring or quartz for built in scheduler";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SCHEDULER_DEFAULT = "none";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SCHEDULER_PROPERTIES_CONF = "camel.source.endpoint.schedulerProperties";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SCHEDULER_PROPERTIES_DOC = "To configure additional properties when using a custom scheduler or any of the Quartz, Spring based scheduler.";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SCHEDULER_PROPERTIES_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_START_SCHEDULER_CONF = "camel.source.endpoint.startScheduler";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_START_SCHEDULER_DOC = "Whether the scheduler should be auto started.";
    public static final Boolean CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_START_SCHEDULER_DEFAULT = true;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_TIME_UNIT_CONF = "camel.source.endpoint.timeUnit";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_TIME_UNIT_DOC = "Time unit for initialDelay and delay options. One of: [NANOSECONDS] [MICROSECONDS] [MILLISECONDS] [SECONDS] [MINUTES] [HOURS] [DAYS]";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_TIME_UNIT_DEFAULT = "MILLISECONDS";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_USE_FIXED_DELAY_CONF = "camel.source.endpoint.useFixedDelay";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_USE_FIXED_DELAY_DOC = "Controls if fixed delay or fixed rate is used. See ScheduledExecutorService in JDK for details.";
    public static final Boolean CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_USE_FIXED_DELAY_DEFAULT = true;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_AUTO_CREATE_BUCKET_CONF = "camel.component.google-storage.autoCreateBucket";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_AUTO_CREATE_BUCKET_DOC = "Setting the autocreation of the bucket bucketName.";
    public static final Boolean CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_AUTO_CREATE_BUCKET_DEFAULT = true;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_CONFIGURATION_CONF = "camel.component.google-storage.configuration";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_CONFIGURATION_DOC = "The component configuration";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_SERVICE_ACCOUNT_KEY_CONF = "camel.component.google-storage.serviceAccountKey";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_SERVICE_ACCOUNT_KEY_DOC = "Service account key to authenticate an application as a service account";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_SERVICE_ACCOUNT_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_STORAGE_CLASS_CONF = "camel.component.google-storage.storageClass";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_STORAGE_CLASS_DOC = "The Cloud Storage class to use when creating the new buckets";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_STORAGE_CLASS_DEFAULT = "STANDARD";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_STORAGE_CLIENT_CONF = "camel.component.google-storage.storageClient";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_STORAGE_CLIENT_DOC = "The storage client";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_STORAGE_CLIENT_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_STORAGE_LOCATION_CONF = "camel.component.google-storage.storageLocation";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_STORAGE_LOCATION_DOC = "The Cloud Storage location to use when creating the new buckets";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_STORAGE_LOCATION_DEFAULT = "US-EAST1";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.google-storage.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_DELETE_AFTER_READ_CONF = "camel.component.google-storage.deleteAfterRead";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_DELETE_AFTER_READ_DOC = "Delete objects from the bucket after they have been retrieved. The delete is only performed if the Exchange is committed. If a rollback occurs, the object is not deleted. If this option is false, then the same objects will be retrieve over and over again on the polls.";
    public static final Boolean CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_DELETE_AFTER_READ_DEFAULT = true;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_DESTINATION_BUCKET_CONF = "camel.component.google-storage.destinationBucket";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_DESTINATION_BUCKET_DOC = "Define the destination bucket where an object must be moved when moveAfterRead is set to true.";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_DESTINATION_BUCKET_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_INCLUDE_BODY_CONF = "camel.component.google-storage.includeBody";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_INCLUDE_BODY_DOC = "If it is true, the Object exchange will be consumed and put into the body. If false the Object stream will be put raw into the body and the headers will be set with the object metadata.";
    public static final Boolean CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_INCLUDE_BODY_DEFAULT = true;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_INCLUDE_FOLDERS_CONF = "camel.component.google-storage.includeFolders";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_INCLUDE_FOLDERS_DOC = "If it is true, the folders/directories will be consumed. If it is false, they will be ignored, and Exchanges will not be created for those";
    public static final Boolean CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_INCLUDE_FOLDERS_DEFAULT = true;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_MOVE_AFTER_READ_CONF = "camel.component.google-storage.moveAfterRead";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_MOVE_AFTER_READ_DOC = "Move objects from the origin bucket to a different bucket after they have been retrieved. To accomplish the operation the destinationBucket option must be set. The copy bucket operation is only performed if the Exchange is committed. If a rollback occurs, the object is not moved.";
    public static final Boolean CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_MOVE_AFTER_READ_DEFAULT = false;
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.google-storage.autowiredEnabled";
    public static final String CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;

    public CamelGooglestorageSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelGooglestorageSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_PATH_BUCKET_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GOOGLESTORAGE_PATH_BUCKET_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_GOOGLESTORAGE_PATH_BUCKET_NAME_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_AUTO_CREATE_BUCKET_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_AUTO_CREATE_BUCKET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_AUTO_CREATE_BUCKET_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SERVICE_ACCOUNT_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SERVICE_ACCOUNT_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SERVICE_ACCOUNT_KEY_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_STORAGE_CLASS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_STORAGE_CLASS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_STORAGE_CLASS_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_STORAGE_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_STORAGE_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_STORAGE_CLIENT_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_STORAGE_LOCATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_STORAGE_LOCATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_STORAGE_LOCATION_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_DELETE_AFTER_READ_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_DELETE_AFTER_READ_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_DELETE_AFTER_READ_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_DESTINATION_BUCKET_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_DESTINATION_BUCKET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_DESTINATION_BUCKET_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_INCLUDE_BODY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_INCLUDE_BODY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_INCLUDE_BODY_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_INCLUDE_FOLDERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_INCLUDE_FOLDERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_INCLUDE_FOLDERS_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_MOVE_AFTER_READ_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_MOVE_AFTER_READ_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_MOVE_AFTER_READ_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_POLL_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_POLL_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_POLL_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_BACKOFF_ERROR_THRESHOLD_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_BACKOFF_IDLE_THRESHOLD_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_BACKOFF_MULTIPLIER_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_BACKOFF_MULTIPLIER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_BACKOFF_MULTIPLIER_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_DELAY_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_DELAY_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_GREEDY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_GREEDY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_GREEDY_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_INITIAL_DELAY_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_INITIAL_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_INITIAL_DELAY_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_REPEAT_COUNT_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_REPEAT_COUNT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_REPEAT_COUNT_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_RUN_LOGGING_LEVEL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_RUN_LOGGING_LEVEL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_RUN_LOGGING_LEVEL_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SCHEDULER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SCHEDULER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SCHEDULER_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SCHEDULER_PROPERTIES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SCHEDULER_PROPERTIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_SCHEDULER_PROPERTIES_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_START_SCHEDULER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_START_SCHEDULER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_START_SCHEDULER_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_TIME_UNIT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_TIME_UNIT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_TIME_UNIT_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_USE_FIXED_DELAY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_USE_FIXED_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_ENDPOINT_USE_FIXED_DELAY_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_AUTO_CREATE_BUCKET_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_AUTO_CREATE_BUCKET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_AUTO_CREATE_BUCKET_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_SERVICE_ACCOUNT_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_SERVICE_ACCOUNT_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_SERVICE_ACCOUNT_KEY_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_STORAGE_CLASS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_STORAGE_CLASS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_STORAGE_CLASS_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_STORAGE_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_STORAGE_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_STORAGE_CLIENT_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_STORAGE_LOCATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_STORAGE_LOCATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_STORAGE_LOCATION_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_DELETE_AFTER_READ_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_DELETE_AFTER_READ_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_DELETE_AFTER_READ_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_DESTINATION_BUCKET_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_DESTINATION_BUCKET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_DESTINATION_BUCKET_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_INCLUDE_BODY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_INCLUDE_BODY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_INCLUDE_BODY_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_INCLUDE_FOLDERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_INCLUDE_FOLDERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_INCLUDE_FOLDERS_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_MOVE_AFTER_READ_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_MOVE_AFTER_READ_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_MOVE_AFTER_READ_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESTORAGE_COMPONENT_AUTOWIRED_ENABLED_DOC);
        return conf;
    }
}