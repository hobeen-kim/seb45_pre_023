package sixman.stackoverflow.global.log;

import org.slf4j.MDC;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;
import java.util.UUID;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class MDCLoggingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        UUID uuid = UUID.randomUUID();
        MDC.put("request_id", uuid.toString());
        MDC.put("email", "anonymous");
        chain.doFilter(request, response);
        MDC.clear();
    }
}
