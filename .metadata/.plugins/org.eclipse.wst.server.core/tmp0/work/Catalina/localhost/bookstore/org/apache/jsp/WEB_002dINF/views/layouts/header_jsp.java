/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.96
 * Generated at: 2024-11-04 02:54:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.layouts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<base href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/\">\r\n");
      out.write("<style>\r\n");
      out.write(".nav-link.dropdown-toggle {\r\n");
      out.write("    padding-right: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-item {\r\n");
      out.write("    padding: 12px 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-item:hover {\r\n");
      out.write("    background-color: #f8f9fa;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-item i {\r\n");
      out.write("    margin-right: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-toggle::after {\r\n");
      out.write("    display: none !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("nav.navbar {\r\n");
      out.write("    height: 60px !important; \r\n");
      out.write("    padding-top: 5px;\r\n");
      out.write("    padding-bottom: 5px;\r\n");
      out.write("    border-bottom: 1px solid #dee2e6;\r\n");
      out.write("    background-color: #ffffff; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".auth-logo img {\r\n");
      out.write("    width: 70px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topbar-menu li .avatar img {\r\n");
      out.write("    width: 40px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".toggle-btn {\r\n");
      out.write("    font-size: 1.5rem;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#sidebar.show {\r\n");
      out.write("    left: 30px; \r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-topbar navbar-expand-lg sticky-top\">\r\n");
      out.write("    <div class=\"container-fluid d-flex justify-content-between align-items-center \">\r\n");
      out.write("        <ul class=\"list-unstyled topbar-menu mb-0 d-flex align-items-center justify-content-start\">\r\n");
      out.write("            <li class=\"dropdown d-none d-sm-block\">\r\n");
      out.write("                <div class=\"auth-logo d-flex align-items-center\">\r\n");
      out.write("                    <img alt=\"Logo\" src=\"resources/images/ALDPT.png\" class=\"img-fluid\">\r\n");
      out.write("                    <span class=\"logo-name ms-2\" style=\"color: #343a40; font-size: 1.25rem; font-weight: 600; line-height: 4.5rem;\">Book\r\n");
      out.write("                        <span class=\"fw-light\">Store</span>\r\n");
      out.write("                    </span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <div class=\"toggle-btn p-5\" onclick=\"toggleSidebar()\">\r\n");
      out.write("            <i class=\"fa fa-bars\"></i>\r\n");
      out.write("        </div>\r\n");
      out.write("        <ul class=\"list-unstyled topbar-menu ms-auto mb-0 d-flex align-items-center justify-item-center fixed\">\r\n");
      out.write("            <li></li>\r\n");
      out.write("            <li class=\"dropdown\">\r\n");
      out.write("                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                    <div class=\"avatar\">\r\n");
      out.write("                        <img alt=\"User Avatar\" src=\"resources/images/ALDPT.png\" class=\"rounded-circle bg-white border border-3 border-white\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </a>\r\n");
      out.write("                <ul class=\"dropdown-menu dropdown-menu-end border-0 shadow \" aria-labelledby=\"userDropdown\">\r\n");
      out.write("                    <li class=\"text-center p-3 border-bottom mb-3\">\r\n");
      out.write("                        <div class=\"avatar avatar-xxl\">\r\n");
      out.write("                            <img alt=\"User Avatar\" src=\"resources/images/ALDPT.png\" class=\"rounded-circle bg-white border border-3 border-white\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"mt-3\">\r\n");
      out.write("                            <h5>HAHAA</h5>\r\n");
      out.write("                            <div class=\"text-muted\">p@gmail.com</div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a class=\"dropdown-item\" href=\"#\"><i class=\"fa fa-user\"></i>Profile</a></li>\r\n");
      out.write("                    <li><a class=\"dropdown-item\" href=\"#\"><i class=\"fa fa-sign-out\"></i>Sign Out</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function toggleSidebar() {\r\n");
      out.write("    const sidebar = document.getElementById(\"sidebar\");\r\n");
      out.write("    sidebar.classList.toggle(\"collapse\");\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
