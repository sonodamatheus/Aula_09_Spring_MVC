public class AutorizadorInterceptor extends HandlerInterceptorAdapter {

@Override
public boolean preHandle(HttpServletRequest request,

HttpServletResponse response,
Object controller) throws Exception {
if(uri.endsWith("loginForm") || uri.endsWith("fazer_login") ||
uri.contains("css") || uri.contains("js") ||
uri.contains("img")){

return true;

}
if(request.getSession().getAttribute("usuarioLogado") != null) {

return true;

}
response.sendRedirect("loginForm");
return false;

}

}