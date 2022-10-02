package com.portal.utility;

import ch.qos.logback.classic.LoggerContext;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Order;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.xml.XmlConfiguration;

import java.lang.module.Configuration;

@Plugin(name = "XMLConfigurationFactory", category = "ConfigurationFactory")
@Order(5)

public class XMLConfigurationFactory extends ConfigurationFactory {
/**
 * Valid file extensions for XML files.
 */
    public static final String[] SUFFIXES = new String[] {".xml", "*"};

    /**
     * Returns the Configuration.
     * @param loggerContext The logger context.
     * @param source The InputSource.
     * @return The Configuration.
     */
    @Override
    public Configuration getConfiguration(final LoggerContext loggerContext, final ConfigurationSource source) {
//        return new XmlConfiguration(loggerContext, source);
        return null;
    }

    /**
     * Returns the file suffixes for XML files.
     * @return An array of File extensions.
     */
    public String[] getSupportedTypes() {
        return SUFFIXES;
    }
}
