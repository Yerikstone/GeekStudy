package router;

import java.util.List;

/**
 * Http端点路由
 */
public interface HttpEndpointRouter {
    
    String route(List<String> endpoints);
    
}
