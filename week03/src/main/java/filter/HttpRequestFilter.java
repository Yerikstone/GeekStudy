package filter;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpRequest;

/**
 * 过滤器接口类
 */
public interface HttpRequestFilter {
    
    void filter(FullHttpRequest fullRequest, ChannelHandlerContext ctx);
    
}
