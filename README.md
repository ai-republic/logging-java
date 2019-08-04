# logging-java
Extensions for java.util.logging.Logger including annotation based configuration.

You can simply configure the Logger like this:

<p>
<code>@Inject</code><br>
<code>@LoggerConfig(level=LogLevel.INFO)</code><br>
<code>private Logger logger;</code><br>
</p>

or for a more complex configuration:

<p>
<code>@Inject</code><br>
<code>@LoggerConfig(level=LogLevel.INFO, handler=java.util.logging.ConsoleHandler.class, filter=MyFilter.class, resource=@Resource(baseName="myresourcebundlename", locale="de-DE"))</code><br>
<code>private Logger logger;</code><br>
</p>
