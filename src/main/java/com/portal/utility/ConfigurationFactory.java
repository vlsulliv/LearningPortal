package com.portal.utility;

import ch.qos.logback.classic.LoggerContext;
import org.apache.logging.log4j.core.config.ConfigurationSource;

import java.lang.module.Configuration;

public abstract class ConfigurationFactory {
    public abstract Configuration getConfiguration(LoggerContext loggerContext, ConfigurationSource source);
}
