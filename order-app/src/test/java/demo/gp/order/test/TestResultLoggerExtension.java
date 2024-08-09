package demo.gp.order.test;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.tinylog.Logger;

import java.util.Optional;

public class TestResultLoggerExtension implements TestWatcher {

    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        Logger.info("Test Disabled for test {}: with reason :- {}",
                context.getDisplayName(),
                reason.orElse("No reason"));
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        Logger.info("Test Successful for test {}: ", context.getDisplayName());
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        Logger.info("Test Aborted for test {}: ", context.getDisplayName());
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        Logger.info("Test Failed for test {}: ", context.getDisplayName());
    }
}
