package com.jaspersoft.jasperserver.jaxrs.client.core.exceptions;

import com.jaspersoft.jasperserver.jaxrs.client.dto.common.ErrorDescriptor;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

/**
 * Unit tests for {@link com.jaspersoft.jasperserver.jaxrs.client.core.exceptions.NotAFileException}
 */
public class NotAppTestFileExceptionTest {

    @Test
    public void should_invoke_parent_constructor() {
        NotAFileException exception = new NotAFileException();
        assertNotNull(exception.getErrorDescriptors());
    }

    @Test
    public void should_pass_message_to_parent_class() {
        NotAFileException exception = new NotAFileException("msg");
        assertEquals("msg", exception.getMessage());
    }

    @Test
    public void should_pass_message_and_descriptors_to_parent_class() {
        List<ErrorDescriptor> expected = new ArrayList<ErrorDescriptor>();
        NotAFileException exception = new NotAFileException("msg", expected);
        assertEquals(expected, exception.getErrorDescriptors());
        assertEquals("msg", exception.getMessage());
    }
}