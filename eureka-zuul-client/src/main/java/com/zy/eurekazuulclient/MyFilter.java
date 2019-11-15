package com.zy.eurekazuulclient;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Author czy
 * @Description
 * @Date 2019/11/15 14:05
 */
@Component
public class MyFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext rct=RequestContext.getCurrentContext();
        HttpServletRequest request = rct.getRequest();
        String token = request.getParameter("token");
        if (StringUtils.isEmpty(token)){
            rct.setSendZuulResponse(false);
            rct.setResponseStatusCode(401);
            try {
                rct.getResponse().getWriter().write("token is empty");
            } catch (IOException e) {
                return null;
            }
        }
        return null;
    }
}
