package org.jboss.resteasy.core;

import org.jboss.resteasy.specimpl.BuiltResponse;
import org.jboss.resteasy.spi.HttpRequest;
import org.jboss.resteasy.spi.HttpResponse;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public interface ResourceInvoker
{
   BuiltResponse invoke(HttpRequest request, HttpResponse response);
   BuiltResponse invoke(HttpRequest request, HttpResponse response, Object target);
}
