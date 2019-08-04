import javax.enterprise.inject.spi.Extension;

import com.airepublic.logging.java.LoggingExtension;

module com.airepublic.logging.java {
    exports com.airepublic.logging.java;

    requires jakarta.enterprise.cdi.api;
    requires jakarta.inject;
    requires transitive java.logging;

    opens com.airepublic.logging.java;

    provides Extension with LoggingExtension;
}